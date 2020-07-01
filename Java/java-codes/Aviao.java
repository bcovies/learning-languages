/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author 20172101499
 */
public class Aviao extends Commom {

    String prefixo, dataRevisao;
    double percentual;

    Motor m1 = new Motor();
    Motor m2 = new Motor();
    /*
    Setters & Getters.
     */
    public double getPercentual() {
        return percentual;
    }
    
    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }
    
    public String getPrefixo() {
        return prefixo;
    }
    
    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }
    
    public String getDataRevisao() {
        return dataRevisao;
    }
    
    public void setDataRevisao(String dataRevisao) {
        this.dataRevisao = dataRevisao;
    }

    /*
    Construtores;
     */
    
    public Aviao() {
        
    }

    public Aviao(String p) {
        prefixo = p;
    }

    public Aviao(double pp) {
        percentual = pp;
    }

    public Aviao(String p, double pp) {
        prefixo = p;
        percentual = pp;
    }

    public Aviao(double pp, String p) {
        prefixo = p;
        percentual = pp;
    }

    public Aviao(double pp, String p, String dr) {
        dataRevisao = dr;
        prefixo = p;
        percentual = pp;
    }
    
    public Aviao(String prefixo, String dataRevisao, double percentual) {
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
        this.percentual = percentual;
    }
    
    public Aviao(String prefixo, String dataRevisao, double percentual, double pp) {
        super(pp);
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
        this.percentual = percentual;
    }
    
    public Aviao(String prefixo, String dataRevisao, double percentual, int c) {
        super(c);
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
        this.percentual = percentual;
    }
    
    public Aviao(String prefixo, String dataRevisao, double percentual, int c, int np) {
        super(c, np);
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
        this.percentual = percentual;
    }
    
    public Aviao(String prefixo, String dataRevisao, double percentual, double pp, int c, int np) {
        super(pp, c, np);
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
        this.percentual = percentual;
    }
    
    public Aviao(String prefixo, String dataRevisao, double percentual, int c, double pp, int np) {
        super(c, pp, np);
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
        this.percentual = percentual;
    }

    /*
    Cadastrar.
     */
    public void cadastrar(double percentual, String prefixo, String dataRevisao) {
        super.cadastrar(capacidadeTanque, preco, numeroPassageiros);
        setPercentual(percentual);
        setPrefixo(prefixo);
        setDataRevisao(dataRevisao);
    }
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Prefixo: " + prefixo
                + "\nData de revisão: " + dataRevisao
                + "\n");
    }
    
    public void reajustarPreco() {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o percentual de reajuste: ");
        setPercentual(Double.parseDouble(input.nextLine()));
        double novoPreco = percentual * preco;
        System.out.println("Novo valor: " + novoPreco);
    }
}
