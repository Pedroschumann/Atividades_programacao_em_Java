import java.util.Scanner;

public class Problema6_extra {
    public static void main(String[] args) {
        //Entradas: peso do prato em kg
        //Saídas: valor a pagar
        //Teste: 2,75 => 50,0

        Scanner entradas = new Scanner(System.in);

        float peso = entradas.nextFloat();
        float pesoComida = peso - 0.750f;
        float valor = pesoComida * 25;
        
        System.out.println("O valor a se pagar é de: "+ valor);

        entradas.close();
    }
}
