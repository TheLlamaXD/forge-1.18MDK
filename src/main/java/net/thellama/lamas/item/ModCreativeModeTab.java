package net.thellama.lamas.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab Llamas_Adventures_TAB = new CreativeModeTab("llamasadventurescreativemodetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CURLEW_FEATHER.get());
        }
    };
}
