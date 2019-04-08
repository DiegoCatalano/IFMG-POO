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
public class XLR8 implements ITransformar{

    @Override
    public Alien Transformar(Individuo individuo) {
        
        double forca = individuo.getForca() * 5;
        double agi = individuo.getAgilidade() * 20;
        double inte = individuo.getInteligencia();
        double peso = individuo.getPeso() * 2;
        double alt = individuo.getAltura() * 1.10;
        
        Alien alien = new Alien("XLR8", forca, agi, inte, peso, alt);
        return alien;
        
    }
    
    public void MaoDeTesoura(){
        System.out.println("Cortar com as maos de tesoura");
    }
    
}
