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
public class Problema3 
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        double num1, num2, diferencaquad, quaddiferenca;
        System.out.println("Entre com primeiro NÚMERO INTEIRO: ");
            num1 = Double.parseDouble(input.nextLine());
        System.out.println("Entre com o segundo NÚMERO INTEIRO: ");
            num2 = Double.parseDouble(input.nextLine());
        quaddiferenca = (Math.pow(num1,2)) + (Math.pow(num2,2)) - (2*num1*num2);
        diferencaquad =(Math.pow(num1,2)) - (Math.pow(num2,2));
        System.out.println("O quadrado da diferença é: "+quaddiferenca);
        System.out.println("A diferença do quadrado é: "+diferencaquad);
    }
}
