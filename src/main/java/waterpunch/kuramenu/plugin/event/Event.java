package waterpunch.kuramenu.plugin.event;

import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

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
                         if (event.getRawSlot() == 14) ((Player) event.getWhoClicked()).performCommand("banner");
                         if (event.getRawSlot() == 16) ((Player) event.getWhoClicked()).performCommand("color");
                         //
                         if (event.getRawSlot() == 28) ((Player) event.getWhoClicked()).performCommand("butil");
                         if (event.getRawSlot() == 30) ((Player) event.getWhoClicked()).performCommand("blocks");
                         if (event.getRawSlot() == 32) {
                              ((Player) event.getWhoClicked()).closeInventory();
                              ItemStack item = new ItemStack(Material.PLAYER_HEAD, 1, (short) 3);
                              SkullMeta skull = (SkullMeta) item.getItemMeta();
                              skull.setDisplayName(((Player) event.getWhoClicked()).getName());
                              skull.setOwner(((Player) event.getWhoClicked()).getName());
                              item.setItemMeta(skull);
                              ((Player) event.getWhoClicked()).getInventory().addItem(item);
                         }
                         if (event.getRawSlot() == 34) ((Player) event.getWhoClicked()).openInventory(waterpunch.kuramenu.plugin.Menus.getLightMenu((Player) event.getWhoClicked()));

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
                              ((Player) event.getWhoClicked()).performCommand("flyspeed 5");
                              ((Player) event.getWhoClicked()).closeInventory();
                         }
                         if (event.getRawSlot() == 15) {
                              ((Player) event.getWhoClicked()).performCommand("flyspeed 10");
                              ((Player) event.getWhoClicked()).closeInventory();
                         }

                         break;
                    case "KURA_SERVER_PLAYER_TIME_MENU":
                         event.setCancelled(true);
                         if (event.getRawSlot() == 18) ((Player) event.getWhoClicked()).openInventory(waterpunch.kuramenu.plugin.Menus.getTopMenu((Player) event.getWhoClicked()));
                         if (event.getRawSlot() == 10) {
                              ((Player) event.getWhoClicked()).performCommand("ptime sunrise");
                              ((Player) event.getWhoClicked()).closeInventory();
                         }
                         if (event.getRawSlot() == 11) {
                              ((Player) event.getWhoClicked()).performCommand("ptime day");
                              ((Player) event.getWhoClicked()).closeInventory();
                         }
                         if (event.getRawSlot() == 12) {
                              ((Player) event.getWhoClicked()).performCommand("ptime noon");
                              ((Player) event.getWhoClicked()).closeInventory();
                         }
                         if (event.getRawSlot() == 14) {
                              ((Player) event.getWhoClicked()).performCommand("ptime sunset");
                              ((Player) event.getWhoClicked()).closeInventory();
                         }
                         if (event.getRawSlot() == 15) {
                              ((Player) event.getWhoClicked()).performCommand("ptime night");
                              ((Player) event.getWhoClicked()).closeInventory();
                         }
                         if (event.getRawSlot() == 16) {
                              ((Player) event.getWhoClicked()).performCommand("ptime midnight");
                              ((Player) event.getWhoClicked()).closeInventory();
                         }
                         break;
                    case "KURA_SERVER_LIGHT_MENU":
                         if (event.getRawSlot() == 11) {
                              ((Player) event.getWhoClicked()).addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 600000, 1));
                              ((Player) event.getWhoClicked()).closeInventory();
                         }
                         if (event.getRawSlot() == 15) {
                              ((Player) event.getWhoClicked()).removePotionEffect(PotionEffectType.GLOWING);
                              ((Player) event.getWhoClicked()).closeInventory();
                         }
                         break;
               }
          }
     }
}
