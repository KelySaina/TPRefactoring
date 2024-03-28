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
    Humain ami;
    int amiDuration = 100;
    
    public void details(){
        System.out.println("Nom: "+this.nom+"\nPrenom: "+this.prenom+"\nAge: "+this.age);
    }
    
    public int ami(Humain autreHumain){
        ami(autreHumain, 100);
        return amiDuration;
    }
    
    public int ami(Humain autreHumain, int duration) { 
        this.ami = autreHumain;
        autreHumain.ami = this;
        this.amiDuration = duration;
        return amiDuration;
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
