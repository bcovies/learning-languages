package lista.pkg5.exemplos;
import java.util.Scanner;
public class Exemplo2 {
    String marca,modelo;
    int capacidade;
    double comprimento,largura,profundidade,peso,preco;
    public void setMarca(String m)
    {
        marca=m;
    }
    public String getMarca()
    {
        return marca;
    }
    public void setModelo(String mm)
    {
        modelo=mm;
    }
    public String getModelo()
    {
        return modelo;
    }
    public void setCapacidade(int c)
    {
        capacidade = c;
    }
    public Integer getCapacidade()
    {
        return capacidade;
    }
    public void setComprimento(double cc)
    {
        comprimento = cc;
    }
    public Double getComprimento()
    {
        return  comprimento;
    }
    public void setLargura(double l)
    {
        largura = l;
    }
    public void setProfundidade(double p)
    {
        profundidade = p;
    } 
    public Double getProfundidade()
    {
        return profundidade;
    }
    
    public void setPeso(double pp)
    {
        peso = pp;
    }
    public Double getPeso()
    {
        return peso;
    }
    public void setPreco(double ppp)
    {
        preco = ppp;
    }
    public Double getPreco()
    {
        return preco;
    }
        void entradaDados(){
            Scanner input = new Scanner(System.in);
            System.out.println("Marca: "+marca);
                setMarca(input.nextLine());
            System.out.println("Modelo: "+modelo);
                setModelo(input.nextLine());
            System.out.println("Capacidade: "+capacidade);
                setCapacidade(Integer.parseInt(input.nextLine()));
            System.out.println("Comprimento: "+comprimento);
                setComprimento(Double.parseDouble(input.nextLine()));
            System.out.println("Largura: "+largura);
                setLargura(Double.parseDouble(input.nextLine()));
            System.out.println("Profundidade: "+profundidade);
                setProfundidade(Double.parseDouble(input.nextLine()));
            System.out.println("Peso: "+peso);
                setPeso(Double.parseDouble(input.nextLine()));
            System.out.println("Preco: "+preco);
                setPreco(Double.parseDouble(input.nextLine()));
                
        }
        void imprimir (){
            System.out.println("Marca: "+marca);
            System.out.println("Modelo: "+modelo);
            System.out.println("Capacidade: "+capacidade);
            System.out.println("Comprimento: "+comprimento);
            System.out.println("Largura: "+largura);
            System.out.println("Profundidade: "+profundidade);
            System.out.println("Peso: "+peso);
            System.out.println("Preco: "+preco);
        }
        
        
}
