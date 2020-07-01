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
public class CadeiraPrincipal {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        Cadeira p = new Cadeira();
        
//Leitura dos Dados em String.
        System.out.println("Entre com a marca da cadeira: ");
            p.setMarca(input.nextLine());
        System.out.println("Entre com a cor da cadeira: ");
            p.setCor(input.nextLine());
        System.out.println("Entre com o modelo da cadeira: ");
            p.setModelo(input.nextLine());
        System.out.println("Entre com a estrutura da cadeira: ");
            p.setEstrutura(input.nextLine());
        System.out.println("Entre com o revestimento da cadeira: ");
            p.setRevestimento(input.nextLine());
//Leitura dos Dados em Double.
        System.out.println("Entre com o peso da cadeira em KG: ");
            p.setPesoProduto(Double.parseDouble(input.nextLine()));
        System.out.println("Entre com o peso suportado da cadeira em KG: ");
            p.setPesoSuportado(Double.parseDouble(input.nextLine()));
        System.out.println("Entre com a largura da cadeira em CM: ");
            p.setLargura(Float.parseFloat(input.nextLine()));
        System.out.println("Entre com a altura da cadeira em CM: ");
            p.setAltura(Float.parseFloat(input.nextLine()));
        System.out.println("Entre com a profundidade da cadeira em CM: ");
            p.setProfundidade(Float.parseFloat(input.nextLine()));
            
//Mostrando todos os Dados.
        System.out.println("\nMarca: "+p.marca
                + "\nCor: "+p.cor
                + "\nModelo: "+p.modelo
                + "\nEstrutura: "+p.estrutura
                + "\nRevestimento: "+p.revestimento
                + "\nPeso da cadeira: "+p.pesoproduto
                + "KG\nPeso suportado: "+p.pesosuportado
                + "KG\nLargura: "+p.largura
                + "cm\nAltura: "+p.altura
                + "cm\nProfundidade: "+p.profundidade+"cm\n");
    }
}
