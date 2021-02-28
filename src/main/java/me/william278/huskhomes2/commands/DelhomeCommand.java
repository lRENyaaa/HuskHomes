package me.william278.huskhomes2.commands;

import me.william278.huskhomes2.MessageManager;
import me.william278.huskhomes2.teleport.SettingHandler;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DelhomeCommand extends CommandBase {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (args.length == 1) {
                String homeName = args[0];
                SettingHandler.deleteHome(p, homeName);
            } else {
                MessageManager.sendMessage(p, "error_invalid_syntax", command.getUsage());
            }
            return true;
        }
        return false;
    }

}
