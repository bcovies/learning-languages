/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg4.extra;
import java.util.Scanner;
/**
 *
 * @author 20172101499
 */
public class Cd {
    
    
    String titulo,banda;
    int capacidade,numerofaixas,codigoidentificacao;
    double duracaocd,preco;
    
    //Criação das classes tipo String.
    public void setTitulo(String tituloo)
    {
        titulo=tituloo;
    }
    public String getTitulo()
    {
        return titulo;
    }
    public void setBanda(String bandaa)
    {
        banda=bandaa;
    }
    public String getBanda()
    {
        return banda;
    }
    //Classes tipo Int
    public void setCapacidade(Integer capacidadee)
    {
        capacidade=capacidadee;
    }
    public Integer getCapacidade()
    {
        return capacidade;
    }
    public void  setNumeroFaixas(Integer numerofaixass)
    {
        numerofaixas=numerofaixass;
    }
    public Integer getNumeroFaixas()
    {
        return numerofaixas;
    }
    public void setCodigoIdentificacao(Integer codigoidentificacaoo)
    {
        codigoidentificacao=codigoidentificacaoo;
    }
    public Integer getCodigoIdentificacao()
    {
        return codigoidentificacao;
    }
    //Classes tipo Double.
    public void setDuracaoCd(Double duracaocdd)
    {
        duracaocd=duracaocdd;
    }
    public Double getDuracaoCd()
    {
        return duracaocd;
    }
    public void setPreco(Double precoo)
    {
        preco=precoo;
    }
    public Double getPreco()
    {
        return preco;
    }
    
    void entradaDados()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o Título do CD: ");
            setTitulo(input.nextLine());
        System.out.println("Entre com o nome da Banda: ");
            setBanda(input.nextLine());
        System.out.println("Entre com a Capacidade do CD: ");
            setCapacidade(Integer.parseInt(input.nextLine()));
       System.out.println("Entre com o número de faixas: ");
            setNumeroFaixas(Integer.parseInt(input.nextLine()));
        System.out.println("Entre com a duração total(Min): ");
            setDuracaoCd(Double.parseDouble(input.nextLine()));
        System.out.println("Entre com o preço do cd(Reais): ");
            setPreco(Double.parseDouble(input.nextLine()));
    }                    
    void imprimir()
    {
        System.out.println("\nTítulo: "+titulo
                + "\nBanda: "+banda
                + "\nCapacidade: "+capacidade
                + "\nNúmero de faixas: "+numerofaixas
                + "\nDuração total: "+duracaocd
                + "Min\nCódigo de identificação: "+codigoidentificacao
                + "\nPreço: "+preco+"Reais\n");
    }
            
}