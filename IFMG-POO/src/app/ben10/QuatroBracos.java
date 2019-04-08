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
public class QuatroBracos implements ITransformar{

    @Override
    public Alien Transformar(Individuo individuo) {
        
        double forca = individuo.getForca() * 20;
        double agi = individuo.getAgilidade() / 2;
        double inte = individuo.getInteligencia();
        double peso = individuo.getPeso() * 4;
        double alt = individuo.getAltura() * 3;
        
        Alien alien = new Alien("Quatro Braços", forca, agi, inte, peso, alt);
        return alien;
        
    }
    
    public void LancaMissel(){
        System.out.println("Missel lançado");
    }
    
}