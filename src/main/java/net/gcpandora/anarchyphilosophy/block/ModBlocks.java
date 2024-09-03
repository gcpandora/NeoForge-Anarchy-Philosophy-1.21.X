package net.gcpandora.anarchyphilosophy.block;

import net.gcpandora.anarchyphilosophy.AnarchyPhilosophy;
import net.gcpandora.anarchyphilosophy.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.RegisterEvent;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(AnarchyPhilosophy.MOD_ID);

    //Enter custom blocks here:

    public static final DeferredBlock<Block> YLLIUM_ORE = registerBlock(
        "yllium_ore",
        () -> new Block(BlockBehaviour.Properties.of()
                .requiresCorrectToolForDrops()
                .strength(3f)
        )
    );




    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toRetrun = BLOCKS.register(name, block);
        registerBlockItem(name, toRetrun);
        return toRetrun;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
    ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
}

    public static void register(IEventBus eventBus){
        BLOCKS.register (eventBus);
    }
}
