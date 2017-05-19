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
public class DataAgendamento extends agendamento{
    protected Date data;
    protected Time hora;

    public DataAgendamento(Date data, Time hora, Double Valor, String formaDePagamento) {
        super(Valor, formaDePagamento);
        this.data = new Date();
        this.data = data;
        this.hora = hora;
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