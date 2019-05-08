/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.hoje;

/**
 *
 * @author Diego
 */
public class Personagem {
    
    private String nome;
    private int idade;
    private boolean feliz;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }

    public boolean isFeliz() {
        return feliz;
    }

    public void setFeliz(boolean feliz) {
        this.feliz = feliz;
    }

    public Personagem(String nome, int idade, boolean feliz) {
        this.nome = nome;
        this.idade = idade;
        this.feliz = feliz;
    }
    
}
