import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1010 {
    public static void main(String[] args) {
        /*Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2,
         o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

        Entrada
        O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e
         um valor com 2 casas decimais.

        Saída
        A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e
         um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto. */

         Scanner entradas = new Scanner(System.in);
         
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

         int codigo1 = entradas.nextInt();
         int numeroPecas1 = entradas.nextInt();
         float valor1 = entradas.nextFloat();

         int codigo2 = entradas.nextInt();
         int numeroPecas2 = entradas.nextInt();
         float valor2 = entradas.nextFloat();

        float conta = (numeroPecas1 * valor1) + (numeroPecas2 * valor2);

        System.out.println("VALOR A PAGAR: R$ " + decimalFormat.format(conta));

        entradas.close();
    }
}
