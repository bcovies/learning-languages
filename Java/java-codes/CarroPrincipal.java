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
public class CarroPrincipal {
    public static void main(String [] args)
    {
    Scanner input = new Scanner (System.in);
    Carro p = new Carro();
//Leitura de Dados String do usuário.
    System.out.println("Entre com o Câmbio do carro: ");
        p.setCambio(input.nextLine());
    System.out.println("Entre com o modelo do carro: ");
        p.setModelo(input.nextLine());
    System.out.println("Entre com a marca do carro: ");
        p.setMarca(input.nextLine());
//Leitura de Dados Double do usuário.
    System.out.println("Entre com preço do carro: ");
        p.setPreco(Double.parseDouble(input.nextLine()));
    System.out.println("Entre com os KM rodados do carro: ");
        p.setKmRodado(Double.parseDouble(input.nextLine()));
    System.out.println("Entre com o Ano do carro (separe xxxx.xxxx): ");
        p.setAno(Double.parseDouble(input.nextLine()));
    System.out.println("Entre com S para Sedan e H para Hatch: ");
        p.setTipo(input.next().charAt(0));
//Saída de dados.
    System.out.println("\nCâmbio: "+p.cambio
            + "\nModelo: "+p.modelo
            + "\nMarca: "+p.marca
            + "\nAno: "+p.ano
            + "\nKm's rodados: "+p.kmrodado
            + "KM'S\nPreço: "+p.preco
            + "Mil Reais\n"
                    + "Tipo: "+p.tipo);   
    }
}