package fr.kingaslak.firstplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandTest implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		
		if(sender instanceof Player) {
			
			if(cmd.getName().equalsIgnoreCase("test")) {
				Player player = (Player)sender;
				player.sendMessage("§bAslak est notre §9Dieu");
				return true;
			}
			
			if(cmd.getName().equalsIgnoreCase("alert")) {
				
				//alert => aucun argument
				if(args.length == 0) {
					Player player = (Player)sender;
					player.sendMessage("La commande est : /alert <message>");
				}
				
				//alert <text text text>
				if(args.length >= 1) {
					
					StringBuilder bc = new StringBuilder();
					for(String part : args) {
						bc.append(part + " ");
					}
					
					Player player = (Player)sender;
					Bukkit.broadcastMessage("["  + player.getName() +  "] " + bc.toString());
				}
				
				return true;
				
			}
		}
		
		return false;
	}

}
