package mod.techdinosauresandmagic.neoforge.item;


import mod.techdinosauresandmagic.Techdinosauresandmagic;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Techdinosauresandmagic.MOD_ID);

    public static final DeferredItem<Item> TEST_BLOCK = ITEMS.register("test_block",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
