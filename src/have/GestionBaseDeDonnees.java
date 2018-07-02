/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package have;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
    private static final String DB_URL = "jdbc:h2:~/bookDB";
    private static final String DB_USERNAME = "test";
    private static final String DB_PASSWORD = "test";
    private Connection connection;
    private Statement statement;
    
    private static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS LIVRE" +
                                               "(id int auto_increment NOT NULL PRIMARY KEY, " +
                                               "titre VARCHAR(255), " +
                                               "auteur VARCHAR(255), " +
                                               "numero VARCHAR(255), " +
                                               "categorie VARCHAR(255));";
    
    public GestionBaseDeDonnees() {
        this.ouvrirConnection();
    }
    
    private void ouvrirConnection() {
        try {
            Class.forName(GestionBaseDeDonnees.JDBC_DRIVER);
            this.connection = DriverManager.getConnection(GestionBaseDeDonnees.DB_URL, GestionBaseDeDonnees.DB_USERNAME, GestionBaseDeDonnees.DB_PASSWORD);
            this.statement = this.connection.createStatement();
            System.out.println("Connexion...");
            this.statement.execute(GestionBaseDeDonnees.CREATE_TABLE);
            System.out.println("Table crée.");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionBaseDeDonnees.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GestionBaseDeDonnees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertIntoLivre(Livre livre) {
        try {
            String titre = livre.getTitre();
            String auteur = livre.getAuteur();
            String numero = livre.getNumero();
            String categorie = livre.getCategorie();
            String sqlQuery = "INSERT INTO LIVRE (titre, auteur, numero, categorie) VALUES ('" +
                              titre + "', '" + auteur + "', '" + numero + "', '" + categorie + "');";
            this.statement.executeUpdate(sqlQuery);
        } catch (SQLException ex) {
            Logger.getLogger(GestionBaseDeDonnees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public java.util.ArrayList<Livre> selectAllFromLivre() {
        java.util.ArrayList<Livre> alLivres = new java.util.ArrayList();
        try {
            String sqlQuery = "SELECT * FROM LIVRE;";
            ResultSet resultSet = this.statement.executeQuery(sqlQuery);
            
            while (resultSet.next()) {
                Livre livre = new Livre(resultSet.getString("id"), resultSet.getString("titre"), resultSet.getString("auteur"), resultSet.getString("numero"), resultSet.getString("categorie"));
                alLivres.add(livre);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionBaseDeDonnees.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alLivres;
    }
    
    public int selectCountAllFromLivre() {
        int res = 0;
        try {
            String sqlQuery = "SELECT COUNT(*) FROM LIVRE;";
            ResultSet resultSet = this.statement.executeQuery(sqlQuery);
            resultSet.next();
            res = resultSet.getInt(1);
            
        } catch (SQLException ex) {
            Logger.getLogger(GestionBaseDeDonnees.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
    public void dropAllFromLivre() {
        try {
            String sqlQuery = "DELETE FROM LIVRE;";
            this.statement.execute(sqlQuery);
        } catch (SQLException ex) {
            Logger.getLogger(GestionBaseDeDonnees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void dropLivreWhereId(Livre livre) {
        try {
            String id = livre.getId();
            String sqlQuery = "DELETE " +
                              "FROM LIVRE " +
                              "WHERE LIVRE.id = " + id;
            this.statement.executeUpdate(sqlQuery);
        } catch (SQLException ex) {
            Logger.getLogger(GestionBaseDeDonnees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void dropLivreWhereId(String id) {
        try {
            String sqlQuery = "DELETE " +
                              "FROM LIVRE " +
                              "WHERE LIVRE.id = " + id;
            this.statement.executeUpdate(sqlQuery);
        } catch (SQLException ex) {
            Logger.getLogger(GestionBaseDeDonnees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateLivreWhereId(Livre livre) {
        try {
            String sqlQuery = "UPDATE LIVRE " +
                              "SET titre = '" + livre.getTitre()+ "', " +
                              "auteur = '" + livre.getAuteur() + "', " +
                              "numero = '" + livre.getNumero()+ "', " +
                              "categorie = '" + livre.getCategorie()+ "' " +
                              "WHERE id = '" + livre.getId() + "';";
            this.statement.executeUpdate(sqlQuery);
        } catch (SQLException ex) {
            Logger.getLogger(GestionBaseDeDonnees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
