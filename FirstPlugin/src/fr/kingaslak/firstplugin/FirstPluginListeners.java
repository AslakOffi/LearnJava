package fr.kingaslak.firstplugin;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class FirstPluginListeners implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		
		Player player = event.getPlayer();
		player.getInventory().clear();	
		// player.getInventory().addItem(new ItemStack(Material.IRON_SWORD, 3));
		
		ItemStack customsword = new ItemStack(Material.IRON_SWORD, 1);
		ItemMeta customM = customsword.getItemMeta();
		customM.setDisplayName("§cExcalibure");
		customM.setLore(Arrays.asList("premiere ligne", "deuxieme ligne"));
		customM.addEnchant(Enchantment.DAMAGE_ALL, 200, true);
		customM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		customsword.setItemMeta(customM);
		
		
		player.getInventory().setItemInMainHand(customsword);
		
		@SuppressWarnings("deprecation")
		ItemStack customwool = new ItemStack(Material.BLACK_WOOL, 8, (byte)14);
		
		player.getInventory().setHelmet(customwool);
		
		player.updateInventory();
		
	}

}
