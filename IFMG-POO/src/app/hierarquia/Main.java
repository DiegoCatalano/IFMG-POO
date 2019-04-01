/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.hierarquia;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bombeiro b = new Bombeiro("", 10, 0);
        
        int id = b.getIdade();
        System.out.println(id);
        
        
    }
    
}
