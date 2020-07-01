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
public class TelevisaoPrincipal {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        Televisao p = new Televisao();
        System.out.println("Entre com o tamanho da TV(pol.): ");
            p.setPolegadas(Integer.parseInt(input.nextLine()));
        //Entrada em String.
        System.out.println("Entre com a Marca da Tv: ");
            p.setMarca(input.nextLine());
        System.out.println("Entre com o modelo da Tv: ");
            p.setModelo(input.nextLine());
        System.out.println("Entre com o tipo de Tela (LED,LCD,PLASMA): ");
            p.setTipoTela(input.nextLine());
        System.out.println("Entre com a resolução da Tv: ");
            p.setResolucao(input.nextLine());
        System.out.println("Entre com a cor da Tv: ");
            p.setCor(input.nextLine());
        //Entrada em Double.
        System.out.println("Entre com o peso em KG: ");
            p.setPeso(Long.parseLong(input.nextLine()));
        System.out.println("Entre com a largura em CM: ");
            p.setLargura(Double.parseDouble(input.nextLine()));
        System.out.println("Entre com a altura em CM: ");
            p.setAltura(Double.parseDouble(input.nextLine())); 
        System.out.println("Entre com a profundidade em CM: ");
            p.setProfundidade(Double.parseDouble(input.nextLine()));
        //Saída de todos os dados
        System.out.println("\nMarca: "+p.marca
                + "\nModelo: "+p.modelo
                + "\nTipo de tela: "+p.tipotela
                + "\nResolução: "+p.resolucao
                + "\nCor: "+p.cor
                + " KG\nPeso: "+p.peso
                + " cm\nLargura: "+p.largura
                + " cm\nAltura: "+p.altura
                + " cm\nProfundidade: "+p.profundidade
                + "cm\nPolegadas: "+p.polegadas+"''\n");
    }
}
