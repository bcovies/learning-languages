/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg4.exercicio.pkg2;

/**
 *
 * @author HDD-PROG
 */
public class Geladeira {
    String marca,cor,modelo;
    short portas,armazenamentototal;
    double consumo,potencia,preco;
    //Classes em String.
    public void setMarca(String marcaa)
    {
        marca=marcaa;
    }
    public String getMarca()
    {
        return marca;
    }
    public void setCor(String corr)
    {
        cor=corr;
    }
    public String getCor()
    {
        return cor;
    }
    public void setModelo(String modeloo)
    {
        modelo=modeloo;
    }
    public String getModelo()
    {
        return modelo;
    }
    //Classes em Double.
    public void setPortas(Short portass)
    {
        portas=portass;
    }
    public Short getPortas()
    {
        return portas;
    }
    public void setArmazenamentoTotal(Short armazenamentototall)
    {
        armazenamentototal=armazenamentototall;
    }
    public Short getArmazenamentoTotal()
    {
        return armazenamentototal;
    }
    public void setConsumo(Double consumoo)
    {
        consumo=consumoo;
    }
    public Double getConsumo()
    {
        return consumo;
    }
    public void setPotencia(Double potenciaa)
    {
        potencia = potenciaa;
    }
    public Double getPotencia()
    {
        return potencia;
    }
    public void setPreco(Double precoo)
    {
        preco=precoo;
    }
    public Double getPreco()
    {
        return preco;
    }
}
