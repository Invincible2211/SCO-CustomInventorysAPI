package de.fynn.sco.custominventoryapi.control;

import de.fynn.sco.custominventoryapi.control.InventoryController;
import de.fynn.sco.custominventoryapi.model.inventory.CustomInventory;
import de.fynn.sco.custominventoryapi.model.inventory.InventoryPattern;
import de.fynn.sco.custominventoryapi.model.inventory.InventoryType;
import org.bukkit.entity.Player;

public class CustomInventoryAPI {

    private final static InventoryController inventoryController = InventoryController.getInstance();

    public static CustomInventory createInventory(Player owner, String inventoryName, int size, InventoryType inventoryType){
        return inventoryController.createInventory(owner, inventoryName, size, inventoryType);
    }

    public static CustomInventory createInventory(Player owner, String inventoryName, InventoryType inventoryType){
        return inventoryController.createInventory(owner, inventoryName, inventoryType);
    }

    public static CustomInventory createInventory(Player owner, InventoryPattern pattern){

    }

}
