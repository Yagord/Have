/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pierre-Nicolas
 */
public class Configurations {
    private Properties properties = new Properties();
    
    public void ajouterProperty(String key, String value) {
        this.properties.setProperty(key, value);
    }
    
    public String getProperty(String key) {
        return this.properties.getProperty(key);
    }
    
    public void sauvegarderProperties() {
        try {
            this.properties.store(new FileOutputStream("src/ressources/config.properties"), null);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Configurations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Configurations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void chargerProperties() {
        try {
            this.properties.load(this.getClass().getClassLoader().getResourceAsStream("ressources/config.properties"));
        } catch (IOException ex) {
            Logger.getLogger(Configurations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
