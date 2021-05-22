import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {

        // Entradas: Valor de a, valor de b
        // Saídas: Valor da soma
        // Testes: | valor de A | Valor de B | Soma
        //         |      1     |     10     | 7,136363
        //         |      2     |     40     | 27.90909
        //         |      3     |     120    | 82.77273

        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        float a = entradas.nextFloat() * 3.5f;

        System.out.print("Digite o valor de B: ");
        float b = entradas.nextFloat() * 7.5f;

        float soma = (b + a)/ 11;
        System.out.print("MEDIA = " + soma);
        
    }
}