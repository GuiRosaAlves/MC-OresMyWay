package com.oresmyway.util;

import com.oresmyway.OresMyWay;
import com.oresmyway.items.ItemModel;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.*;


public class RegistryHandler
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OresMyWay.MOD_ID);
	
	public static final RegistryObject<Item> OVERCHARGEDLAPIS = ITEMS.register("overchargedlapis", ItemModel::new);
	
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
}
