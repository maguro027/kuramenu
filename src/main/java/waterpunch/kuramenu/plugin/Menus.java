package waterpunch.kuramenu.plugin;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Menus {

     static Inventory setBorder(Inventory inv) {
          ItemStack cash = null;
          for (int i = 0; i < 45; ++i) {
               if (i > 8 && i < 36) continue;
               cash = getBlack();
               if (i == 36) cash = getBack();
               inv.setItem(i, new ItemStack(cash));
          }
          return inv;
     }

     static Inventory set3Border(Inventory inv) {
          ItemStack cash = null;
          for (int i = 0; i < 27; ++i) {
               if (i > 8 && i < 18) continue;
               cash = getBlack();
               if (i == 18) cash = getBack();
               inv.setItem(i, new ItemStack(cash));
          }
          return inv;
     }

     static ItemStack getBlack() {
          ItemStack BLACK = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
          ItemMeta BLACK_Meta = BLACK.getItemMeta();
          BLACK_Meta.setDisplayName(" ");
          BLACK.setItemMeta(BLACK_Meta);
          return BLACK;
     }

     static ItemStack getBack() {
          ItemStack BACK = new ItemStack(Material.ARROW);
          ItemMeta BACK_Meta = BACK.getItemMeta();
          BACK_Meta.setDisplayName("BACK");
          BACK.setItemMeta(BACK_Meta);
          return BACK;
     }

     static ItemStack getFLY_SPEED() {
          ItemStack FLY_SPEED = new ItemStack(Material.FEATHER);
          ItemMeta FLY_SPEED_Meta = FLY_SPEED.getItemMeta();
          FLY_SPEED_Meta.setDisplayName(ChatColor.GOLD + "FLY_SPEED");
          FLY_SPEED.setItemMeta(FLY_SPEED_Meta);
          return FLY_SPEED;
     }

     static ItemStack getTIMER() {
          ItemStack SERVER_TIME = new ItemStack(Material.CLOCK);
          ItemMeta SERVER_TIME_Meta = SERVER_TIME.getItemMeta();
          SERVER_TIME_Meta.setDisplayName(ChatColor.GOLD + "SERVER_TIME");
          SERVER_TIME.setItemMeta(SERVER_TIME_Meta);
          return SERVER_TIME;
     }

     static ItemStack getBANNAR_EDITOR() {
          ItemStack BANNAR_EDITOR = new ItemStack(Material.WHITE_BANNER);
          ItemMeta BANNAR_EDITOR_Meta = BANNAR_EDITOR.getItemMeta();
          BANNAR_EDITOR_Meta.setDisplayName(ChatColor.GOLD + "BANNAR_EDITOR");
          BANNAR_EDITOR.setItemMeta(BANNAR_EDITOR_Meta);
          return BANNAR_EDITOR;
     }

     static ItemStack getCOLOR_EDITOR() {
          ItemStack COLOR_EDITOR = new ItemStack(Material.LEATHER_HELMET);
          ItemMeta COLOR_EDITOR_Meta = COLOR_EDITOR.getItemMeta();
          COLOR_EDITOR_Meta.setDisplayName(ChatColor.GOLD + "COLOR_EDITOR");
          COLOR_EDITOR.setItemMeta(COLOR_EDITOR_Meta);
          return COLOR_EDITOR;
     }

     static ItemStack getBUTIL() {
          ItemStack BUTIL = new ItemStack(Material.BRICK_SLAB);
          ItemMeta BUTIL_Meta = BUTIL.getItemMeta();
          BUTIL_Meta.setDisplayName(ChatColor.GOLD + "BUTIL_SETTING");
          BUTIL.setItemMeta(BUTIL_Meta);
          return BUTIL;
     }

     static ItemStack getBLOCKS() {
          ItemStack BLOCKS = new ItemStack(Material.GRASS_BLOCK);
          ItemMeta BLOCKS_Meta = BLOCKS.getItemMeta();
          BLOCKS_Meta.setDisplayName(ChatColor.GOLD + "BLOCKS");
          BLOCKS.setItemMeta(BLOCKS_Meta);
          return BLOCKS;
     }

     static ItemStack getHEAD() {
          ItemStack HEAD = new ItemStack(Material.PLAYER_HEAD);
          ItemMeta HEAD_Meta = HEAD.getItemMeta();
          HEAD_Meta.setDisplayName(ChatColor.GOLD + "GIVE_MY_HEAD");
          HEAD.setItemMeta(HEAD_Meta);
          return HEAD;
     }

     static ItemStack getSPEED(int i) {
          ItemStack SPEED = null;
          switch (i) {
               case 1:
                    SPEED = new ItemStack(Material.SMALL_AMETHYST_BUD);
                    break;
               case 2:
                    SPEED = new ItemStack(Material.MEDIUM_AMETHYST_BUD);
                    break;
               case 3:
                    SPEED = new ItemStack(Material.LARGE_AMETHYST_BUD);
                    break;
               case 5:
                    SPEED = new ItemStack(Material.AMETHYST_CLUSTER);
                    break;
               case 10:
                    SPEED = new ItemStack(Material.AMETHYST_BLOCK);
                    break;
          }
          ItemMeta SPEED_Meta = SPEED.getItemMeta();
          SPEED_Meta.setDisplayName(ChatColor.GOLD + String.valueOf(i));
          SPEED.setItemMeta(SPEED_Meta);
          return SPEED;
     }

     static ItemStack getTIME(int i) {
          ItemStack TIME = null;
          ItemMeta TIME_Meta = null;
          List<String> lores = new ArrayList<String>();
          switch (i) {
               case 1:
                    TIME = new ItemStack(Material.BEDROCK);
                    TIME_Meta = TIME.getItemMeta();
                    TIME_Meta.setDisplayName(ChatColor.GOLD + "SUNRISE");
                    lores.add(ChatColor.RED + "05:00");
                    break;
               case 2:
                    TIME = new ItemStack(Material.SUNFLOWER);
                    TIME_Meta = TIME.getItemMeta();
                    TIME_Meta.setDisplayName(ChatColor.GOLD + "DAY");
                    lores.add(ChatColor.RED + "06:00");
                    break;
               case 3:
                    TIME = new ItemStack(Material.GRASS_BLOCK);
                    TIME_Meta = TIME.getItemMeta();
                    TIME_Meta.setDisplayName(ChatColor.GOLD + "NOON");
                    lores.add(ChatColor.RED + "12:00");
                    break;
               case 4:
                    TIME = new ItemStack(Material.HONEYCOMB_BLOCK);
                    TIME_Meta = TIME.getItemMeta();
                    TIME_Meta.setDisplayName(ChatColor.GOLD + "SUNSET");
                    lores.add(ChatColor.RED + "18:00");
                    break;
               case 5:
                    TIME = new ItemStack(Material.COAL_BLOCK);
                    TIME_Meta = TIME.getItemMeta();
                    TIME_Meta.setDisplayName(ChatColor.GOLD + "NIGHT");
                    lores.add(ChatColor.RED + "20:00");
                    break;
               case 6:
                    TIME = new ItemStack(Material.CRYING_OBSIDIAN);
                    TIME_Meta = TIME.getItemMeta();
                    TIME_Meta.setDisplayName(ChatColor.GOLD + "MIDNIGHT");
                    lores.add(ChatColor.RED + "24:00");
                    break;
          }
          TIME_Meta.setLore(lores);
          TIME.setItemMeta(TIME_Meta);
          return TIME;
     }

     public static Inventory getTopMenu(Player player) {
          Inventory KURA_SERVER_TOP_MENU = Bukkit.createInventory(player, 9 * 5, "KURA_SERVER_TOP_MENU");
          setBorder(KURA_SERVER_TOP_MENU);
          KURA_SERVER_TOP_MENU.setItem(10, new ItemStack(getFLY_SPEED()));
          KURA_SERVER_TOP_MENU.setItem(12, new ItemStack(getTIMER()));
          KURA_SERVER_TOP_MENU.setItem(14, new ItemStack(getBANNAR_EDITOR()));
          KURA_SERVER_TOP_MENU.setItem(16, new ItemStack(getCOLOR_EDITOR()));
          KURA_SERVER_TOP_MENU.setItem(28, new ItemStack(getBUTIL()));
          KURA_SERVER_TOP_MENU.setItem(30, new ItemStack(getBLOCKS()));
          KURA_SERVER_TOP_MENU.setItem(32, new ItemStack(getHEAD()));
          return KURA_SERVER_TOP_MENU;
     }

     public static Inventory getFLY_SPEEDMenu(Player player) {
          Inventory KURA_SERVER_FLY_SPEED_MENU = Bukkit.createInventory(player, 9 * 3, "KURA_SERVER_FLY_SPEED_MENU");
          set3Border(KURA_SERVER_FLY_SPEED_MENU);
          KURA_SERVER_FLY_SPEED_MENU.setItem(4, new ItemStack(getFLY_SPEED()));
          KURA_SERVER_FLY_SPEED_MENU.setItem(11, new ItemStack(getSPEED(1)));
          KURA_SERVER_FLY_SPEED_MENU.setItem(12, new ItemStack(getSPEED(2)));
          KURA_SERVER_FLY_SPEED_MENU.setItem(13, new ItemStack(getSPEED(3)));
          KURA_SERVER_FLY_SPEED_MENU.setItem(14, new ItemStack(getSPEED(5)));
          KURA_SERVER_FLY_SPEED_MENU.setItem(15, new ItemStack(getSPEED(10)));
          return KURA_SERVER_FLY_SPEED_MENU;
     }

     public static Inventory getTIMEMenu(Player player) {
          Inventory KURA_SERVER_PLAYER_TIME_MENU = Bukkit.createInventory(player, 9 * 3, "KURA_SERVER_PLAYER_TIME_MENU");
          set3Border(KURA_SERVER_PLAYER_TIME_MENU);
          KURA_SERVER_PLAYER_TIME_MENU.setItem(4, new ItemStack(getTIMER()));
          KURA_SERVER_PLAYER_TIME_MENU.setItem(10, new ItemStack(getTIME(1)));
          KURA_SERVER_PLAYER_TIME_MENU.setItem(11, new ItemStack(getTIME(2)));
          KURA_SERVER_PLAYER_TIME_MENU.setItem(12, new ItemStack(getTIME(3)));

          KURA_SERVER_PLAYER_TIME_MENU.setItem(14, new ItemStack(getTIME(4)));
          KURA_SERVER_PLAYER_TIME_MENU.setItem(15, new ItemStack(getTIME(5)));
          KURA_SERVER_PLAYER_TIME_MENU.setItem(16, new ItemStack(getTIME(6)));
          return KURA_SERVER_PLAYER_TIME_MENU;
     }
}
