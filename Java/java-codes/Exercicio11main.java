/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg5.exemplos;

import java.util.Scanner;

/**
 *
 * @author HDD-PROG
 */
public class Exerciciomain {
    public static void main (String [] args )
    {
       Scanner input = new Scanner (System.in) ;
       Exercicio p = new Exercicio();
      
        System.out.println("Entre com a marca: ");
            p.setMarca(input.nextLine());
        
        System.out.println("Entre com o modelo: ");
            p.setModelo(input.nextLine());
        
        System.out.println("Entre com  a capacidade: ");
            p.setCapacidade(Integer.parseInt(input.nextLine()));
        
        System.out.println("Entre com o comprimento: ");
            p.setComprimento(Double.parseDouble(input.nextLine()));
       
        System.out.println("Entre com a largura: ");
            p.setLargura(Double.parseDouble(input.nextLine()));
        
        System.out.println("Entre com a profundidade: ");
            p.setProfundidade(Double.parseDouble(input.nextLine()));
        
        System.out.println("Entre com o peso: ");
            p.setPeso(Double.parseDouble(input.nextLine()));
            
        System.out.println("Entre com o preço: ");
            p.setPreco(Double.parseDouble(input.nextLine()));  
            
            System.out.println("Listando os atributos: ");
            System.out.printf("%s\n",p.marca);
            System.out.printf("%s\n",p.modelo);
            System.out.printf("%d\n",p.capacidade);
            System.out.printf("%f\n",p.comprimento);
            System.out.printf("%f\n",p.largura);
            System.out.printf("%f\n",p.profundidade);
            System.out.printf("%f\n",p.peso);
            System.out.printf("%f\n",p.preco);
    }
}
