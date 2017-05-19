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
public class secretaria extends Pessoa {
    
    protected String codigoSecretaria;

    public secretaria(String nome, String endereco, String cidade, int telefone) {
        super(nome, endereco, cidade, telefone);
    }
    
    public secretaria(String codigoFuncionario, String nome, String endereco, String cidade, int telefone) {
        super(nome, endereco, cidade, telefone);
        this.codigoSecretaria = codigoSecretaria;
    }

    public String getCodigoSecretaria() {
        return codigoSecretaria;
    }

    public void setCodigoSecretaria(String codigoSecretaria) {
        this.codigoSecretaria = codigoSecretaria;
    }
    
    public void cadastrarCliente(){
        
    }
    public void efetuarAgendamento(){
        
    }
    @Override
    public String toString(){
        return super.toString() + "especialidade: "+codigoSecretaria;
    }
}
