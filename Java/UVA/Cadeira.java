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
public class Cadeira {
    String marca,cor,modelo,estrutura,revestimento;
    double pesoproduto,pesosuportado;
    float largura,altura,profundidade;
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
    public void setEstrutura(String estruturaa)
    {
        estrutura=estruturaa;
    }
    public String getEstrutura()
    {
        return estrutura;
    }
    public void setRevestimento(String revestimentoo)
    {
        revestimento=revestimentoo;
    }
    public String getRevestimento()
    {
       return revestimento;
    }    
//Classes em Double.
    public void setPesoProduto(Double pesoprodutoo)
    {
        pesoproduto=pesoprodutoo;
    }
    public Double getPesoProduto()
    {
        return pesoproduto;
    }
    public void setPesoSuportado(Double pesosuportadoo)
    {
        pesosuportado=pesosuportadoo;
    }
    public Double getPesoSuportado()
    {
        return pesosuportado;
    }
    public void setLargura(Float larguraa)
    {
        largura=larguraa;
    }
    public Float getLargura()
    {
        return largura;
    }
    public void setAltura (Float alturaa)
    {
        altura=alturaa;
    }
    public Float getAltura()
    {
        return altura;
    }
    public void setProfundidade(Float profundidadee)
    {
        profundidade = profundidadee;
    }
    public Float getProfundidade()
    {
        return profundidade;
    }
    
}
