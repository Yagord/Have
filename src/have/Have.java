/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package have;

/**
 *
 * @author Pierre-Nicolas
 */
public class Have {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestionBaseDeDonnees gestionBaseDeDonnees = new GestionBaseDeDonnees();
        Livre livre = new Livre("", "One Piece", "Eiichirō Oda", "1", "Shonen");
        gestionBaseDeDonnees.insertIntoLivre(livre);
        System.out.println(gestionBaseDeDonnees.selectAllFromLivre());
    }
    
}
