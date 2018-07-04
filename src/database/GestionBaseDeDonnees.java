/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import model.Livre;
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
    private int nbColonnes = 0;
    
    private static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS LIVRE" +
                                               "(id int auto_increment NOT NULL PRIMARY KEY, " +
                                               "titre VARCHAR(255), " +
                                               "auteur VARCHAR(255), " +
                                               "numero VARCHAR(255), " +
                                               "categorie VARCHAR(255), " +
                                               "emplacement VARCHAR(255));";
    
    public GestionBaseDeDonnees() {
        this.ouvrirConnection();
    }
    
    private void ouvrirConnection() {
        try {
            Class.forName(GestionBaseDeDonnees.JDBC_DRIVER);
            this.connection = DriverManager.getConnection(GestionBaseDeDonnees.DB_URL, GestionBaseDeDonnees.DB_USERNAME, GestionBaseDeDonnees.DB_PASSWORD);
            this.statement = this.connection.createStatement();
            System.out.println("Connexion...");
            this.createTableLivre();
            System.out.println("Table crée.");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionBaseDeDonnees.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GestionBaseDeDonnees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void fermerConnection() {
        try {
            this.statement.close();
            this.connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestionBaseDeDonnees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void createTableLivre() {
        try {
            this.statement.execute(GestionBaseDeDonnees.CREATE_TABLE);
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
            String emplacement = livre.getEmplacement();
            String sqlQuery = "INSERT INTO LIVRE (titre, auteur, numero, categorie, emplacement) VALUES ('" +
                              titre + "', '" + auteur + "', '" + numero + "', '" + categorie + "', '" + emplacement + "');";
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
            
            this.nbColonnes = resultSet.getMetaData().getColumnCount();
                    
            while (resultSet.next()) {
                Livre livre = new Livre(resultSet.getString("id"), resultSet.getString("titre"), resultSet.getString("auteur"), resultSet.getString("numero"), resultSet.getString("categorie"), resultSet.getString("emplacement"));
                alLivres.add(livre);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionBaseDeDonnees.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alLivres;
    }
    
    public java.util.ArrayList<Object[]> selectAllObjectsFromLivre() {
        java.util.ArrayList<Object[]> alObjects = new java.util.ArrayList();
        try {
            String sqlQuery = "SELECT * FROM LIVRE;";
            ResultSet resultSet = this.statement.executeQuery(sqlQuery);
            
            this.nbColonnes = resultSet.getMetaData().getColumnCount();
            
            while (resultSet.next()) {
                Object[] objects = new Object[this.nbColonnes];
                for (int i = 1; i <= this.nbColonnes; i++) {
                    objects[i-1] = resultSet.getObject(i);
                }
                alObjects.add(objects);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionBaseDeDonnees.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alObjects;
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
    
    public void deleteAllFromLivre() {
        try {
            String sqlQuery = "DELETE FROM LIVRE;";
            this.statement.execute(sqlQuery);
        } catch (SQLException ex) {
            Logger.getLogger(GestionBaseDeDonnees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteLivreWhereId(Livre livre) {
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
    
    public void deleteLivreWhereId(String id) {
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
                              "emplacement = '" + livre.getCategorie()+ "' " +
                              "WHERE id = '" + livre.getId() + "';";
            this.statement.executeUpdate(sqlQuery);
        } catch (SQLException ex) {
            Logger.getLogger(GestionBaseDeDonnees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void dropTableLivre() {
        try {
            String sqlQuery = "DROP TABLE LIVRE;";
            this.statement.executeUpdate(sqlQuery);
        } catch (SQLException ex) {
            Logger.getLogger(GestionBaseDeDonnees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void dropTableLivreAndRecreateTableLivre() {
        this.dropTableLivre();
        this.createTableLivre();
    }
    
    public int getNbColonne() {
        return this.nbColonnes;
    }

}
