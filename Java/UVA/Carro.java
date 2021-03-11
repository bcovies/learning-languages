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
public class Carro {
    char tipo;
    String cambio,modelo,marca;
    double ano,kmrodado,preco;
    public void setTipo (char tipoo)
    {
        tipo=tipoo;
    }
    public char getTipo()
    {
        return tipo;
    }
    //Classes em String.
    public void setCambio (String cambioo)
    {
        cambio=cambioo;
    }
    public String getCambio()
    {
        return cambio;
    }
    public void setModelo (String modeloo)
    {
        modelo=modeloo;
    }
    public String getModelo()
    {
        return modelo;
    }
    public void setMarca(String marcaa)
    {
        marca=marcaa;
    }
    public String getMarca()
    {
        return marca;
    }
    //Classes em Double.
    public void setAno(Double anoo)
    {
        ano=anoo;
    }
    public Double getDouble()
    {
        return ano;
    }
    public void setKmRodado(Double kmrodadoo)
    {
        kmrodado=kmrodadoo;
    }
    public Double getKmRodado()
    {
        return kmrodado;
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
