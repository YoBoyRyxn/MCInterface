package org.example.test.sendCLICommands

import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin
import java.util.Scanner;


class SendCLICommands : JavaPlugin() {

   fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?) {
        val p: CommandSender = sender;
        if (p is Player) {
            val scan = Scanner(System.`in`);
            println("Enter a Command: ")


            var sendMessagetroMC = scan.nextLine().trim();

            if (sendMessagetroMC.equals("/Send")) {
                println("Enter Message to Your Minecraft Server: ")
                sendMessagetroMC = scan.nextLine().trim();

                val message = sender.sendMessage("You Sent: $sendMessagetroMC");

                

            }

        }

    }

    override fun onEnable() {
        // Plugin startup logic
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
