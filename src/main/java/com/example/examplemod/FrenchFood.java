package com.example.examplemod;

import java.util.Arrays;
import java.util.Collection;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class FrenchFood {
	public static RegistryObject<Item> BUTTER;
	public static RegistryObject<Item> PASTRY_DOUGH;
	public static RegistryObject<Item> SALT;

	public static RegistryObject<Item> KOUIGN_AMANN;
	public static RegistryObject<Item> CROISSANT;
	public static RegistryObject<Item> PAIN_AU_CHOCOLAT;
	public static RegistryObject<Item> JAMBON_BEURRE;
	public static RegistryObject<Item> FRENCH_FRIES;
	public static RegistryObject<Item> STEAK_FRITES;
	public static RegistryObject<Item> POT_AU_FEU;

	public FrenchFood(DeferredRegister<Item> register) {
		FrenchFood.register(register);
	}

	private static void register(DeferredRegister<Item> register) {
		BUTTER = register.register("butter", () -> new Item(new Item.Properties()));

		PASTRY_DOUGH = register.register("pastry_dough", () -> new Item(new Item.Properties()));

		SALT = register.register("salt", () -> new Item(new Item.Properties()));

		KOUIGN_AMANN = register.register("kouign_amann", () -> new Item(new Item.Properties()
				.food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build())));

		CROISSANT = register.register("croissant", () -> new Item(new Item.Properties()
				.food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build())));

		PAIN_AU_CHOCOLAT = register.register("pain_au_chocolat", () -> new Item(new Item.Properties()
				.food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build())));

		JAMBON_BEURRE = register.register("jambon_beurre", () -> new Item(new Item.Properties()
				.food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build())));

		FRENCH_FRIES = register.register("french_fries", () -> new Item(new Item.Properties()
				.food(new FoodProperties.Builder().nutrition(2).saturationMod(2).build())));

		STEAK_FRITES = register.register("steak_frites", () -> new Item(new Item.Properties()
				.food(new FoodProperties.Builder().nutrition(6).saturationMod(1).build())));

		POT_AU_FEU = register.register("pot_au_feu", () -> new Item(new Item.Properties()
				.food(new FoodProperties.Builder().nutrition(8).saturationMod(1).build())));
	}

	public static Collection<ItemStack> getAll() {
		return Arrays.asList(
				BUTTER.get().getDefaultInstance(),
				PASTRY_DOUGH.get().getDefaultInstance(),
				SALT.get().getDefaultInstance(),
				KOUIGN_AMANN.get().getDefaultInstance(),
				CROISSANT.get().getDefaultInstance(),
				PAIN_AU_CHOCOLAT.get().getDefaultInstance(),
				JAMBON_BEURRE.get().getDefaultInstance(),
				FRENCH_FRIES.get().getDefaultInstance(),
				STEAK_FRITES.get().getDefaultInstance(),
				POT_AU_FEU.get().getDefaultInstance());
	}
}
