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
public class secretaria extends Pessoa {

    public secretaria(String nome, String endereco, String cidade, int telefone) {
        super(nome, endereco, cidade, telefone);
    }
    
    protected String codigoFuncionario;

    public secretaria(String codigoFuncionario, String nome, String endereco, String cidade, int telefone) {
        super(nome, endereco, cidade, telefone);
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }
    
    
    
    
    
}
