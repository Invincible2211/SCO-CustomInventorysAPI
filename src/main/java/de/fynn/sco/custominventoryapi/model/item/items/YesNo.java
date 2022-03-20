package de.fynn.sco.custominventoryapi.model.item.items;

import org.bukkit.Material;

public class YesNo extends GUIItem {

    private boolean state = false;

    public YesNo(String name, CustomInventory parent) {
        super(Material.RED_WOOL,name, parent);
        addClickAction(player -> {
            switchState();
            return false;
        });
    }

    public void switchState(){
        state=!state;
        setType(state?Material.GREEN_WOOL:Material.RED_WOOL);
    }

    public boolean getState() {
        return state;
    }


}