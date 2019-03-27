/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.generics;

import app.abstracts.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente cli1 = new Cliente("nome", "123", 10);
        Cliente cli2 = cli1;
        
        cli1.setNome("x");
        
        boolean igual = cli1.equals(cli2);
        int stop = 0;
        
//        double r = Soma(a,b);
//        System.out.println(r);
        
    }
    
    public static <T> double Soma(T a, T b){
        
        boolean isShort = a instanceof Short;
        //double r = a + b;
        //return r;
        return 0;
        
    }
    
//    public static int Soma(int a, int b){
//        return a+b;
//    }
//    
//    public static double Soma(double a, double b){
//        return a+b;
//    }
    
}
