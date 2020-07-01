package lista.pkg5.exemplos;


import java.util.Scanner;
public class Exemplo3main {
    public static void main(String[] agrs)
    {
        Scanner input = new Scanner(System.in);
        Exemplo3 p = new Exemplo3();
            p.cadastrar("Kingston", "TJ-64", 60, 30, 50, 40, 23, 24.99);
            p.imprimir();
    }
}