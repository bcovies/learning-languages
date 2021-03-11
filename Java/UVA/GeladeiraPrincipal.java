/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg4.exercicio.pkg2;
import java.util.Scanner;
/**
 *
 * @author HDD-PROG
 */
public class GeladeiraPrincipal {
    public static void main(String[]args)
    {
    Scanner input= new Scanner(System.in);
    Geladeira p = new Geladeira();

//Entrada de dados String do usuário.    

        System.out.println("Entre com Marca da geladeira: ");
            p.setMarca(input.nextLine());
        System.out.println("Entre com a Cor da geladeira: ");
            p.setCor(input.nextLine());
        System.out.println("Entre com o Modelo da geladeira: ");
            p.setModelo(input.nextLine());

//Entrada de dados Double do usuário.

        System.out.println("Entre com quantidade de portas da geladeira: ");
            p.setPortas(Short.parseShort(input.nextLine()));   
        System.out.println("Entre com o armazenamento total da geladeira: ");
            p.setArmazenamentoTotal(Short.parseShort(input.nextLine()));   
        System.out.println("Entre com o consumo da geladeira: ");
            p.setConsumo(Double.parseDouble(input.nextLine()));   
        System.out.println("Entre com a potência da geladeira: ");
            p.setPotencia(Double.parseDouble(input.nextLine()));
        System.out.println("Entre com o preço da geladeira: ");
            p.setPreco(Double.parseDouble(input.nextLine()));
         
//Saída de Dados.
    
        System.out.println("\nMarca: "+p.marca
                + "\nCor: "+p.cor
                + "\nModelo: "+p.modelo
                + "\nPortas: "+p.portas
                + "\nArmazenamento total: "+p.armazenamentototal
                + "L\nConsumo: "+p.consumo
                        + "kW/h\nPotência: "+p.potencia
                        + "W\nPreço: "+p.preco
                        + "Reais\n"
                        );
    }
}