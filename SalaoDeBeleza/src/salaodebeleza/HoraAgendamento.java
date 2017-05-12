/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaodebeleza;

import java.sql.Time;

/**
 *
 * @author 31623913
 */
public class HoraAgendamento extends agendamento {
    protected Time Hora;

    public HoraAgendamento(Time Hora, Double Valor, String formaDePagamento) {
        super(Valor, formaDePagamento);
        this.Hora = Hora;
    }

    public Time getHora() {
        return Hora;
    }

    public void setHora(Time Hora) {
        this.Hora = Hora;
    }
    
 
}
