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
    
    public cliente(String nome, String endereco, String cidade, int telefone) {
        super(nome, endereco, cidade, telefone);
    }
    
    protected String Documento;
    protected String Email;
    protected int codigoCliente;

    public cliente(String Documento, String Email, int codigoCliente, String nome, String endereco, String cidade, int telefone) {
        super(nome, endereco, cidade, telefone);
        this.Documento = Documento;
        this.Email = Email;
        this.codigoCliente = codigoCliente;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

}
