/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package have;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pierre-Nicolas
 */
public class GestionBaseDeDonnees {
    private static final String JDBC_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc::h2:~/bookDB";
    private static final String DB_USERNAME = "test";
    private static final String DB_PASSWORD = "test";
    private Connection connection;
    private Statement statement;
    
    private static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS LIVRE" +
                                               "(id int auto_increment NOT NULL PRIMARY KEY," +
                                               "titre VARCHAR(255)," +
                                               "auteur VARCHAR(255)" +
                                               "categorie VARCHAR(255))";
    
    public GestionBaseDeDonnees() {
        this.ouvrirConnection();
    }
    
    private void ouvrirConnection() {
        try {
            Class.forName(GestionBaseDeDonnees.JDBC_DRIVER);
            this.connection = DriverManager.getConnection(GestionBaseDeDonnees.DB_URL, GestionBaseDeDonnees.DB_USERNAME, GestionBaseDeDonnees.DB_PASSWORD);
            this.statement = this.connection.createStatement();
            this.statement.execute(GestionBaseDeDonnees.CREATE_TABLE);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionBaseDeDonnees.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GestionBaseDeDonnees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
