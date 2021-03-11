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
public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aviao av1 = new Aviao();
            av1.m1.cadastrar(1000, 300, "Diesel");
            av1.m2.cadastrar(1000, 300, "Diesel");
            av1.m1.acelerar();
            av1.m2.acelerar();
            av1.m1.imprimir();
            av1.m2.imprimir();
            av1.cadastrar(30, 26, 70);
            av1.cadastrar(20, "Avis", "2018.1");
            av1.imprimir();
            
        Aviao av2 = new Aviao();
            av2.m1.cadastrar(10345, 600, "Diesel");
            av2.m2.cadastrar(10345,600, "Diesel");
            av2.m1.imprimir();
            av2.m2.imprimir();
            av2.cadastrar(20, 50, 55);
            av2.cadastrar(20, "Avis", "2018.1");
            av2.imprimir();
            av2.m1.desacelerar();
            av2.m2.desacelerar();
        Aviao av3 = new Aviao();
            av3.m1.cadastrar(1230, 500, "Diesel");
            av3.m2.cadastrar(1230, 500, "Diesel");
            av3.m1.imprimir();
            av3.m2.imprimir();
            av3.cadastrar(20, 30, 12);
            av3.cadastrar(20, "Avis", "2018.1");
            av3.imprimir();
            av3.m1.desacelerar();
            av3.m2.desacelerar();
            av3.m1.imprimir();
            av3.m2.imprimir();
        Navio na1 = new Navio();
            na1.m1.cadastrar(1880, 100, "Diesel");
            na1.m2.cadastrar(1880, 100, "Diesel");
            na1.m1.imprimir();
            na1.m2.imprimir();
            na1.cadastrar(40, "Navis", "2018");
            na1.cadastrar(40, 9000, 400);
            na1.imprimir();
            na1.m1.acelerar();
            na1.m2.acelerar();
            na1.m1.imprimir();
            na1.m2.imprimir();
        Navio na2 = new Navio();
            na2.m1.cadastrar(1550, 300, "Diesel");
            na2.m2.cadastrar(1550, 300, "Diesel");
            na2.m1.imprimir();
            na2.m2.imprimir();
            na2.cadastrar(30, "Navis", "2018");
            na2.cadastrar(50, 9840, 810);
            na2.imprimir();
            na2.m1.desacelerar();
            na2.m2.desacelerar();
            na2.m1.imprimir();
            na2.m2.imprimir();
        Navio na3 = new Navio();
            na3.m1.cadastrar(1770, 800, "Diesel");
            na3.m2.cadastrar(1770, 800, "Diesel");
            na3.m1.imprimir();
            na3.m2.imprimir();
            na3.cadastrar(88, "Navis", "2018");
            na3.cadastrar(45, 4860, 650);
            na3.imprimir();
            na3.m1.desacelerar();
            na3.m2.desacelerar();
            na3.m1.imprimir();
            na3.m2.imprimir();
    }

}
