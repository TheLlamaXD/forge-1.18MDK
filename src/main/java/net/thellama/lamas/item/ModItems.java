package net.thellama.lamas.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thellama.lamas.LlamasAdventuresMod;
import net.thellama.lamas.entity.ModEntityTypes;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LlamasAdventuresMod.MOD_ID);

    public static final RegistryObject<Item> CURLEW_FEATHER = ITEMS.register("curlew_feather",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Llamas_Adventures_TAB)));

    public static final RegistryObject<ForgeSpawnEggItem> WANDERBIRD_SPAWN_EGG = ITEMS.register("snipe_bird_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.WANDERBIRD,0x948e8d, 0x3b3635,
                    new Item.Properties().tab(ModCreativeModeTab.Llamas_Adventures_TAB)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
