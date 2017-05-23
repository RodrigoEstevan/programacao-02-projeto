/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaodebeleza;
import java.util.ArrayList;

/**
 *
 * @author 31623913
 */
public class Cliente {
    protected String nome;
    protected String telefone;
    protected String email;
    protected String codigoCliente;
    
   
    
    public Cliente (String email, String codigoCliente, String nome, String telefone) {
        
        
        this.email = email;
        this.codigoCliente = codigoCliente;
        this.nome = nome;
        this.telefone = telefone;
    }

  

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    @Override
    public String toString(){
        String resultado =  "email:\n"+email+ "\ncodigo do cliente:\n"+codigoCliente+
                "\nNome do cliente:\n" +nome+"\ntelefone do cliente:\n" +telefone;
        return resultado;
        
    }

}
