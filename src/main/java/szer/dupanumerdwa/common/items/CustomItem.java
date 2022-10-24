package szer.dupanumerdwa.common.items;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CustomItem extends Item {
    public CustomItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        player.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 200,2));
        if (world.isClientSide) {
            world.addParticle(ParticleTypes.ASH, player.getX(), player.getY(), player.getZ(), 1, 0, 1);
        }
        return super.use(world, player, hand);
    }
}
