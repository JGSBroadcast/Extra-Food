package net.jgsb.extrafood.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FoodRecipes {

	public static void register(){

		GameRegistry.addRecipe(new ItemStack(Foods.cheeseburger, 1), new Object[]{
			" B ","CM "," B ",'B',Items.BREAD,'C',Foods.cheese_slice,'M',Items.COOKED_BEEF
		});

		GameRegistry.addRecipe(new ItemStack(Foods.fries, 2), new Object[]{
			"PPP","PPP","CCC",'P',Items.POTATO,'C',Items.PAPER
		});

		GameRegistry.addRecipe(new ItemStack(Foods.soda, 1), new Object[]{
			"PSP","PWP","PPP",'P',Items.PAPER,'S',Items.SUGAR,'W',Items.POTIONITEM
		});

		GameRegistry.addRecipe(new ItemStack(Foods.hotdog, 1), new Object[]{
			"BBB","SSS","BBB",'B',Items.BREAD,'S',Items.COOKED_BEEF
		});

		GameRegistry.addShapelessRecipe(new ItemStack(Foods.chicken_nugget, 2), new Object[]{
			Items.COOKED_CHICKEN
		});

		GameRegistry.addRecipe(new ItemStack(Foods.hershey, 2), new Object[]{
			"CCC",'C',new ItemStack(Items.DYE, 1, 3)
		});

		GameRegistry.addRecipe(new ItemStack(Foods.cheese, 4), new Object[]{
			"MMM",'M',Items.MILK_BUCKET
		});

		GameRegistry.addShapelessRecipe(new ItemStack(Foods.pepperoni, 3), new Object[]{
			Items.COOKED_PORKCHOP
		});

		GameRegistry.addRecipe(new ItemStack(Foods.cheese_pizza, 1), new Object[]{
			"DDD","CCC"," C ",'D',Foods.dough,'C',Foods.cheese
		});

		GameRegistry.addShapelessRecipe(new ItemStack(Foods.dough, 3), new Object[]{
			Items.WHEAT,Items.EGG
		});

		GameRegistry.addShapelessRecipe(new ItemStack(Foods.pepperoni_pizza, 1), new Object[]{
			Foods.cheese_pizza,Foods.pepperoni
		});

		GameRegistry.addRecipe(new ItemStack(Foods.donut, 1), new Object[]{
			"DDD","D D","DDD",'D',Foods.dough
		});

		GameRegistry.addShapelessRecipe(new ItemStack(Foods.chocolate_donut, 1), new Object[]{
			Foods.donut,Foods.hershey
		});

		GameRegistry.addShapelessRecipe(new ItemStack(Foods.sprinkled_donut, 1), new Object[]{
			Foods.chocolate_donut,new ItemStack(Items.DYE, 1, 1)
		});

		GameRegistry.addRecipe(new ItemStack(Foods.milkshake, 1), new Object[]{
			"P P","PMP","PPP",'P',Items.PAPER,'M',Items.MILK_BUCKET
		});

		GameRegistry.addShapelessRecipe(new ItemStack(Foods.bread_slice, 3), new Object[]{
			Items.BREAD
		});

		GameRegistry.addShapelessRecipe(new ItemStack(Foods.cheese_slice, 3), new Object[]{
			Foods.cheese
		});

		GameRegistry.addRecipe(new ItemStack(Foods.sandwich, 1), new Object[]{
			" B ","CS "," B ",'B',Foods.bread_slice,'C',Foods.cheese_slice,'S',Items.COOKED_BEEF
		});

		GameRegistry.addRecipe(new ItemStack(Foods.bagel, 1), new Object[]{
			"WWW","W W","WWW",'W',Items.WHEAT
		});

		GameRegistry.addShapelessRecipe(new ItemStack(Foods.creamcheese_bagel, 1), new Object[]{
			Foods.bagel,Items.MILK_BUCKET
		});

		GameRegistry.addShapelessRecipe(new ItemStack(Foods.vanilla_donut, 1), new Object[]{
			Foods.donut,Items.MILK_BUCKET
		});
		
		GameRegistry.addSmelting(new ItemStack(Foods.bread_slice), new ItemStack(Foods.toast), 0.3F);

	}

}
