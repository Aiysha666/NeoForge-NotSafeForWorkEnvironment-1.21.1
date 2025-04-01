package net.aiysha666.unsafeworkpractises.item;

import net.aiysha666.unsafeworkpractises.unsafeworkpractises;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(unsafeworkpractises.MOD_ID);

        // INGREDIENTS
        public static final DeferredItem<Item> SILLYSHARD = ITEMS.register("silly_shard",
                () -> new Item(new Item.Properties()));
        public static final DeferredItem<Item> SILLYCRYSTAL = ITEMS.register("silly_crystal",
                () -> new Item(new Item.Properties()));

        // WEAPONS

        // TOOLS
        public static final DeferredItem<Item> SILLYCRYSTALAXE = ITEMS.register("silly_crystal_axe",
                () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
