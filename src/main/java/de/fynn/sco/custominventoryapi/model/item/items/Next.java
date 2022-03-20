package de.fynn.sco.custominventoryapi.model.item.items;

import org.bukkit.Material;

public class Next extends GUIItem {

    public Next(PageInventory parent) {
        super(Material.GREEN_WOOL, MessageManager.getMessage(parent.getOwner().getUniqueId(), MessageType.ITEM.GUI_NEXT), parent);
        addClickAction(player -> {
            parent.nextPage();
            return false;
        });
    }

}