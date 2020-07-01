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
public class Problema4 {
    public static void main( String [ ] args)
    {
        int num1,num2;
        Scanner input = new Scanner (System.in);
        System.out.println("Entre com o primeiro número: ");
            num1 = Integer.parseInt(input.nextLine());
        System.out.println("Entre com o segundo número: ");
            num2 = Integer.parseInt(input.nextLine());
            
            do{
               for (num1=num1+1; num1<num2; num1++)
               {
                   if (num1%2 == 0)
                   {
                       System.out.printf("Número : %d\n",num1);
                   }
               }
            }while(num1<num2);
            
        
    }
    
}
