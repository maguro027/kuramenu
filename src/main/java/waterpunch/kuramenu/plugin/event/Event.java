package waterpunch.kuramenu.plugin.event;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.plugin.Plugin;

public class Event implements Listener {

     public Event(Plugin plugin) {
          plugin.getServer().getPluginManager().registerEvents(this, plugin);
     }

     @EventHandler
     public void onInventoryClickEvent(InventoryClickEvent event) {
          if (event.getInventory().toString().matches(".*" + "Custom" + ".*") && event.getInventory().getType() == InventoryType.CHEST) {
               switch (((Player) event.getWhoClicked()).getOpenInventory().getTitle().toString()) {
                    case "KURA_SERVER_TOP_MENU":
                         event.setCancelled(true);
                         if (event.getRawSlot() == 36) ((Player) event.getWhoClicked()).closeInventory();
                         if (event.getRawSlot() == 10) ((Player) event.getWhoClicked()).openInventory(waterpunch.kuramenu.plugin.Menus.getFLY_SPEEDMenu((Player) event.getWhoClicked()));
                         if (event.getRawSlot() == 12) ((Player) event.getWhoClicked()).openInventory(waterpunch.kuramenu.plugin.Menus.getTIMEMenu((Player) event.getWhoClicked()));
                         if (event.getRawSlot() == 14) ((Player) event.getWhoClicked()).performCommand("bannar");
                         if (event.getRawSlot() == 16) ((Player) event.getWhoClicked()).performCommand("color");
                         //
                         if (event.getRawSlot() == 28) ((Player) event.getWhoClicked()).performCommand("butil");
                         if (event.getRawSlot() == 30) ((Player) event.getWhoClicked()).performCommand("blocks");

                         break;
                    case "KURA_SERVER_FLY_SPEED_MENU":
                         event.setCancelled(true);
                         if (event.getRawSlot() == 18) ((Player) event.getWhoClicked()).openInventory(waterpunch.kuramenu.plugin.Menus.getTopMenu((Player) event.getWhoClicked()));

                         if (event.getRawSlot() == 11) {
                              ((Player) event.getWhoClicked()).performCommand("flyspeed 1");
                              ((Player) event.getWhoClicked()).closeInventory();
                         }
                         if (event.getRawSlot() == 12) {
                              ((Player) event.getWhoClicked()).performCommand("flyspeed 2");
                              ((Player) event.getWhoClicked()).closeInventory();
                         }
                         if (event.getRawSlot() == 13) {
                              ((Player) event.getWhoClicked()).performCommand("flyspeed 3");
                              ((Player) event.getWhoClicked()).closeInventory();
                         }
                         if (event.getRawSlot() == 14) {
                              ((Player) event.getWhoClicked()).performCommand("flyspeed 4");
                              ((Player) event.getWhoClicked()).closeInventory();
                         }
                         if (event.getRawSlot() == 15) {
                              ((Player) event.getWhoClicked()).performCommand("flyspeed 4");
                              ((Player) event.getWhoClicked()).closeInventory();
                         }

                         break;
                    case "KURA_SERVER_TIME_MENU":
                         event.setCancelled(true);
                         if (event.getRawSlot() == 18) ((Player) event.getWhoClicked()).openInventory(waterpunch.kuramenu.plugin.Menus.getTopMenu((Player) event.getWhoClicked()));
                         if (event.getRawSlot() == 11) {
                              ((Player) event.getWhoClicked()).performCommand("time set day");
                              ((Player) event.getWhoClicked()).closeInventory();
                         }
                         if (event.getRawSlot() == 12) {
                              ((Player) event.getWhoClicked()).performCommand("time set noon");
                              ((Player) event.getWhoClicked()).closeInventory();
                         }
                         if (event.getRawSlot() == 14) {
                              ((Player) event.getWhoClicked()).performCommand("time set night");
                              ((Player) event.getWhoClicked()).closeInventory();
                         }
                         if (event.getRawSlot() == 15) {
                              ((Player) event.getWhoClicked()).performCommand("time set midnight");
                              ((Player) event.getWhoClicked()).closeInventory();
                         }

                         break;
               }
          }
     }
}
