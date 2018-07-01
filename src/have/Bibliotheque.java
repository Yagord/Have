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
public class Bibliotheque {
    private java.util.ArrayList<Livre> alLivres;
    
    public Bibliotheque() {
        this.alLivres = new java.util.ArrayList();
    }
    
    public void ajouterLivre(String id, String titre, String auteur, String numero, String categorie) {
        this.alLivres.add(new Livre(id, titre, auteur, numero, categorie));
    }
    
    public void ajouterLivre(Livre livre) {
        this.alLivres.add(livre);
    }
    
    public void supprimerLivre(String id, String titre, String auteur, String numero, String categorie) {
        this.alLivres.add(new Livre(id, titre, auteur, numero, categorie));
    }
    
    public void supprimerLivre(Livre livre) {
        this.alLivres.add(livre);
    }
    
    public void viderListeLivres() {
        this.alLivres.clear();
    }
}
