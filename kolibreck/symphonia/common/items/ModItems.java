package com.kolibreck.symphonia.common.items;

import com.kolibreck.symphonia.client.render.item.RenderItemTrumpet;
import com.kolibreck.symphonia.common.help.RegisterHelper;
import com.kolibreck.symphonia.common.items.instruments.ItemClarinet;
import com.kolibreck.symphonia.common.items.instruments.ItemGuitar;
import com.kolibreck.symphonia.common.items.instruments.ItemTrumpet;
import com.kolibreck.symphonia.common.items.instruments.ItemTuba;
import com.kolibreck.symphonia.common.items.instruments.ItemWoodFlute;
import com.kolibreck.symphonia.common.items.parts.ItemGoldHorn;
import com.kolibreck.symphonia.common.items.parts.ItemGoldTube;
import com.kolibreck.symphonia.common.items.parts.ItemGoldValves;
import com.kolibreck.symphonia.common.items.parts.ItemIronMouthpiece;
import com.kolibreck.symphonia.common.items.parts.ItemKeySystem;
import com.kolibreck.symphonia.common.items.parts.ItemStainedShaft;
import com.kolibreck.symphonia.common.items.parts.ItemWoodReed;
import com.kolibreck.symphonia.common.items.parts.ItemWoodShaft;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.MinecraftForgeClient;

public final class ModItems
{
	public static Item woodReed;
	public static Item woodShaft;
	public static Item goldHorn;
	public static Item goldValves;
	public static Item ironMouthpiece;
	public static Item stainedShaft;
	public static Item keySystem;
	public static Item goldTube;
	
	public static Item woodFlute;
	public static Item trumpet;
	public static Item clarinet;
	public static Item tuba;
	public static Item guitar;
	
	public static void initialize()
	{
		woodReed = new ItemWoodReed();
	    	woodShaft = new ItemWoodShaft();
	    	ironMouthpiece = new ItemIronMouthpiece();
	    	goldHorn = new ItemGoldHorn();
	    	goldValves = new ItemGoldValves();
	    	stainedShaft = new ItemStainedShaft();
	    	keySystem = new ItemKeySystem();
	    	goldTube = new ItemGoldTube();
	    	
	    	woodFlute = new ItemWoodFlute();
	    	trumpet = new ItemTrumpet();
	    	clarinet = new ItemClarinet();
	    	tuba = new ItemTuba();
	    	guitar = new ItemGuitar();
	    	
	    	RegisterHelper.RegisterItem(woodReed);
	    	RegisterHelper.RegisterItem(woodShaft);
	    	RegisterHelper.RegisterItem(ironMouthpiece);
	    	RegisterHelper.RegisterItem(goldHorn);
	    	RegisterHelper.RegisterItem(goldValves);
	    	RegisterHelper.RegisterItem(stainedShaft);
	    	RegisterHelper.RegisterItem(keySystem);
	    	RegisterHelper.RegisterItem(goldTube);
	    	
	    	RegisterHelper.RegisterItem(woodFlute);
	    	RegisterHelper.RegisterItem(trumpet);
	    	RegisterHelper.RegisterItem(clarinet);
	    	RegisterHelper.RegisterItem(tuba);
	    	RegisterHelper.RegisterItem(guitar);
	    	
	    	initializeRenderers();
	    	addRecipes();
	}
	
	private static void addRecipes()
	{
		// Flute Recipes
		GameRegistry.addRecipe(new ItemStack(woodReed), new Object[]{ "ABA", 'A', Items.stick, 'B', Items.reeds });
		GameRegistry.addRecipe(new ItemStack(woodShaft), new Object[]{ "AA", "AA", "AA", 'A', Items.stick });  	
		GameRegistry.addRecipe(new ItemStack(woodFlute), new Object[]{ "A", "B", "B", 'A', woodReed, 'B', woodShaft });
		
		// Trumpet Recipes
		GameRegistry.addRecipe(new ItemStack(ironMouthpiece), new Object[]{ "A  ", " AA", "A  ", 'A', Items.iron_ingot });
		GameRegistry.addRecipe(new ItemStack(goldHorn), new Object[]{ "  A", "AA ", "  A", 'A', Items.gold_ingot });
		GameRegistry.addRecipe(new ItemStack(goldValves), new Object[]{ "BBB", "AAA", "AAA", 'A', Items.gold_ingot, 'B', Blocks.wooden_button });
		GameRegistry.addRecipe(new ItemStack(trumpet), new Object[]{ "ABC", 'A', ironMouthpiece, 'B', goldValves, 'C', goldHorn });
		
		// Clarinet Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(stainedShaft), new Object[]{ new ItemStack(Items.dye, 1, 0), ModItems.woodShaft });
		GameRegistry.addRecipe(new ItemStack(keySystem), new Object[]{ "AB", "AB", "AB", 'A', Items.iron_ingot, 'B',Blocks.wooden_button });
		GameRegistry.addRecipe(new ItemStack(clarinet), new Object[]{ " A", "BC", "BC", 'A', woodReed, 'B', keySystem, 'C', stainedShaft});
		
		// Tuba Recipes
		GameRegistry.addRecipe(new ItemStack(goldTube), new Object[]{"AA", "AA", "AA", 'A', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(tuba), new Object[]{" AB", "CAD", " AA", 'A', goldTube, 'B', goldHorn, 'C', ironMouthpiece, 'D', goldValves});
	}
	
	private static void initializeRenderers()
	{
		MinecraftForgeClient.registerItemRenderer(trumpet, new RenderItemTrumpet());
	}
}
