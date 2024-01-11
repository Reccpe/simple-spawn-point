package me.reccpe.main.cmd;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.reccpe.main.SpawnPlugin;
import net.md_5.bungee.api.ChatColor;

public class SetSpawnCommand implements CommandExecutor{

	private final SpawnPlugin plugin;
	
	public SetSpawnCommand(SpawnPlugin param_plugin) {
		this.plugin = param_plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lbl, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;
					
			Location location = player.getLocation();
			
			// 1- save the location obj
			plugin.getConfig().set("spawn", location);
			
			plugin.saveConfig();
			
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&a&l+&8] " + "&fsᴘᴀᴡɴ ʟᴏᴄᴀᴛɪᴏɴ ʜᴀs ʙᴇᴇɴ sᴇᴛ"));
			
		}
		else {
			return false;
		}
		
		return true;
	}
	
}
