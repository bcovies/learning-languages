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
public class Televisao {
    String marca,modelo,tipotela,resolucao,cor;
    int polegadas;
    long peso;
    double largura,altura,profundidade;
    
    public void setPolegadas(Integer polegadass)
    {
        polegadas=polegadass;
    }
    public Integer getPolegadas()
    {
        return polegadas;
    }
    //Classes em String.
        public void setMarca(String marcaa)
        {
            marca = marcaa;
        }
        public String getMarca()
        {
            return marca;
        }
        public void setModelo(String modeloo)
        {
            modelo = modeloo;
        }
        public String getModelo()
        {
            return modelo;
        }
        public void setTipoTela(String tipotelaa)
        {
            tipotela = tipotelaa;
        }
        public String getTipoTela()
        {
            return tipotela;
        }
        public void setResolucao (String resolucaoo)
        {
            resolucao=resolucaoo;
        }
        public String getResolucao()
        {
            return resolucao;
        }
        public void setCor (String corr)
        {
            cor = corr;
        }
        public String cor()
        {
            return cor;
        }
    //Classes em Double.
        public void setPeso(Long pesoo)
        {
            peso = pesoo;
        }
        public Long getPeso()
        {
            return peso;
        }
        public void setLargura(Double larguraa)
        {
            largura = larguraa;
        }
        public Double getLargura()
        {
            return largura;
        }
        public void setAltura(Double alturaa)
        {
            altura = alturaa;
        }
        public Double getAltura()
        {
            return altura;
        }
        public void setProfundidade(Double profundidadee)
        {
            profundidade = profundidadee;
        }
        public Double getProfundidade()
        {
            return profundidade;
        }
}
