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
public class Esteticista extends Pessoa{
    
    public Esteticista(String nome, String endereco, String cidade, int telefone) {
        super(nome, endereco, cidade, telefone);
    }
    protected String especialidade;
    protected  String codigoEsteticista;

    public Esteticista(String especialidade, String codigoFuncionario, String nome, String endereco, String cidade, int telefone) {
        super(nome, endereco, cidade, telefone);
        this.especialidade = especialidade;
        this.codigoEsteticista = codigoEsteticista;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCodigoEsteticista() {
        return codigoEsteticista;
    }

    public void setCodigoEsteticista(String codigoEsteticista) {
        this.codigoEsteticista= codigoEsteticista;
    }
    
    public void efetuarTratamento(){
        
      
        
        
    }
    @Override
    public String toString(){
        return super.toString() + "especialidade: "+especialidade+ "codigo do funcionario " +codigoEsteticista;
    }
    
}
