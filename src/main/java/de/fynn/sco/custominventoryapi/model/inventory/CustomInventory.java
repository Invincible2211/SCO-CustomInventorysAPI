package de.fynn.sco.custominventoryapi.model.inventory;

import de.fynn.sco.custominventoryapi.control.PermissionManager;
import org.bukkit.inventory.InventoryHolder;

/**
 * @author Freddyblitz
 * @version 1.0
 */
public abstract class CustomInventory implements InventoryHolder {

    /*----------------------------------------------ATTRIBUTE---------------------------------------------------------*/

    private final PermissionManager permissionManager = new PermissionManager();

    private final String identifier;

    /*--------------------------------------------KONSTRUKTOREN-------------------------------------------------------*/

    public CustomInventory(String identifier){
        this.identifier = identifier;
    }

    /*-----------------------------------------GETTER AND SETTER------------------------------------------------------*/

    public PermissionManager getPermissionManager() {
        return permissionManager;
    }

    public String getIdentifier() {
        return identifier;
    }

}
