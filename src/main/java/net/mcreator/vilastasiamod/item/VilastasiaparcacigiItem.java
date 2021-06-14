
package net.mcreator.vilastasiamod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.vilastasiamod.VilastasiaModModElements;

import java.util.List;

@VilastasiaModModElements.ModElement.Tag
public class VilastasiaparcacigiItem extends VilastasiaModModElements.ModElement {
	@ObjectHolder("vilastasia_mod:vilastasiaparcacigi")
	public static final Item block = null;
	public VilastasiaparcacigiItem(VilastasiaModModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.UNCOMMON));
			setRegistryName("vilastasiaparcacigi");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Garip kokuyor... Zehir yay\u0131yor... Tarih kap\u0131lar\u0131n\u0131 a\u00E7\u0131yor..."));
		}
	}
}
