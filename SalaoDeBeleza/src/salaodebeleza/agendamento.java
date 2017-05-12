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
public class agendamento {
    protected Double Valor;
    protected String formaDePagamento;

    public agendamento(Double Valor, String formaDePagamento) {
        this.Valor = Valor;
        this.formaDePagamento = formaDePagamento;
    }
    
    public Double getValor() {
        return Valor;
    }

    public void setValor(Double Valor) {
        this.Valor = Valor;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
    
    
    

    
}
