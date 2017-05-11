/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * John rodrigo teste
 */
package salaodebeleza;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author 41646843
 */
public class SalaoDeBeleza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
   
   
   
   
   
    System.out.printf("Informe o nome de arquivo texto:\n");
    String nome = ler.nextLine();
 
    System.out.printf("\nConteúdo do arquivo texto:\n");
    try {
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);
 
      String linha = lerArq.readLine(); 
      while (linha != null) {
        System.out.printf("%s\n", linha);
        System.out.println("\n");
 
        linha = lerArq.readLine(); 
      }
 
      arq.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
          e.getMessage());
    }
 
    System.out.println();


    }
    
    
}
