
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
public class VilastasiaZehirliMetaliItem extends VilastasiaModModElements.ModElement {
	@ObjectHolder("vilastasia_mod:vilastasia_zehirli_metali")
	public static final Item block = null;
	public VilastasiaZehirliMetaliItem(VilastasiaModModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.RARE));
			setRegistryName("vilastasia_zehirli_metali");
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
			list.add(new StringTextComponent(
					"Bunda garip bir\u015Feyler var... eski bir uygarl\u0131\u011F\u0131n kal\u0131nt\u0131s\u0131 gibi... farkl\u0131 bir uygarl\u0131\u011F\u0131n..."));
		}
	}
}
