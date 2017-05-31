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
public class Esteticista extends Tratamento {
    
    protected String nomeEsteticista;
    protected int codigoFuncionario;

    public Esteticista(String nomeEsteticista, int codigoFuncionario, String tipoTratamento, int codigoProduto, String nomeProduto) {
        super(tipoTratamento, codigoProduto, nomeProduto);
        this.nomeEsteticista = nomeEsteticista;
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getNomeEsteticista() {
        return nomeEsteticista;
    }

    public void setNomeEsteticista(String nomeEsteticista) {
        this.nomeEsteticista = nomeEsteticista;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }
    
    
    
}
