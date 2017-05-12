/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaodebeleza;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 31623913
 */
public class DataAgendamento extends agendamento {
    protected Date Data;

    public DataAgendamento(Date Data, Double Valor, String formaDePagamento) {
        super(Valor, formaDePagamento);
        this.Data = Data;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }
    
    Date DataAgendamento = new Date();
    SimpleDateFormat formatar = new SimpleDateFormat("d");
    protected String DataFormatada = formatar.format(DataAgendamento);
    
}
