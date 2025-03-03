package com.ptk671.rubycraft;

import com.ptk671.rubycraft.fuels.Fuels;
import com.ptk671.rubycraft.itemgroup.CreativeTabs;
import com.ptk671.rubycraft.world.OreRegistry;
import net.fabricmc.api.ModInitializer;
import net.pitan76.mcpitanlib.api.registry.WorldGenRegistry;
import net.pitan76.mcpitanlib.api.registry.v2.CompatRegistryV2;
import net.pitan76.mcpitanlib.api.util.CompatIdentifier;

public class RubyCraft implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    public static String MOD_ID = "rubycraft";
    public static CompatRegistryV2 registry = CompatRegistryV2.create(MOD_ID);
    public static WorldGenRegistry worldGenRegistry = WorldGenRegistry.createRegistry(registry.cr1);

    public static CompatIdentifier id(String patch) {
        return new CompatIdentifier(RubyCraft.MOD_ID, patch);
    }

    @Override
    public void onInitialize() {
        // クリエイティブタブの登録
        CreativeTabs.register();

        // コンテナの登録
        ScreenHandlers.register();

        // アイテム登録
        Items.registry();

        // ブロック登録
        Blocks.registry();

        // 鉱石の追加
        OreRegistry.register();

        // ブロックエンティティの登録
        BlockEntities.register();

        // 燃料の登録
        Fuels.register();

        registry.allRegister();
    }
}
