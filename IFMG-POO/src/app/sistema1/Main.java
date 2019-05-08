/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.sistema1;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            ///////////////    ATENCAO       /////////////////
            //Primeira vez ao executar, rodar o Save
            //Demais vezes o LOAD primeiro, ao terminar de fazer tudo, de o ultimo SAVE
            Database db = new Database();
            //db.Save("c:\\files\\db.dat");
            db.Load("c:\\files\\db.dat");
            
            ArrayList<Cliente> clientes = db.getClientes();
            int stop = 0;
//            
//            db.Add(new Cliente("godzilla", "666", 800));
//            db.Save("c:\\files\\db.dat");
            
        
    }
    
}
