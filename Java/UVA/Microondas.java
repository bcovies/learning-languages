/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao.pkg2;

/**
 *
 * @author 20172101499
 */
public class Microondas extends Commom {

    /*
    Atributos;
     */
    int potMax, potMin;
    char tipo;

    Porta p1 = new Porta();
    /*
    Setters & Getters;
     */
    public int getPotMax() {
        return potMax;
    }

    public void setPotMax(int potMax) {
        this.potMax = potMax;
    }

    public int getPotMin() {
        return potMin;
    }

    public void setPotMin(int potMin) {
        this.potMin = potMin;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    /*
    Construtores;
     */

    public Microondas() {

    }

    public Microondas(int potMin) {
        this.potMin = potMin;
    }

    public Microondas(char tipo) {
        this.tipo = tipo;
    }

    public Microondas(int potMin, int potMax) {
        this.potMax = potMax;
        this.potMin = potMin;
    }

    public Microondas(int potMax, char tipo) {
        this.potMax = potMax;
        this.tipo = tipo;
    }

    public Microondas(char tipo, int potMax) {
        this.tipo = tipo;
        this.potMax = potMax;
    }

    public Microondas(int potMax, int potMin, char tipo) {
        this.tipo = tipo;
        this.potMax = potMax;
        this.potMin = potMin;
    }

    public Microondas(String marca, String modelo, int volume, double preco) {
        super(marca, modelo, volume, preco);
    }

    public Microondas(String m){
        super(m);
    }
    
    public Microondas(double p, String m) {
        super(p, m);
    }

    public Microondas(String m, double p) {
        super(m, p);
    }

    public Microondas(int v, double p) {
        super(v, p);
    }

    public Microondas(double p, int v) {
        super(p, v);
    }

    /*
    Cadastrar;
     */
    public void cadastrar(int potMax, int potMin, char tipo) {
        super.cadastrar(marca, modelo, volume, preco);
        setTipo(tipo);
        setPotMax(potMax);
        setPotMin(potMin);
    }

    /*
    Imprimir;
     */
    public void imprimir() {
        super.imprimir();
        System.out.println("\nTipo: " + tipo
                + "\nPotência Mínima: " + potMin
                + "!\nPotência Máxima: " + potMax
                + "\n");
    }
}
