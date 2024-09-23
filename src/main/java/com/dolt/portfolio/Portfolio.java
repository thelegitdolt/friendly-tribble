package com.dolt.portfolio;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.dolt.portfolio.Portfolio.MOD_ID;

@Mod(MOD_ID)
public class Portfolio {
    public static final String MOD_ID = "portfolio";

    public Portfolio() {
        IEventBus Bus = FMLJavaModLoadingContext.get().getModEventBus();
        PortfolioPaintings.PAINTINGS.register(Bus);
    }
}