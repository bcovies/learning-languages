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
public class Commom {

    int capacidadeTanque, numeroPassageiros;
    double preco;

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Commom() {

    }

    public Commom(double pp) {
        preco = pp;
    }

    public Commom(int c) {
        capacidadeTanque = c;
    }

    public Commom(int c, int np) {
        capacidadeTanque = c;
        numeroPassageiros = np;
    }

    public Commom(double pp, int c, int np) {
        capacidadeTanque = c;
        numeroPassageiros = np;
        preco = pp;
    }

    public Commom(int c, double pp, int np) {
        capacidadeTanque = c;
        numeroPassageiros = np;
        preco = pp;
    }

    public void cadastrar(int capacidadeTanque, double preco, int numeroPassageiros) {
        setCapacidadeTanque(capacidadeTanque);
        setNumeroPassageiros(numeroPassageiros);
        setPreco(preco);
    }

    public void imprimir() {
        System.out.println(
                "\nCapacidade do Tanque: " + capacidadeTanque
                + "\nNúmero de Passageiros: " + numeroPassageiros
                + "\nPreço: " + preco);
    }
}
