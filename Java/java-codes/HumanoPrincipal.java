/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

/**
 *
 * @author HDD-PROG
 */
public class HumanoPrincipal {
    public static void main (String [] args)
    {
        System.out.println("Criação de objetos Humano: ");
        Humano h1 = new Humano();
        Humano h2 = new Humano();
        h1.setNome("João");
        h1.setIdade(23);
        h1.setPeso(65.4);
        h1.setAltura(1.76);
        System.out.println("Nome: "+h1.getNome()+"Sexo: "+h1.getSexo()+"Idade: "+h1.getIdade()+"Peso: "+h1.getPeso()
        +"Altura: "+h1.getAltura());    
    }
}
