/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaodebeleza;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 31623913
 */
public class Agendamento {
    protected Double valor;
    protected String formaDePagamento;
    protected Date data;
    protected Time hora;

    public Agendamento(Double valor, String formaDePagamento, Date data, Time hora) {
        this.valor = valor;
        this.formaDePagamento = formaDePagamento;
        this.data = data;
        this.hora = hora;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }
    
    public static void main(String[] args){
        Date DataAgendamento = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy -- kk:mm");
        String DataFormatada = formatar.format(DataAgendamento);
        System.out.println("Data e hora do agendamento:");
        System.out.println (DataFormatada);
}

    
}
