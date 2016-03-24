package io.xol.mc2json;

//Copyright 2014 XolioWare Interactive

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Mc2JsonBukkit extends JavaPlugin {

    Logger log = Bukkit.getLogger();

    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable() {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
	if (cmd.getName().equals("mc2json")) {
	    if (sender.hasPermission("mcjson.make")) {
		Mc2Json.exec(sender, cmd, args);
		sender.sendMessage("file generated : osef.json");
	    }
	    return true;
	}
	sender.sendMessage("Unknow command : " + cmd.getName());
	return false;
    }
}
