/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uit.bad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thyler
 */
public class Humain implements Consommation {
    String nom;
    String prenom;
    int age;
    List<Humain> amis;
    
    public void details(){
        System.out.println("Nom: "+this.nom+"\n\nPrenom: "+this.prenom+"Age: "+this.age);
    }
    
    public void ami(Humain autreHumain) {
        if (amis == null) {
            amis = new ArrayList<>();
        }
        amis.add(autreHumain);
        autreHumain.ajouterAmi(this); // Ajouter réciproquement l'humain comme ami de l'autre
    }
    
    // Méthode pour ajouter un ami (réciproque)
    private void ajouterAmi(Humain ami) {
        if (amis == null) {
            amis = new ArrayList<>();
        }
        amis.add(ami);
    }
    
    @Override
    public String toString() {
        return "Nom: " + this.nom + "\nPrénom: " + this.prenom + "\nAge: " + this.age;
    }
    
    @Override
    public void boire(){
        
    }

    @Override
    public void manger() {
        
    }
}
