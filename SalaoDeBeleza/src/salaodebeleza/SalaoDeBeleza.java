/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * John rodrigo teste
 */
package salaodebeleza;


import java.util.ArrayList;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author 41646843
 */
public class SalaoDeBeleza {
    public static void main(String[] args) {
         int opcao = 0;
         String cod = "";
         Scanner dado = new Scanner (System.in);
         ArrayList<Cliente> clientes = new ArrayList<Cliente>();
         
        
          Cliente cliente = new Cliente ("johnsousa07@gmail.com", "123", "john","123456789");
          Cliente cliente1 = new Cliente ("jrodrigo@gmail.com", "456", "rodrigo","987456123");
          Cliente cliente2 = new Cliente ("matheus@gmail.com", "485", "matheus","3652141");
          Cliente cliente3 = new Cliente ("thamires@gmail.com", "258", "thamires","78965412");
         
          clientes.add(cliente);
          clientes.add(cliente1);
          clientes.add(cliente2);
          clientes.add(cliente3);
         
          
                do{
                  System.out.println("Escolha a opção desejada:\n"+"1- Consultar cliente\n"+
                          "2- Agendamento\n"+"3 - Sair");
                  opcao = dado.nextInt ();  
                  
                            switch(opcao){
                                    case 1:
                                        System.out.println("Digite o codigo do cliente:");
                                        cod = dado.next();
                                        
                                        for(Cliente c : clientes){
                                            if(cod.equals(c.getCodigoCliente())){
                                               System.out.println (c);
                                            
                                            }
                                        }
                                    break;
                                        
                                    case 2:
                                       //agendamento aqui. 
                                        
                                    break;
                                        
                                    default:
                                        System.out.println("numero invalido , tente novamente");
                        
                                     }
                    
                }while((opcao > 0)&&(opcao >3));
        
   
    
       
           
           
            
              
                        
                      
                    
                
         
                      
                       
                      
                     
                      
                      
                 
}
}