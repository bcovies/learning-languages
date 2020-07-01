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
public class Problema5 {
    @SuppressWarnings("empty-statement")
    public static void main( String[] args)
    {
        Scanner input = new Scanner( System.in);
        int num1=0;
       
       
            while(num1>-1)
                {
                     System.out.println("Entre com -1 para sair e qualquer outro número inteiro positivo para continuar: ");
                        num1 = Integer.parseInt(input.nextLine());
                    
                        if(num1%2 == 0 && num1%3==0)
                    {
                        System.out.printf("%d é divisível por 2 e 3 ao mesmo tempo!\n",num1);
                    }
            
                }
        
    }
}
