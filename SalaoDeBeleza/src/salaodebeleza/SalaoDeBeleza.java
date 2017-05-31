/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * John rodrigo teste
 */
package salaodebeleza;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author 41646843
 */
public class SalaoDeBeleza {
    public static void main(String[] args) {
         String horario= "";
         int opcao = 0;
         String data = "";
         String cod = "";
         int cont = 0;
         String[] vetorData = new String [20];
         String[] vetorHorario = new String [20];
         Scanner dado = new Scanner (System.in);
         Date DataAgendamento = new Date();
         SimpleDateFormat formatar = new SimpleDateFormat("dd/MMM/yyyy -- kk:mm");
         String DataFormatada = formatar.format(DataAgendamento);
         System.out.println("Data e hora do agendamento:");
         System.out.println (DataFormatada);
         
         ArrayList<Cliente> clientes = new ArrayList<Cliente>();
         ArrayList<Esteticista> esteticistas = new ArrayList<Esteticista>();
         
          Esteticista esteticita = new Esteticista ("tratamento de pele", 993, "creme hidratante", 881, "janaina");
          Esteticista esteticita2 = new Esteticista ("tratamento capilar", 793, "creme capilar", 581, "rafaela");
        
          esteticistas.add(esteticita);
          esteticistas.add(esteticita2);
         
   
          Cliente cliente = new Cliente ("johnsousa07@gmail.com", "123", "john","123456789");
          Cliente cliente1 = new Cliente ("jrodrigo@gmail.com", "456", "rodrigo","987456123");
          Cliente cliente2 = new Cliente ("matheus@gmail.com", "485", "matheus","3652141");
          Cliente cliente3 = new Cliente ("thamires@gmail.com", "258", "thamires","78965412");
         
          clientes.add(cliente);
          clientes.add(cliente1);
          clientes.add(cliente2);
          clientes.add(cliente3);
          
          
          
         
          
                do{
                    System.out.println("Lembrete, agendamentos feitos apenas para o dia de hoje");
                    
                    System.out.println("Escolha a opção desejada:\n"+"1- Consultar cliente\n"+
                          "2- Consultar agendamento\n"+"3 - Sair");
                  opcao = dado.nextInt ();  
                  
                            switch(opcao){
                                    case 1:
                                      
                                        System.out.println("Digite o codigo do cliente:");
                                        cod = dado.next();
                                        
                                        for(Cliente c : clientes){
                                            if(cod.equals(c.getCodigoCliente())){
                                               System.out.println (c);
                                               cont ++;
                                            }
                                          
                                            }
                                            if(cont == 0){
                                                System.out.println("codigo invalido , tente novamente");
                                             } 
                                    break;
                                        
                                    case 2:
                                      for(int i = 0; i < vetorData.length; i++){
                                        
                                            System.out.println("digite o codigo do cliente");
                                            cod = dado.next();
                                        
                                               for(Cliente c : clientes){
                                                    if(cod.equals(c.getCodigoCliente())){
                                                        
                                                         System.out.println (c);
                                                         cont ++;
                                                        }
                                                    
                                          
                                                }
                                          
                                         if(cont == 0){
                                            System.out.println("codigo invalido , tente novamente");
                                                      
                                        
                                        }else{
                                            System.out.println("digite a data desejada");
                                            data = dado.next();
                                        
                                            System.out.println("digite o horario desejado");
                                            horario = dado.next();
                                            
                                            
                                            System.out.println("A consulta foi marcada para dia " + data +
                                                               " no horario   " + horario + " efetuada  em " + DataFormatada );
                                           
                                        }
                                      }
                                      
                                              
                                        
                                        
                                    break;
                                        
                                    default:
                                        System.out.println("numero invalido , tente novamente");
                                        System.out.println("");
                                }
                    
                }while((opcao > 0)&&(opcao >3));
        
   
    
       
           
           
            
              
                        
                      
                    
                
         
                      
                       
                      
                     
                      
                      
                 
}
}