/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaodebeleza;

/**
 *
 * @author 31623913
 */
public class cliente extends Pessoa {
    
    protected String documento;
    protected String email;
    protected int codigoCliente;
    
    public cliente(String nome, String endereco, String cidade, int telefone) {
        super(nome, endereco, cidade, telefone);
    }
    
    public cliente(String documento, String email, int codigoCliente, String nome, String endereco, String cidade, int telefone) {
        super(nome, endereco, cidade, telefone);
        this.documento = documento;
        this.email = email;
        this.codigoCliente = codigoCliente;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    @Override
    public String toString(){
        return super.toString() + "documento: "+documento+ "email " + email + "codigo do cliente"+ codigoCliente;
        
    }

}
