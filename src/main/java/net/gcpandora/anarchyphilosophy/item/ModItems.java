package net.gcpandora.anarchyphilosophy.item;

import net.gcpandora.anarchyphilosophy.AnarchyPhilosophy;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AnarchyPhilosophy.MOD_ID);

    //Enter custom blocks here:

    public static final DeferredItem<Item> INFINITE_CHAOS_PEARL = ITEMS.register("infinite_chaos_pearl",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> YLLIUM = ITEMS.register("yllium",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
