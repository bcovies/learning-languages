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
public class Motor {

    int potenciaMaxima, potenciaAtual;
    String tipoCombustivel;

    /*
    Setter & Getters.
     */
    public void setPotenciaMaxima(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaAtual(int potenciaAtual) {
        this.potenciaAtual = potenciaAtual;
    }

    public int getPotenciaAtual() {
        return potenciaAtual;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    /*
    Cadastro & imprimir.
     */
    public Motor() {

    }

    public Motor(int pm) {
        potenciaMaxima = pm;
    }

    public Motor(String tc) {
        tipoCombustivel = tc;
    }

    public Motor(int pm, String tc) {
        potenciaMaxima = pm;
        tipoCombustivel = tc;
    }

    public Motor(String tc, int pm) {
        potenciaMaxima = pm;
        tipoCombustivel = tc;
    }

    public Motor(int pm, int pa, String tc) {
        potenciaAtual = pa;
        potenciaMaxima = pm;
        tipoCombustivel = tc;
    }

    public void cadastrar(int potenciaMaxima, int potenciaAtual, String tipoCombustivel) {
        setPotenciaMaxima(potenciaMaxima);
        setPotenciaAtual(potenciaAtual);
        setTipoCombustivel(tipoCombustivel);
    }

    public void imprimir() {
        System.out.println("Potência máxima: " + potenciaMaxima
                + "\nPotência atual: " + potenciaAtual
                + "\nTipo de combustível: " + tipoCombustivel);
    }

    /*
    Acelerar e Desacelerar.
     */
    public void acelerar() {
        if (potenciaAtual < potenciaMaxima) {
            potenciaAtual += 100;
        }
    }

    public void desacelerar() {
        if (potenciaAtual >= potenciaMaxima) {
            potenciaAtual -= 100;
        }
    }
}
