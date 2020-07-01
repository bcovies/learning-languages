
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20172101499
 */
public class PenDriveEX4 {
    String nome,modelo,cor;
    double preco,peso,comprimento;
    int capacidade;
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setPreco(double preco ){
        this.preco=preco;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }
    public void setComprimento(double comprimento){
        this.comprimento=comprimento;
    }
    public void setCapacidade(int capacidade){
        this.capacidade=capacidade;
    }
    public void setCor(String cor){
        this.cor=cor;
    }    
    
    public void PenDrive(String nome,String modelo){
        this.nome=nome;
        this.modelo=modelo;
    }
    public void PenDrive(double preco,String modelo){
        this.preco=preco;
        this.modelo=modelo;
    }
    public void PenDrive(String nome,double comprimento){
        this.nome=nome;
        this.comprimento=comprimento;
    }
    public void Pendrive(double comprimento,String cor){
        this.cor=cor;
        this.comprimento=comprimento;
    }
    public void PenDrive(int capacidade,double peso){
        this.peso=peso;
        this.capacidade=capacidade;
    }
    void entradaDados(){
        Scanner input = new Scanner (System.in) ;
        System.out.println("Entre com o modelo: ");
            setModelo(input.nextLine());
        System.out.println("Entre com  a capacidade: ");
            setCapacidade(Integer.parseInt(input.nextLine()));
        System.out.println("Entre com o comprimento: ");
            setComprimento(Double.parseDouble(input.nextLine()));
       
        System.out.println("Entre com o peso: ");
            setPeso(Double.parseDouble(input.nextLine()));
        System.out.println("Entre com o preço: ");
            setPreco(Double.parseDouble(input.nextLine())); 
    }
    void imprimir(){
        System.out.println("Listando os atributos: ");
            System.out.printf("%s\n",modelo);
            System.out.printf("%d\n",capacidade);
            System.out.printf("%f\n",comprimento);
            System.out.printf("%f\n",peso);
            System.out.printf("%f\n",preco);
    }
   
}
