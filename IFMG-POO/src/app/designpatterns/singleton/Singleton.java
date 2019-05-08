/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.designpatterns.singleton;

/**
 *
 * @author Diego
 */
public class Singleton {
    
    private String nome = "Teste";
    private String cpf = "123";

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private Singleton() {}
    
    public static Singleton getInstance(){
        return new Singleton();
    }
    
}
