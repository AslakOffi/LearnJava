package fr.kingaslak.firstplugin;

import org.bukkit.plugin.java.JavaPlugin;

import fr.kingaslak.firstplugin.commands.CommandSpawn;
import fr.kingaslak.firstplugin.commands.CommandTest;

public class FirstPlugin extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("Le plugin vient de s'allumer");
		getCommand("test").setExecutor(new CommandTest());
		getCommand("alert").setExecutor(new CommandTest());
		getCommand("spawn").setExecutor(new CommandSpawn());
		getServer().getPluginManager().registerEvents(new FirstPluginListeners(), this);
	
	}
	
	@Override
	public void onDisable() {
		System.out.println("Le plugin vient de s'éteindre");
	}

}
