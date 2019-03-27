/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.abstracts;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
public class Cliente implements Cloneable{
    
    private String nome;
    private String cpf;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Cliente(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    @Override
    public Cliente clone() {
        try {
            return (Cliente)super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        
        Cliente cli = (Cliente)obj;
        if(this.cpf.equals(cli.getCpf()))
            return true;
        return false;
        
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
    
    
    
}
