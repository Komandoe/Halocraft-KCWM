package net.killerchief.halocraft.comm.packetHandlers;

import io.netty.buffer.ByteBuf;
import net.killerchief.halocraft.tileEntities.TileEntityGunHolder;
import net.minecraft.entity.player.EntityPlayerMP;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;

public class PacketGunHolder implements IMessage {

	private int X;
	private int Y;
	private int Z;
	private byte btnVal;

	public PacketGunHolder() { }

	public PacketGunHolder(int x, int y, int z, byte btnval) {
		this.X = x;
		this.Y = y;
		this.Z = z;
		this.btnVal = btnval;
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(this.X);
		buf.writeInt(this.Y);
		buf.writeInt(this.Z);
		buf.writeByte(this.btnVal);
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.X = buf.readInt();
		this.Y = buf.readInt();
		this.Z = buf.readInt();
		this.btnVal = buf.readByte();
	}

	public static class Handler implements IMessageHandler<PacketGunHolder, IMessage>
	{
		@Override
		public IMessage onMessage(PacketGunHolder message, MessageContext ctx)
		{
			if (ctx.side == Side.SERVER) {
				EntityPlayerMP player = ctx.getServerHandler().playerEntity;
				if (player.worldObj.getTileEntity(message.X, message.Y, message.Z) instanceof TileEntityGunHolder)
				{
					TileEntityGunHolder tileentity = ((TileEntityGunHolder)player.worldObj.getTileEntity(message.X, message.Y, message.Z));

					if (message.btnVal != 0)
					{
						if (message.btnVal == 20)
						{
							tileentity.MountSwapSide();
						}
						else if (message.btnVal == 21)
						{
							tileentity.MountRotate();
						}
						else if (message.btnVal == 1)
						{
							tileentity.incrementRotationXGun(1);
						}
						else if (message.btnVal == 2)
						{
							tileentity.incrementRotationXGun(-1);
						}
						else if (message.btnVal == 3)
						{
							tileentity.incrementRotationYGun(1);
						}
						else if (message.btnVal == 4)
						{
							tileentity.incrementRotationYGun(-1);
						}
						else if (message.btnVal == 5)
						{
							tileentity.incrementRotationZGun(1);
						}
						else if (message.btnVal == 6)
						{
							tileentity.incrementRotationZGun(-1);
						}
						else if (message.btnVal == -1)
						{
							tileentity.incrementTranslationXGun(1);
						}
						else if (message.btnVal == -2)
						{
							tileentity.incrementTranslationXGun(-1);
						}
						else if (message.btnVal == -3)
						{
							tileentity.incrementTranslationYGun(1);
						}
						else if (message.btnVal == -4)
						{
							tileentity.incrementTranslationYGun(-1);
						}
						else if (message.btnVal == -5)
						{
							tileentity.incrementTranslationZGun(1);
						}
						else if (message.btnVal == -6)
						{
							tileentity.incrementTranslationZGun(-1);
						}
					}
				}
			}
			return null; // no response in this case
		}
	}
}
