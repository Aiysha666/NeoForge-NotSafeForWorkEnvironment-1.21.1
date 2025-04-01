package net.aiysha666.nsfwenvironment.item;

import net.aiysha666.nsfwenvironment.NSFWEnviroment;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NSFWEnviroment.MOD_ID);

        public static final DeferredItem<Item> SILLYSHARD = ITEMS.register("silly_shard",
                () -> new Item(new Item.Properties()));
        public static final DeferredItem<Item> SILLYCRYSTAL =ITEMS.register("silly_crystal",
                () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
