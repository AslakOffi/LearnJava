package fr.kingaslak.firstplugin.commands;


import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSpawn implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			Location spawn = new Location(player.getWorld(), 14.456, 69, 271.667, 178.8f, 2.9f);
			player.sendMessage("§aVous venez d'etre TP au spawn !");
			player.teleport(spawn);
		}
		
		return false;
	}

}
