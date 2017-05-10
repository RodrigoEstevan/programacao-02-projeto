/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaodebeleza;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author 31623913
 */
public class agendamento {
    protected Date Data;
    protected Time Hora;
    protected Double Valor;
    protected String formaDePagamento;

    public agendamento(Date Data, Time Hora, Double Valor, String formaDePagamento) {
        this.Data = Data;
        this.Hora = Hora;
        this.Valor = Valor;
        this.formaDePagamento = formaDePagamento;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

    public Time getHora() {
        return Hora;
    }

    public void setHora(Time Hora) {
        this.Hora = Hora;
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
