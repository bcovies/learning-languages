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
public class Problema1 {
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        double litros,velmedia,distancia,tempo;
        
        
        System.out.println("Entre com a velocidade média Km/H: ");
            velmedia = Double.parseDouble(input.nextLine());
        System.out.println("Entre com tempo gasto na viagem em Horas: ");
            tempo = Double.parseDouble(input.nextLine());
            
        distancia = tempo*velmedia;
        
        litros = (distancia/12);
        
        System.out.println("Tempo: "+tempo+"Velociadade média: "+velmedia+"Distância:"+distancia+"Litros: "+litros);
        
        
    }
    
}
