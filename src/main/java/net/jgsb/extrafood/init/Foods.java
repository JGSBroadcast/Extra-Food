package net.jgsb.extrafood.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.jgsb.extrafood.Reference;

public class Foods {

	public static Item bagel;
	public static Item bread_slice;
	public static Item cheese;
	public static Item cheese_pizza;
	public static Item cheese_slice;
	public static Item cheeseburger;
	public static Item chicken_nugget;
	public static Item chocolate_donut;
	public static Item creamcheese_bagel;
	public static Item donut;
	public static Item dough;
	public static Item fries;
	public static Item hershey;
	public static Item hotdog;
	public static Item milkshake;
	public static Item pepperoni;
	public static Item pepperoni_pizza;
	public static Item sandwich;
	public static Item soda;
	public static Item sprinkled_donut;
	public static Item toast;
	public static Item vanilla_donut;

	public static void init(){

		bagel = new ItemFood(4, 0.8F, false).setUnlocalizedName("bagel");
		bread_slice = new ItemFood(1, 0.8F, false).setUnlocalizedName("bread_slice");
		cheese = new ItemFood(3, 0.8F, false).setUnlocalizedName("cheese");
		cheese_pizza = new ItemFood(5, 0.8F, false).setUnlocalizedName("cheese_pizza");
		cheese_slice = new ItemFood(1, 0.8F, false).setUnlocalizedName("cheese_slice");
		cheeseburger = new ItemFood(6, 0.8F, false).setUnlocalizedName("cheeseburger");
		chicken_nugget = new ItemFood(4, 0.8F, true).setUnlocalizedName("chicken_nugget");
		chocolate_donut = new ItemFood(4, 0.8F, false).setUnlocalizedName("chocolate_donut");
		creamcheese_bagel = new ItemFood(5, 0.8F, false).setUnlocalizedName("creamcheese_bagel");
		donut = new ItemFood(2, 0.8F, false).setUnlocalizedName("donut");
		dough = new Item().setUnlocalizedName("dough");
		fries = new ItemFood(5, 0.8F, false).setUnlocalizedName("fries");
		hershey = new ItemFood(4, 0.8F, false).setUnlocalizedName("hershey");
		hotdog = new ItemFood(6, 0.8F, false).setUnlocalizedName("hotdog");
		milkshake = new ItemFood(3, 0.8F, false).setUnlocalizedName("milkshake");
		pepperoni = new ItemFood(2, 0.8F, true).setUnlocalizedName("pepperoni");
		pepperoni_pizza = new ItemFood(6, 0.8F, false).setUnlocalizedName("pepperoni_pizza");
		sandwich = new ItemFood(6, 0.8F, false).setUnlocalizedName("sandwich");
		soda = new ItemFood(3, 0.8F, false).setUnlocalizedName("soda");
		sprinkled_donut = new ItemFood(5, 0.8F, false).setUnlocalizedName("sprinkled_donut");
		toast = new ItemFood(6, 0.8F, false).setUnlocalizedName("toast");
		vanilla_donut = new ItemFood(4, 0.8F, false).setUnlocalizedName("vanilla_donut");

	}

	public static void register(){

		GameRegistry.register(bagel, new ResourceLocation(Reference.MOD_ID, bagel.getUnlocalizedName().substring(5)));
		GameRegistry.register(bread_slice, new ResourceLocation(Reference.MOD_ID, bread_slice.getUnlocalizedName().substring(5)));
		GameRegistry.register(cheese, new ResourceLocation(Reference.MOD_ID, cheese.getUnlocalizedName().substring(5)));
		GameRegistry.register(cheese_pizza, new ResourceLocation(Reference.MOD_ID, cheese_pizza.getUnlocalizedName().substring(5)));
		GameRegistry.register(cheese_slice, new ResourceLocation(Reference.MOD_ID, cheese_slice.getUnlocalizedName().substring(5)));
		GameRegistry.register(cheeseburger, new ResourceLocation(Reference.MOD_ID, cheeseburger.getUnlocalizedName().substring(5)));
		GameRegistry.register(chicken_nugget, new ResourceLocation(Reference.MOD_ID, chicken_nugget.getUnlocalizedName().substring(5)));
		GameRegistry.register(chocolate_donut, new ResourceLocation(Reference.MOD_ID, chocolate_donut.getUnlocalizedName().substring(5)));
		GameRegistry.register(creamcheese_bagel, new ResourceLocation(Reference.MOD_ID, creamcheese_bagel.getUnlocalizedName().substring(5)));
		GameRegistry.register(donut, new ResourceLocation(Reference.MOD_ID, donut.getUnlocalizedName().substring(5)));
		GameRegistry.register(dough, new ResourceLocation(Reference.MOD_ID, dough.getUnlocalizedName().substring(5)));
		GameRegistry.register(fries, new ResourceLocation(Reference.MOD_ID, fries.getUnlocalizedName().substring(5)));
		GameRegistry.register(hershey, new ResourceLocation(Reference.MOD_ID, hershey.getUnlocalizedName().substring(5)));
		GameRegistry.register(hotdog, new ResourceLocation(Reference.MOD_ID, hotdog.getUnlocalizedName().substring(5)));
		GameRegistry.register(milkshake, new ResourceLocation(Reference.MOD_ID, milkshake.getUnlocalizedName().substring(5)));
		GameRegistry.register(pepperoni, new ResourceLocation(Reference.MOD_ID, pepperoni.getUnlocalizedName().substring(5)));
		GameRegistry.register(pepperoni_pizza, new ResourceLocation(Reference.MOD_ID, pepperoni_pizza.getUnlocalizedName().substring(5)));
		GameRegistry.register(sandwich, new ResourceLocation(Reference.MOD_ID, sandwich.getUnlocalizedName().substring(5)));
		GameRegistry.register(soda, new ResourceLocation(Reference.MOD_ID, soda.getUnlocalizedName().substring(5)));
		GameRegistry.register(sprinkled_donut, new ResourceLocation(Reference.MOD_ID, sprinkled_donut.getUnlocalizedName().substring(5)));
		GameRegistry.register(toast, new ResourceLocation(Reference.MOD_ID, toast.getUnlocalizedName().substring(5)));
		GameRegistry.register(vanilla_donut, new ResourceLocation(Reference.MOD_ID, vanilla_donut.getUnlocalizedName().substring(5)));
		
		
	}

	public static void registerRenders(){

		registerRender(bagel);
		registerRender(bread_slice);
		registerRender(cheese);
		registerRender(cheese_pizza);
		registerRender(cheese_slice);
		registerRender(cheeseburger);
		registerRender(chicken_nugget);
		registerRender(chocolate_donut);
		registerRender(creamcheese_bagel);
		registerRender(donut);
		registerRender(dough);
		registerRender(fries);
		registerRender(hershey);
		registerRender(hotdog);
		registerRender(milkshake);
		registerRender(pepperoni);
		registerRender(pepperoni_pizza);
		registerRender(sandwich);
		registerRender(soda);
		registerRender(sprinkled_donut);
		registerRender(toast);
		registerRender(vanilla_donut);

	}

	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}


}
