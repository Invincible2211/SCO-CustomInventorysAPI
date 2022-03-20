package de.fynn.sco.custominventoryapi.control.database;

import de.fynn.sco.custominventoryapi.CustomInventoryAPIPlugin;
import de.fynn.sco.custominventoryapi.control.configuration.ConfigurationHandler;
import de.fynn.sco.custominventoryapi.model.DatabaseData;
import de.fynn.sco.custominventoryapi.model.Strings;
import org.bukkit.Bukkit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

public class DatabaseConnector {

    /*----------------------------------------------ATTRIBUTE---------------------------------------------------------*/

    private Connection connection;
    private final DatabaseData databaseData;

    private static DatabaseConnector instance;

    static {
        try {
            instance = new DatabaseConnector();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Prepared Statements
    private final PreparedStatement createSchema;
    private final PreparedStatement createTable;

    /*--------------------------------------------KONSTRUKTOREN-------------------------------------------------------*/

    /**
     * Der private Konstruktor baut eine Verbindung mit der Datenbank auf und bereitet die SQL-Statements vor.
     * @throws SQLException Gibt auftretende SQL-Exceptions weiter
     */
    private DatabaseConnector() throws SQLException{
        databaseData = ConfigurationHandler.getDatabaseData();
        try {
            connect();
        } catch (SQLException e) {
            CustomInventoryAPIPlugin.getPlugin().getLogger().warning(Strings.DATABASE_CONNECTION_FAILED);
            e.printStackTrace();
            Bukkit.getPluginManager().disablePlugin(CustomInventoryAPIPlugin.getPlugin());
        }
        createSchema = connection.prepareStatement("CREATE SCHEMA IF NOT EXISTS " + databaseData.getSchema() + ";");
        createTable = connection.prepareStatement("CREATE TABLE IF NOT EXISTS " + databaseData.getSchema()
                + ".inventorys (uuid VARCHAR(150) NOT NULL, permission VARCHAR(150) NOT NULL, PRIMARY KEY (uuid));");
        createSchema.execute();
        createTable.execute();
    }

    /*----------------------------------------------METHODEN----------------------------------------------------------*/

    /**
     * Diese Methode baut eine Verbindung mit der Datenbank auf.
     * @throws SQLException Gibt auftretende SQL-Exceptions weiter
     */
    private void connect() throws SQLException{
        connection = DriverManager.getConnection("jdbc:mysql://"+databaseData.getIpAdress()+":"
                +databaseData.getPort(),databaseData.getUsername(), databaseData.getPassword());
    }

    /*-----------------------------------------GETTER AND SETTER------------------------------------------------------*/

    public static DatabaseConnector getInstance() {
        return instance;
    }

}
