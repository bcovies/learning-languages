/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg5.exemplos;

/**
 *
 * @author HDD-PROG
 */
public class Exercicio {
    
    String marca,modelo;
    int capacidade;
    double comprimento,largura,profundidade,peso,preco;
    
    /*
    Setters & Getters;
    */
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

    /*
    Construtores;
    */
    
    public Exercicio(){
        
    }
    public Exercicio(String marca) {
        this.marca = marca;
    }

    public Exercicio(int capacidade) {
        this.capacidade = capacidade;
    }

    public Exercicio(double comprimento) {
        this.comprimento = comprimento;
    }

    public Exercicio(String marca, int capacidade) {
        this.marca = marca;
        this.capacidade = capacidade;
    }

    public Exercicio(String marca, double comprimento) {
        this.marca = marca;
        this.comprimento = comprimento;
    }

    public Exercicio(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Exercicio(String marca, String modelo, int capacidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade = capacidade;
    }

    public Exercicio(String marca, String modelo, double comprimento) {
        this.marca = marca;
        this.modelo = modelo;
        this.comprimento = comprimento;
    }

    public Exercicio(String marca, String modelo, int capacidade, double comprimento) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.comprimento = comprimento;
    }

    public Exercicio(String marca, String modelo, int capacidade, double comprimento, double largura) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public Exercicio(String marca, String modelo, int capacidade, double comprimento, double largura, double profundidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.comprimento = comprimento;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    public Exercicio(String marca, String modelo, int capacidade, double comprimento, double largura, double profundidade, double peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.comprimento = comprimento;
        this.largura = largura;
        this.profundidade = profundidade;
        this.peso = peso;
    }
    
    public Exercicio(String marca, String modelo, int capacidade, double comprimento, double largura, double profundidade, double peso, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.comprimento = comprimento;
        this.largura = largura;
        this.profundidade = profundidade;
        this.peso = peso;
        this.preco = preco;
    }
    
}

