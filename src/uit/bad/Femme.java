/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uit.bad;

/**
 *
 * @author thyler
 */
public class Femme extends Humain {

    public Femme() {
    }
    

    public Femme(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Nom: " + this.nom + "\nPrénom: " + this.prenom + "\nAge: " + this.age;
    }
    
    //Femme's toString() Override Humain's toString()
    
    public static void main(String[] args){
        Homme h = new Homme();
        Femme f = new Femme();
        
        f.ami(h);
    }
}
