/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaodebeleza;

/**
 *
 * @author 31324673
 */
public class Tratamento {
    protected String tipoTratamento;
    protected int codigoProduto;
    protected String nomeProduto;

    public Tratamento(String tipoTratamento, int codigoProduto, String nomeProduto) {
        this.tipoTratamento = tipoTratamento;
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
    }

    public String getTipoTratamento() {
        return tipoTratamento;
    }

    public void setTipoTratamento(String tipoTratamento) {
        this.tipoTratamento = tipoTratamento;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    
    
    
}
