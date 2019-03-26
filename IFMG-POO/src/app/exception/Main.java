/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        
        int x = 5;
        int y = 20;
        
        //Custom exception
        if(x < 10){
            throw new ClienteException();
        }
        
        //LerArquivo();
        
    }
    
    public static String LerArquivo() {
        try {
            FileReader fr = null;
            BufferedReader br = null;
            fr = new FileReader("c:\\files\\ler.txt");
            br = new BufferedReader(fr);
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
            return sCurrentLine;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            System.out.println("Sempre vai rodar esta instrução, independente se cair no catch");
        }
        return "";
    }
    
}
