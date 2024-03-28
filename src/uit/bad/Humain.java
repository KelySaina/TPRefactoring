/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uit.bad;

/**
 *
 * @author thyler
 */
public class Humain implements Consommation {
    String nom;
    String prenom;
    int age;
    
    public void details(){
        System.out.println("Nom: "+this.nom+"\n\nPrenom: "+this.nom+"Age: "+this.nom);
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
