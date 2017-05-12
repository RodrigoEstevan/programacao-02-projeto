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
    
    protected Date Data;
    protected Time Hora;

    public DataAgendamento(Date Data, Time Hora, Double Valor, String formaDePagamento) {
        super(Valor, formaDePagamento);
        this.Data = new Date();
        this.Data = Data;
        this.Hora = Hora;
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
    
    Date Data = new Date();
    SimpleDateFormat formatar = new SimpleDateFormat("y");
    protected String DataFormatada = formatar.format(Data);

}
