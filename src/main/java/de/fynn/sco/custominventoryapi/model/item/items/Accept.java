package de.fynn.sco.custominventoryapi.model.item.items;

import de.fynn.sco.custominventoryapi.model.inventory.CustomInventory;
import de.fynn.sco.custominventoryapi.model.item.ClickAction;
import de.fynn.sco.custominventoryapi.model.item.GUIItem;
import org.bukkit.Material;

public class Accept extends GUIItem {

    public Accept(ClickAction action, CustomInventory parent) {
        super(Material.GREEN_CONCRETE, MessageManager.getMessage(parent.getOwner().getUniqueId(), MessageType.ITEM.GUI_ACCEPT), action, parent);
        addClickAction(action);
    }

}
