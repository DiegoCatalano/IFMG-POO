/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.exception;

/**
 *
 * @author Diego
 */
public class ClienteException extends RuntimeException{

    @Override
    public String toString() {
        return "Erro ao cadastrar cliente";
    }
    
    
    
}
