package szer.dupanumerdwa.common.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.horse.ZombieHorse;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class CustomBlock extends Block {
    public CustomBlock(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        player.setPos(player.getX(), player.getY() +4, player.getZ());
        return super.use(state, level, pos, player, hand, result);


    }

    @Override
    public void playerDestroy(Level level, Player p_49828_, BlockPos pos, BlockState p_49830_, @Nullable BlockEntity p_49831_, ItemStack p_49832_) {
        Zombie zombie = EntityType.ZOMBIE.create(level);
        zombie.setPos(pos.getX(), pos.getY(), pos.getX());
        level.addFreshEntity(zombie);
        super.playerDestroy(level, p_49828_, pos, p_49830_, p_49831_, p_49832_);
    }
}
