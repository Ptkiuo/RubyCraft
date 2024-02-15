package com.ptk671.rubycraft;

import fuels.RegistryAllFuels;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;


public class Rubycraft implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    public static String MOD_ID = "rubycraft";

  /*  public static Identifier id(String patch)
    {
        return new Identifier(Rubycraft.MOD_ID,patch);
    }
*/
    public static Item teuwds;

    public static Item getTeuwds() {
        return teuwds;

    }

    @Override
    public void onInitialize() {
        //全アイテム/ブロック登録
        RegistryAllitems.register();

        //燃料の登録
        RegistryAllFuels.register();
    }

}
