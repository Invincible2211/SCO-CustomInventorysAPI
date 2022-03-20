package de.fynn.sco.custominventoryapi.model;

/**
 * @author Freddyblitz
 * @version 1.0
 */
public class DatabaseData {

    /*----------------------------------------------ATTRIBUTE---------------------------------------------------------*/

    private final String schema;
    private final String ipAdress;
    private final String port;
    private final String username;
    private final String password;

    /*--------------------------------------------KONSTRUKTOREN-------------------------------------------------------*/

    public DatabaseData(String schema, String ipAdress, String port, String username, String password){
        this.schema = schema;
        this.ipAdress = ipAdress;
        this.port = port;
        this.username = username;
        this.password = password;
    }

    /*-----------------------------------------GETTER AND SETTER------------------------------------------------------*/

    public String getSchema() {
        return schema;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public String getPort() {
        return port;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
