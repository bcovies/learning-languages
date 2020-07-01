
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HDD-PROG
 */
public class PenDriveEX2 {
    String marca,modelo;
    int capacidade;
    double comprimento,largura,profundidade,peso,preco;
    public void setMarca(String m)
    {
        marca=m;
    }
    
    public String getMarca()
    {
        return marca;
    }
    public void setModelo(String mm)
    {
        modelo=mm;
    }
    public String getModelo()
    {
        return modelo;
    }
    public void setCapacidade(int c)
    {
        capacidade = c;
    }
    public Integer getCapacidade()
    {
        return capacidade;
    }
    public void setComprimento(double cc)
    {
        comprimento = cc;
    }
    public Double getComprimento()
    {
        return  comprimento;
    }
    public void setLargura(double l)
    {
        largura = l;
    }
    public void setProfundidade(double p)
    {
        profundidade = p;
    } 
    public Double getProfundidade()
    {
        return profundidade;
    }
    
    public void setPeso(double pp)
    {
        peso = pp;
    }
    public Double getPeso()
    {
        return peso;
    }
    public void setPreco(double ppp)
    {
        preco = ppp;
    }
    public Double getPreco()
    {
        return preco;
    }
    void entradaDados(){
        Scanner input = new Scanner (System.in) ;
        System.out.println("Entre com a marca: ");
            setMarca(input.nextLine());
        System.out.println("Entre com o modelo: ");
            setModelo(input.nextLine());
        System.out.println("Entre com  a capacidade: ");
            setCapacidade(Integer.parseInt(input.nextLine()));
        System.out.println("Entre com o comprimento: ");
            setComprimento(Double.parseDouble(input.nextLine()));
        System.out.println("Entre com a largura: ");
            setLargura(Double.parseDouble(input.nextLine()));
        System.out.println("Entre com a profundidade: ");
            setProfundidade(Double.parseDouble(input.nextLine()));
        System.out.println("Entre com o peso: ");
            setPeso(Double.parseDouble(input.nextLine()));
        System.out.println("Entre com o preço: ");
            setPreco(Double.parseDouble(input.nextLine())); 
    }
    void imprimir(){
        System.out.println("Listando os atributos: ");
            System.out.printf("%s\n",marca);
            System.out.printf("%s\n",modelo);
            System.out.printf("%d\n",capacidade);
            System.out.printf("%f\n",comprimento);
            System.out.printf("%f\n",largura);
            System.out.printf("%f\n",profundidade);
            System.out.printf("%f\n",peso);
            System.out.printf("%f\n",preco);
    }
}
