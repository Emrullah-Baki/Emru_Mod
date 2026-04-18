package net.emru27.tutorialmod.item;

import net.emru27.tutorialmod.Tutorialmod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Tutorialmod.MOD_ID);

    public static final RegistryObject<Item> BANANA = ITEMS.register("banana",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_ORE = ITEMS.register("purple_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHICK = ITEMS.register("chick",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
