package com.dolt.portfolio;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PortfolioPaintings {
    public static DeferredRegister<PaintingVariant> PAINTINGS = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, Portfolio.MOD_ID);
    
    private static RegistryObject<PaintingVariant> register(String name, int width, int height) {
        return PAINTINGS.register(name, () -> new PaintingVariant(width, height));
    }

    	public static final RegistryObject<PaintingVariant> PARROT = register("parrot", 32, 32);
	public static final RegistryObject<PaintingVariant> BOSCAGE = register("boscage", 48, 16);
	public static final RegistryObject<PaintingVariant> LIFE_CYCLE = register("life_cycle", 48, 48);
	public static final RegistryObject<PaintingVariant> ENDY_WARHOL = register("endy_warhol", 48, 48);
	public static final RegistryObject<PaintingVariant> SUNFLOWER = register("sunflower", 16, 48);
	public static final RegistryObject<PaintingVariant> ROSEMALLING = register("rosemalling", 16, 32);
	public static final RegistryObject<PaintingVariant> RAINBOWS_ALT = register("rainbows_alt", 64, 48);
	public static final RegistryObject<PaintingVariant> ANCESTOR = register("ancestor", 48, 32);
	public static final RegistryObject<PaintingVariant> AQUACULTURE = register("aquaculture", 32, 32);
	public static final RegistryObject<PaintingVariant> GEARS = register("gears", 48, 16);
	public static final RegistryObject<PaintingVariant> ICONOGRAPHY = register("iconography", 16, 32);
	public static final RegistryObject<PaintingVariant> RAINBOWS = register("rainbows", 64, 48);
	public static final RegistryObject<PaintingVariant> FARLANDER = register("farlander", 16, 48);
	public static final RegistryObject<PaintingVariant> THE_TREACHERY_OF_IMAGES = register("the_treachery_of_images", 48, 32);
	public static final RegistryObject<PaintingVariant> HARVEST_MOON = register("harvest_moon", 32, 48);
	public static final RegistryObject<PaintingVariant> SQUID_GAMES = register("squid_games", 16, 32);
	public static final RegistryObject<PaintingVariant> PERENNIAL = register("perennial", 16, 16);
	public static final RegistryObject<PaintingVariant> DREAM_SCENERY = register("dream_scenery", 48, 64);
	public static final RegistryObject<PaintingVariant> MACABRE_ALT = register("macabre_alt", 32, 32);
	public static final RegistryObject<PaintingVariant> ALPHA = register("alpha", 16, 16);
	public static final RegistryObject<PaintingVariant> AETHER = register("aether", 32, 32);
	public static final RegistryObject<PaintingVariant> TRAVELLER = register("traveller", 32, 32);
	public static final RegistryObject<PaintingVariant> DISTANT_PEAKS = register("distant_peaks", 32, 48);
	public static final RegistryObject<PaintingVariant> RISING_SUN_AND_FADING_DEATH = register("rising_sun_and_fading_death", 16, 32);
	public static final RegistryObject<PaintingVariant> UNDERWORLD = register("underworld", 48, 64);
	public static final RegistryObject<PaintingVariant> MORNING_ON_THE_SEINE = register("morning_on_the_seine", 32, 48);
	public static final RegistryObject<PaintingVariant> BEST_FRIEND = register("best_friend", 32, 48);
	public static final RegistryObject<PaintingVariant> RANA = register("rana", 32, 48);
	public static final RegistryObject<PaintingVariant> VOID_MANOR = register("void_manor", 32, 48);
	public static final RegistryObject<PaintingVariant> FILM = register("film", 16, 32);
	public static final RegistryObject<PaintingVariant> DRIPPY = register("drippy", 64, 16);
	public static final RegistryObject<PaintingVariant> GREATSWORD = register("greatsword", 16, 48);
	public static final RegistryObject<PaintingVariant> OPERATOR = register("operator", 32, 32);
	public static final RegistryObject<PaintingVariant> CAT = register("cat", 16, 32);
	public static final RegistryObject<PaintingVariant> NULL = register("null", 32, 32);
	public static final RegistryObject<PaintingVariant> STATUE = register("statue", 64, 48);
	public static final RegistryObject<PaintingVariant> BLOSSOMS = register("blossoms", 32, 16);
	public static final RegistryObject<PaintingVariant> WE_NEED_TO_GO_DEEPER = register("we_need_to_go_deeper", 48, 32);
	public static final RegistryObject<PaintingVariant> STALKS = register("stalks", 16, 48);
	public static final RegistryObject<PaintingVariant> WINDMILL_FIELD = register("windmill_field", 48, 32);
	public static final RegistryObject<PaintingVariant> MOUNTAINS = register("mountains", 64, 16);
	public static final RegistryObject<PaintingVariant> BEACHSIDE = register("beachside", 64, 16);
	public static final RegistryObject<PaintingVariant> HEARTBEAT = register("heartbeat", 32, 32);
	public static final RegistryObject<PaintingVariant> RED_DAWN = register("red_dawn", 32, 16);
	public static final RegistryObject<PaintingVariant> MELON = register("melon", 16, 16);
	public static final RegistryObject<PaintingVariant> CHERRY_MOON = register("cherry_moon", 32, 64);
	public static final RegistryObject<PaintingVariant> SANDSTONES = register("sandstones", 16, 48);
	public static final RegistryObject<PaintingVariant> EYE = register("eye", 48, 16);
	public static final RegistryObject<PaintingVariant> JOURNEYS_END = register("journeys_end", 64, 64);
	public static final RegistryObject<PaintingVariant> WAVES = register("waves", 48, 48);
	public static final RegistryObject<PaintingVariant> BETA = register("beta", 16, 16);
	public static final RegistryObject<PaintingVariant> MACROCOSM = register("macrocosm", 32, 32);
	public static final RegistryObject<PaintingVariant> SUNRISE_SPARSE = register("sunrise_sparse", 32, 16);
	public static final RegistryObject<PaintingVariant> RAINBOWS_TRANS = register("rainbows_trans", 64, 48);
	public static final RegistryObject<PaintingVariant> ANCHOR = register("anchor", 48, 48);
	public static final RegistryObject<PaintingVariant> STILL_LIFE = register("still_life", 16, 16);
	public static final RegistryObject<PaintingVariant> MACABRE = register("macabre", 32, 32);
	public static final RegistryObject<PaintingVariant> PYRAMID = register("pyramid", 48, 32);
	public static final RegistryObject<PaintingVariant> FOX = register("fox", 16, 48);
	public static final RegistryObject<PaintingVariant> BUBBLES = register("bubbles", 16, 16);
	public static final RegistryObject<PaintingVariant> POST_MORTEM = register("post_mortem", 32, 16);
	public static final RegistryObject<PaintingVariant> DEATH = register("death", 48, 48);
	public static final RegistryObject<PaintingVariant> JUSTICE = register("justice", 64, 64);
	public static final RegistryObject<PaintingVariant> MOONLIGHT_TOWER = register("moonlight_tower", 32, 48);
	public static final RegistryObject<PaintingVariant> CARICATURE = register("caricature", 32, 64);
	public static final RegistryObject<PaintingVariant> BLISS = register("bliss", 16, 32);
	public static final RegistryObject<PaintingVariant> PICTURESQUE = register("picturesque", 64, 32);
	public static final RegistryObject<PaintingVariant> JAZZ_TOWN = register("jazz_town", 16, 32);
	public static final RegistryObject<PaintingVariant> STORM = register("storm", 64, 48);
	public static final RegistryObject<PaintingVariant> SLIME_CHUNK = register("slime_chunk", 48, 32);

} 
    