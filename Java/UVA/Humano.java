/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

/**
 *
 * @author HDD-PROG
 */
public class Humano {
    String nome;
    String sexo;
    int idade;
    double peso,altura;
    public void setSexo(String s)
    {
        sexo =s;
    }
    public void setNome(String n)
    {
        nome = n;
    }
    public void setIdade(int i)
    {
        idade=i;
    }
    public void setPeso(double p)
    {
        peso=p;
    }
    public void setAltura(double a)
    {
        altura=a;
    }
    public String getSexo()
    {
        return sexo;
    }
    public String getNome()
    {
        return nome;
    }
    public int getIdade()
    {
        return idade;
    }
    public double getPeso()
    {
        return peso;
    }
    public double getAltura()
    {
        return altura;
    }
}
