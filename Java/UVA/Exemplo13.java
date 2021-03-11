package lista.pkg5.exemplos;

public class Exemplo3{
    String marca,modelo;
    int capacidade;
    double comprimento,largura,profundidade,peso,preco;
    
   public void setMarca(String marca){
       this.marca=marca;
   }
   public String getMarca(){
       return marca;
   }
   public void setModelo(String modelo){
       this.modelo=modelo;
   }
   public String getModelo(){
       return modelo;
   }
   public void setCapacidade(int capacidade){
       this.capacidade=capacidade;
   }
   public int getCapacidade(){
       return capacidade;
   }
   public void setComprimento(double comprimento){
       this.comprimento=comprimento;
   }
   public double getComprimento(){
       return comprimento;
   }
   public void setLargura(double largura){
       this.largura=largura;
   }
   public double getLargura(){
       return largura;
   }
   public void setProfundidade(double profundidade){
       this.profundidade=profundidade;
   }
   public double getProfundidade(){
       return profundidade;
   }
   public void setPeso(double peso){
       this.peso=peso;
   }
   public double getPeso(){
       return peso;
   }
   public void setPreco(double preco){
       this.preco=preco;
   }
   public double getPreco(){
       return preco;
   }
    public void cadastrar(String marca, String modelo, int capacidade, double comprimento, double largura, double profundidade, double peso, double preco)
   {
       setMarca(marca);
       setModelo(modelo);
       setCapacidade(capacidade);
       setComprimento(comprimento);
       setLargura(largura);
       setProfundidade(profundidade);
       setPeso(peso);
       setPreco(preco);
   }
    public void imprimir()
   {
       System.out.println("Marca:"+marca);
       System.out.println("Modelo:"+modelo);
       System.out.println("Capacidade:"+capacidade);
       System.out.println("Comprimento:"+comprimento);
       System.out.println("Largura:"+largura);
       System.out.println("Profundidade:"+profundidade);
       System.out.println("Peso:"+peso);
       System.out.println("Preço:"+preco);
    }
}
