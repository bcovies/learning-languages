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
public class Porta {
    double comprimento,largura;
    boolean possuiVidro;
    /*
    Setters &  Getters;
    */

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

    public boolean PossuiVidro() {
        return possuiVidro;
    }

    public void setPossuiVidro(boolean possuiVidro) {
        this.possuiVidro = possuiVidro;
    }
    /*
    Contrutores
    */
    public Porta(){
        
    }
    public Porta(double comprimento, double largura, boolean possuiVidro) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.possuiVidro = possuiVidro;
    }
    public Porta(double c){
        comprimento = c;
    }
    public Porta(boolean pv){
        possuiVidro= pv;
    }
    public Porta(boolean pv, double c){
        possuiVidro=pv;
        comprimento =c ;
    }
    public Porta(double c, boolean pv){
        comprimento =c ;
        possuiVidro=pv;
    }
    /*
    Cadastrar
    */
    public void cadastrar(double comprimento, double largura,
            boolean possuiVidro){
        setComprimento(comprimento);
        setLargura(largura);
        setPossuiVidro(possuiVidro);
    }
    /*
    Imprimir;
    */
    public void imprimir(){
        System.out.println("\nComprimento: "+comprimento
                + "cm\nLargura: "+largura
                + "cm\nPossui vidro?"+possuiVidro);
    }
    
}
