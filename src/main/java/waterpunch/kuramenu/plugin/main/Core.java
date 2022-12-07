package waterpunch.kuramenu.plugin.main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import waterpunch.kuramenu.plugin.event.Event;

public class Core extends JavaPlugin {

     @Override
     public void onEnable() {
          System.out.println("WaterPunch MENUS_KURA Start");
          new Event(this);
     }

     @Override
     public void onDisable() {
          System.out.println("WaterPunch MENUS_KURA Stop");
     }

     @Override
     public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
          if (!(cmd.getName().equalsIgnoreCase("p")) || !(sender instanceof Player) || !(sender.isOp())) return false;
          if (args.length == 0) {
               ((Player) sender).openInventory(waterpunch.kuramenu.plugin.Menus.getTopMenu((Player) sender));
               return true;
          }
          return false;
     }
}
