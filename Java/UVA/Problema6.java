/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author HDD-PROG
 */
public class Problema1 {
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        
        int num1;
        
        System.out.println("Entre com um número: ");
            num1 = Integer.parseInt(input.nextLine());
        
        if(num1%3==0 && num1%4==0)
        {
            System.out.printf("O número %d é divisível por 3 e 4!\n",num1);
        }
        else
        {
            System.out.printf("O núemro %d não é divisível por 3 e 4!\n",num1);
        }
    }
}
