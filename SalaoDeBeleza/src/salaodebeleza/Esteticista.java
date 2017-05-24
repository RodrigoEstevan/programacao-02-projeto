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
    
    protected String especialidade;
    protected String codigoFuncionario;

    public Esteticista(String especialidade, String codigoFuncionario, String tipoTratamento, int codigoProduto, String nomeProduto) {
        super(tipoTratamento, codigoProduto, nomeProduto);
        this.especialidade = especialidade;
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }
    
    
    
    
}
