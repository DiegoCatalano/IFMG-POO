/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.ben10;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Individuo ben10 = new Individuo("Ben 10", 10, 10, 10, 27, 1.48);
        
        ITransformar qb = new QuatroBracos();
        Alien alien = qb.Transformar(ben10);
        
        System.out.println("Nome: " + alien.getNome());
        System.out.println("Força: " + alien.getForca());
        System.out.println("Agilidade: " + alien.getAgilidade());
        System.out.println("Inteligencia: " + alien.getInteligencia());
        
    }
    
}
