package de.fynn.sco.custominventoryapi;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Freddyblitz
 * @version 1.0
 */
public class CustomInventoryAPIPlugin extends JavaPlugin {

    private static CustomInventoryAPIPlugin instance;

    @Override
    public void onEnable(){
        instance = this;
    }

    @Override
    public void onDisable(){

    }

    public static CustomInventoryAPIPlugin getPlugin() {
        return instance;
    }

}
