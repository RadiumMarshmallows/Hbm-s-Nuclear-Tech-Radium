package com.hbm.inventory.container;

import com.hbm.inventory.SlotSmelting;
import com.hbm.tileentity.machine.TileEntityMachineArcFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerMachineArcFurnace extends Container {

	private TileEntityMachineArcFurnace diFurnace;

	public ContainerMachineArcFurnace(InventoryPlayer invPlayer, TileEntityMachineArcFurnace tedf) {

		diFurnace = tedf;

		this.addSlotToContainer(new Slot(tedf, 0, 56, 17));
		this.addSlotToContainer(new SlotSmelting(invPlayer.player, tedf, 1, 116, 35));
		this.addSlotToContainer(new Slot(tedf, 2, 38, 53));
		this.addSlotToContainer(new Slot(tedf, 3, 56, 53));
		this.addSlotToContainer(new Slot(tedf, 4, 74, 53));
		this.addSlotToContainer(new Slot(tedf, 5, 8, 53));

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 9; j++) {
				this.addSlotToContainer(new Slot(invPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}

		for(int i = 0; i < 9; i++) {
			this.addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18, 142));
		}
	}

	@Override
	public void addCraftingToCrafters(ICrafting crafting) {
		super.addCraftingToCrafters(crafting);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int par2) {
		ItemStack var3 = null;
		Slot var4 = (Slot) this.inventorySlots.get(par2);

		if(var4 != null && var4.getHasStack()) {
			ItemStack var5 = var4.getStack();
			var3 = var5.copy();

			if(par2 <= 5) {
				if(!this.mergeItemStack(var5, 6, this.inventorySlots.size(), true)) {
					return null;
				}
				
				var4.onSlotChange(var5, var3);
				
			} else if(!this.mergeItemStack(var5, 0, 1, false)) {
				if(!this.mergeItemStack(var5, 2, 6, false))
					return null;
			}

			if(var5.stackSize == 0) {
				var4.putStack((ItemStack) null);
			} else {
				var4.onSlotChanged();
			}
		}

		return var3;
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return diFurnace.isUseableByPlayer(player);
	}
}
