/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;
import java.util.Scanner;
/**
 *
 * @author HDD-PROG
 */
public class Problema5 
{
    public static void main (String[] args)
    {
        String num;
        float sal,vendas,percentual;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Entre com Salário Fixo: ");
            sal = Float.parseFloat(input.nextLine());
        System.out.println("Entre com o número do vendedor");
            num = (input.nextLine());
        System.out.println("Entre com o total de vendas efetuadas por ele: ");
            vendas = Float.parseFloat(input.nextLine());
        System.out.println("Entre com o percentual sobre o total de vendas: ");
            percentual = Float.parseFloat(input.nextLine());
        System.out.println("O Vendedor "+num+"tem salário de: "+(sal*vendas*percentual));
    }
}
