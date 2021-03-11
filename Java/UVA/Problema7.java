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
public class Problema2 {
    
    public static void main (String [ ] args)
    {
        Scanner input = new Scanner (System.in);
        
        int num;
        
       System.out.println("Entre com a idade do jogador: ");
            num = Integer.parseInt(input.nextLine());
            
     if(num<=10)
     {
         System.out.printf("O jogador tem %d - Categoria Mirim!",num);
     }
     else if(num>10 && num<=18)
     {
         System.out.printf("O jogador tem %d - Categoria Juvenil!",num);
     }
     else if(num>18 && num<=40)
     {
         System.out.printf("O jogador tem %d - Categoria Adulto!",num);
     }
     else
     {
         System.out.printf("O jogador tem %d - Categoria Master!",num);
     }
    }
    
}
