import java.util.Scanner;

public class URI_1001 {
    public static void main(String[] args) {
        /* Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X.
     Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem alguma além daquilo que está sendo especificado
      e não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".*/

        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = entradas.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = entradas.nextInt();

        int x = a + b;

        System.out.println("X = "+ x);

        entradas.close();
    }
}
