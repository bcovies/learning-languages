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
public class Problema4 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        float dolar,real;
        System.out.println("Entre com o câmbio atual do dólar: ");
            dolar = Float.parseFloat(input.nextLine());
        System.out.println("Entre com o valor a ser convertido: ");
            real = Float.parseFloat(input.nextLine());
        System.out.println("O valor da conversão é : "+dolar*real);
    }
}
