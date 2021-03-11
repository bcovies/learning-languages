/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20172101499
 */
public class PenDriveEX3Principal {
    public static void main(String[]args){
        PenDriveEX3 p = new PenDriveEX3();
            p.cadastrar(p.marca,p.modelo, 0, 0, 0, 0, 0, 0);
            
            p.marca="Kingston";
            p.modelo="TJ-n54";
            p.capacidade=32;
            p.comprimento=20;
            p.largura=20;
            p.peso=334;
            p.profundidade=65;
            p.preco=32;
            
            p.imprimir();
            
    }
}
