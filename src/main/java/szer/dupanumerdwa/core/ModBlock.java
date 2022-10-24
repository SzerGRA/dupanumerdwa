package szer.dupanumerdwa.core;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import szer.dupanumerdwa.Dupanumerdwa;
import szer.dupanumerdwa.common.blocks.CustomBlock;

public class ModBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Dupanumerdwa.MODID);

    public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register( "test_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> CUSTOM_BLOCK = BLOCKS.register( "custom_block", () -> new CustomBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK)));
}
