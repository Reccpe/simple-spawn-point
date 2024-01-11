package me.reccpe.main.cmd;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.reccpe.main.SpawnPlugin;
import net.md_5.bungee.api.ChatColor;

public class SpawnCommand implements CommandExecutor{

	private final SpawnPlugin plugin;
	
	public SpawnCommand(SpawnPlugin param_pl) {
		this.plugin = param_pl;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	
		if (sender instanceof Player) {
			Player player = (Player) sender;
			
			Location location = plugin.getConfig().getLocation("spawn");
			
			if (location != null) {
				player.teleport(location);
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&a&l+&8]" + "&fʏᴏᴜ ʜᴀᴠᴇ ʙᴇᴇɴ ᴛᴇʟᴇᴘᴏʀᴛᴇᴅ ᴛᴏ ᴛʜᴇ sᴘᴀᴡɴ ᴘᴏɪɴᴛ"));
			}
			else {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&eᴛʜᴇʀᴇ ɪs ɴᴏ sᴘᴀᴡɴ ᴘᴏɪɴᴛ ʜᴇʀᴇ - /sᴇᴛsᴘᴀᴡɴ"));
			}
			
		}
		
		return true;
	}
	
}
