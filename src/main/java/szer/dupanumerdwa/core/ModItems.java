package szer.dupanumerdwa.core;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import szer.dupanumerdwa.Dupanumerdwa;
import szer.dupanumerdwa.common.items.CustomItem;
import szer.dupanumerdwa.common.items.ModArmorMaterials;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Dupanumerdwa.MODID);

    public static final CreativeModeTab TAB = new CreativeModeTab(Dupanumerdwa.MODID)   {
        @Override
        public ItemStack makeIcon() {
            return Items.SLIME_BALL.getDefaultInstance();
        }
    };

    public static final RegistryObject<Item> TEST_BLOCK = ITEMS.register("test_block", () -> new BlockItem(ModBlock.TEST_BLOCK.get(),new Item.Properties().tab(TAB)));
    public static final RegistryObject<Item> CUSTOM_BLOCK = ITEMS.register("custom_block", () -> new BlockItem(ModBlock.CUSTOM_BLOCK.get(),new Item.Properties().tab(TAB)));

    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", () -> new Item (new Item.Properties().fireResistant() .tab(TAB)) );
    public static final RegistryObject<Item> CUSTOM_ITEM = ITEMS.register("custom_item", () -> new CustomItem(new Item.Properties().tab(TAB)) );

    public static final RegistryObject<Item>  COPPER_ALLOY = ITEMS.register("copper_alloy", () -> new Item (new Item.Properties().tab(TAB)) );

    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.HEAD,
            new Item.Properties().tab(TAB)));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.CHEST,
            new Item.Properties().tab(TAB)));
    public static final RegistryObject<Item> COPPER_LEGGING = ITEMS.register("copper_legging", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.LEGS,
            new Item.Properties().tab(TAB)));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.FEET,
            new Item.Properties().tab(TAB)));


}
