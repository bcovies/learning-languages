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
public class Mesa {
    String nome,modelo,marca,cor;
    double peso,altura,largura,profundidade,preco;
    byte    pes;
 
        public void setPreco( Double precoo)
        {
            preco = precoo;
        }
        public Double getPreco()
        {
            return preco;
        }
        public void setProfundidade(Double profundidadee) 
        {
            profundidade = profundidadee;
        }
        public Double getProfundidade()
        {
            return profundidade;
        }
        public void setLargura(Double larguraa)
        {
            largura = larguraa;
        }
        public Double getlargura()
        {
            return largura;
        }
        public void setAltura(Double alturaa)
        {
            altura=alturaa;
        }
        public Double getAltura()
        {
            return altura;
        }
        public void setPeso(Double pesoo)
        {
            peso=pesoo;
        }
        public Double getPeso()
        {
            return peso;
        }
        public void setNome (String nomee)
        {
            nome=nomee;
        }
        public String getNome()
        {
            return nome;
        }
        public void setModelo (String modeloo)
        {
            modelo=modeloo;
        }
        public String getModelo()
        {
            return modelo;
        }
        public void setMarca (String marcaa)
        {
            marca=marcaa;
        }
        public String getMarca()
        {
            return marca;
        }
        public void setCor (String corr)
        {
            cor=corr;
        }
        public String getCor()
        {
            return cor;
        }
        public void setPes (Byte pess)
        {
            pes=pess;
        }
        public Byte getPes()
        {
            return pes;
        }
}
