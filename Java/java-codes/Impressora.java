/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao.pkg1;

import java.util.Scanner;

/**
 *
 * @author 20172101499
 */
public class Impressora {

    String marca, modelo, tipo, resolucao;
    int numCartuchos;
    float preco;
    double peso, comprimento, largura, profundidade;
    boolean fVerso;    

    /*
    Setters Getters;
     */
    public boolean isfVerso() {
        return fVerso;
    }

    public void setfVerso(boolean fVerso) {
        this.fVerso = fVerso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public int getNumCartuchos() {
        return numCartuchos;
    }

    public void setNumCartuchos(int numCartuchos) {
        this.numCartuchos = numCartuchos;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    /*
    Construtores;
     */
        Impressora() {}

    public Impressora(String m) {
        marca = m;
    }

    public Impressora(String m, String mm) {
        marca = m;
        modelo = mm;
    }

    public Impressora(String m, String mm, String t) {
        marca = m;
        modelo = mm;
        tipo = t;
    }

    public Impressora(String m, String mm, String t, String r) {
        marca = m;
        modelo = mm;
        tipo = t;
        resolucao = t;
    }

    public Impressora(String m, String mm, String t, String r, int n) {
        marca = m;
        modelo = mm;
        tipo = t;
        resolucao = t;
        numCartuchos = n;
    }

    public Impressora(String m, String mm, String t, String r, int n, double p) {
        marca = m;
        modelo = mm;
        tipo = t;
        resolucao = t;
        numCartuchos = n;
        peso = p;
    }

    public Impressora(double p, String m, String mm, String t, String r, int n) {
        marca = m;
        modelo = mm;
        tipo = t;
        resolucao = t;
        numCartuchos = n;
        peso = p;
    }

    public Impressora(int n, double p, String m, String mm, String t, String r) {
        marca = m;
        modelo = mm;
        tipo = t;
        resolucao = t;
        numCartuchos = n;
        peso = p;
    }

    public Impressora(String r, int n, double p, String m, String mm, String t) {
        marca = m;
        modelo = mm;
        tipo = t;
        resolucao = t;
        numCartuchos = n;
        peso = p;
    }

    public Impressora(String t, String r, int n, double p, String m, String mm) {
        marca = m;
        modelo = mm;
        tipo = t;
        resolucao = t;
        numCartuchos = n;
        peso = p;
    }

    public Impressora(double c, double l, double p, int n, String m) {
        comprimento = c;
        largura = l;
        peso = p;
        numCartuchos = n;
        marca = m;
    }

    public Impressora(String m, double c, double l, double p, int n) {
        comprimento = c;
        largura = l;
        peso = p;
        numCartuchos = n;
        marca = m;
    }

    public Impressora(double c, String m, double l, double p, int n) {
        comprimento = c;
        largura = l;
        peso = p;
        numCartuchos = n;
        marca = m;
    }

    public Impressora(double l) {
        largura = l;
    }

    public Impressora(int n) {
        numCartuchos = n;
    }

    public Impressora(boolean f) {
        fVerso = f;
    }

    public Impressora(String m, String mm, String t, String r, int n, double p, boolean f) {
        marca = m;
        modelo = mm;
        tipo = t;
        resolucao = t;
        numCartuchos = n;
        peso = p;
        fVerso = f;
    }

    public Impressora(boolean f, String m, String mm, String t, String r, int n, double p) {
        marca = m;
        modelo = mm;
        tipo = t;
        resolucao = t;
        numCartuchos = n;
        peso = p;
        fVerso = f;
    }

    public Impressora(double p, boolean f, String m, String mm, String t, String r, int n) {
        marca = m;
        modelo = mm;
        tipo = t;
        resolucao = t;
        numCartuchos = n;
        peso = p;
        fVerso = f;
    }

    public Impressora(String mm, double p, boolean f, String m, String t, String r, int n) {
        marca = m;
        modelo = mm;
        tipo = t;
        resolucao = t;
        numCartuchos = n;
        peso = p;
        fVerso = f;
    }

    public void entradaDados() {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com Marca:");
        setMarca(input.nextLine());
        System.out.println("Entre com Modelo:");
        setModelo(input.nextLine());
        System.out.println("Entre com Tipo:");
        setTipo(input.nextLine());
        System.out.println("Entre com Preço:");
        setPreco(Float.parseFloat(input.nextLine()));
        System.out.println("Entre com Resolução:");
        setResolucao(input.nextLine());
        System.out.println("Entre com Número de cartuchos:");
        setNumCartuchos(Integer.parseInt(input.nextLine()));
        System.out.println("Entre se tem Frente e Verso:");
        setfVerso(Boolean.parseBoolean(input.nextLine()));
        System.out.println("Entre com Peso:");
        setPeso(Double.parseDouble(input.nextLine()));
        System.out.println("Entre com Comprimento:");
        setComprimento(Double.parseDouble(input.nextLine()));
        System.out.println("Entre com Largura:");
        setLargura(Double.parseDouble(input.nextLine()));
        System.out.println("Entre com Profundidade:");
        setProfundidade(Double.parseDouble(input.nextLine()));
    }

    public void imprimir() {
        System.out.println("Marca: " + marca
                + "\nModelo: " + modelo
                + "\nTipo: " + tipo
                + "\nPreço: " + preco
                + "\nResolução: " + resolucao
                + "\nNúmero de Cartuchos: " + numCartuchos
                + "\nFrente e Verso: " + fVerso
                + "\nPeso: " + peso
                + "\nComprimento: " + comprimento
                + "\nLargura: " + largura
                + "\nProfundidade: " + profundidade
                + "\n");
    }
}
