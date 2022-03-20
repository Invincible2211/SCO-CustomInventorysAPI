package de.fynn.sco.custominventoryapi.control.hook;

import de.fynn.sco.custominventoryapi.CustomInventoryAPIPlugin;
import de.fynn.sco.languageapi.control.api.LanguageAPI;
import de.fynn.sco.languageapi.model.exception.InvalidLanguageFileException;
import org.bukkit.entity.Player;

public class LanguageAPIConnector {

    private static LanguageAPI languageAPI;

    static {
        try {
            languageAPI = new LanguageAPI(CustomInventoryAPIPlugin.getPlugin(), "DEFAULT_LANGUAGE", "FOLDER_PATH"); //TODO Strings anpassen
        } catch (InvalidLanguageFileException e) {
            e.printStackTrace();
        }
    }

    public static String getString(Player player, String key){
        return languageAPI.getTranslation(player.getUniqueId(), key);
    }


}
