package fr.fiesta.example;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Example.MOD_ID)
public class Example {
    public static final String MOD_ID = "example";
        public Example() {
            FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
            FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

            IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        }

    private void setup(FMLCommonSetupEvent event) {
    }

    private void clientSetup(FMLClientSetupEvent event) {
    }
}
