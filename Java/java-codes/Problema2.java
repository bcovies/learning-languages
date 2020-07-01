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
public class Problema2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        double raio,altura,volume;
        System.out.println("Entre com o Raio da lata: ");
            raio = Double.parseDouble(input.nextLine());
        System.out.println("Entre com a altura da lata:  ");
            altura = Double.parseDouble(input.nextLine());
     volume = Math.pow(raio,2)*altura*Math.PI;
        System.out.println("O volume da lata é: "+volume);
        
    }
}
