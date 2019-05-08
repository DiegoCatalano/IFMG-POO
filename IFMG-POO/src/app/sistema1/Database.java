/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.sistema1;

import Catalano.IO.Serialization;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Database implements Serializable{
    
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Produto> produtos = new ArrayList<>();
    private ArrayList<Venda> vendas = new ArrayList<>();

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Database() {}
    
    public void Load(String pathname){
        Database db = (Database)Serialization.Deserialize(pathname);
        this.clientes = db.clientes;
        this.produtos = db.produtos;
        this.vendas = db.vendas;
    }
    
    public void Save(String pathname){
        Serialization.Serialize(this, pathname);
    }
    
    public void Add(Cliente cliente){
        this.clientes.add(cliente);
    }
    
    
    
}
