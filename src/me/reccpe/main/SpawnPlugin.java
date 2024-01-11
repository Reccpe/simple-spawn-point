package me.reccpe.main;

import org.bukkit.plugin.java.JavaPlugin;

import me.reccpe.main.cmd.SetSpawnCommand;
import me.reccpe.main.cmd.SpawnCommand;

public class SpawnPlugin extends JavaPlugin{

	@Override
	public void onEnable() {
		
		// TODO : if u want to change command to whatever u want , just change to "setspawn"
		getCommand("setspawn").setExecutor(new SetSpawnCommand(this));
		getCommand("spawn").setExecutor(new SpawnCommand(this)); // TODO : spawn command
		
		// config.yml
		getConfig().options().configuration();
		saveDefaultConfig();
	}
	
}
