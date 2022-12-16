package net.ekksia.testmod.items;

import net.ekksia.testmod.TestMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TANZANITE = FabricItemGroup.builder(new Identifier(TestMod.MOD_ID, "tanzanite")).build();
}
