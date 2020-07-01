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
public class Problema3 {
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);
        int mes;
        System.out.println("Entre com o mês desejado: ");
            mes = Integer.parseInt(input.nextLine());
        switch(mes)
        {
            case 2: System.out.println("Número de dias: 28");
            break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("Número de dias: 31");
            break;
            
            case 4:
            case 6:
            case 9:
            case 11: System.out.println("Número de dias: 30");
            break;
            default: System.out.println("O mês digitado não existe!");
        }
    }
}
