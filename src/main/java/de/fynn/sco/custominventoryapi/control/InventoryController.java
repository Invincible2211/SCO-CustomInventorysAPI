package de.fynn.sco.custominventoryapi.control;

import de.fynn.sco.custominventoryapi.model.inventory.CustomInventory;
import de.fynn.sco.custominventoryapi.model.inventory.DefaultInventory;
import de.fynn.sco.custominventoryapi.model.inventory.InventoryType;
import de.fynn.sco.custominventoryapi.model.inventory.PageInventory;
import org.bukkit.entity.Player;

public class InventoryController {

    private static final InventoryController instance = new InventoryController();

    private InventoryController(){

    }

    public CustomInventory createInventory(Player owner, String inventoryName, int size, InventoryType inventoryType){
        switch (inventoryType){
            case DEFAULT:
                return new DefaultInventory();
            case PAGE:
                return new PageInventory();
        }
    }

    public CustomInventory createInventory(Player owner, String inventoryName, InventoryType inventoryType){
        switch (inventoryType){
            case DEFAULT:
                return new DefaultInventory();
            case PAGE:
                return new PageInventory();
        }
    }

    protected static InventoryController getInstance() {
        return instance;
    }

}
