/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg4.exercicio.pkg2;
import java.util.Scanner;
/**
 *
 * @author HDD-PROG
 */
public class MesaPrincipal {
    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);
        Mesa p = new Mesa();
        System.out.println("Entre com o nome: ");
            p.setNome(input.nextLine());
        System.out.println("Entre com o modelo: ");
            p.setModelo(input.nextLine());
        System.out.println("Entre com a marca: ");
            p.setMarca(input.nextLine());
        System.out.println("Entre com a cor: ");
            p.setCor(input.nextLine());
        System.out.println("Entre com o peso em KG: ");
            p.setPeso(Double.parseDouble(input.nextLine()));
        System.out.println("Entre com a altura em CM: ");
            p.setAltura(Double.parseDouble(input.nextLine()));
        System.out.println("Entre com a largura em CM: ");
            p.setLargura(Double.parseDouble(input.nextLine()));
        System.out.println("Entre com a profundidade em CM: ");
            p.setProfundidade(Double.parseDouble(input.nextLine()));
        System.out.println("Entre com o preço em REAIS: ");
            p.setPreco(Double.parseDouble(input.nextLine()));
            System.out.println("\n\nSAÍDA DE DADOS\n\n");
            System.out.println("Nome: "+p.nome+"\nModelo: "+p.modelo+"\nMarca: "+p.marca+
                    "\nCor: "+p.cor+"\nPeso: "+p.peso+"g\nAltura: "+p.altura+"cm\nLargura: "+p.largura+
                    "cm\nProfundidade: "+p.profundidade+"Preço: "+p.preco+"reais\nPés: "+p.pes);
    }
}
