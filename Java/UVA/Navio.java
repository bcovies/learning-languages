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
public class Navio extends Commom {

    String nome, dataLancamento;
    int numeroTripulantes;

    Motor m1 = new Motor();
    Motor m2 = new Motor();
    /* 
    Setters & Getters
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    /*
    Construtores;
     */
    public Navio() {

    }

    public Navio(String n) {
        nome = n;
    }

    public Navio(int nt) {
        numeroTripulantes = nt;
    }

    public Navio(String n, int nt) {
        nome = n;
        numeroTripulantes = nt;
    }

    public Navio(int nt, String n) {
        nome = n;
        numeroTripulantes = nt;
    }

    public Navio(int nt, String n, String dl) {
        dataLancamento = dl;
        nome = n;
        numeroTripulantes = nt;
    }

    public Navio(String nome, String dataLancamento, int numeroTripulantes) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.numeroTripulantes = numeroTripulantes;
    }

    /*
    Cadastro;
     */
    public void cadastrar(int numeroTripulantes, String nome, String dataLancamento) {
        super.cadastrar(capacidadeTanque, preco, numeroPassageiros);
        setNome(nome);
        setDataLancamento(dataLancamento);
        setNumeroTripulantes(numeroTripulantes);
    }

    /*
    Imprimir;
     */
    public void imprimir() {
        super.imprimir();
        System.out.println("Nome: " + nome
                + "\nData de Lançamento: " + dataLancamento
                + "\nNúmero de tripulantes: " + numeroTripulantes);
    }

    public void passageirosPorTripulantes() {
        int ppt = numeroPassageiros / numeroTripulantes;
        System.out.println("Passageiros por tripulante : " + ppt);
    }
}
