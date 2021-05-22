import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1002 {
    public static void main(String[] args) {
        /*A fórmula para calcular a área de uma circunferência é: area = π . raio2. 
        Considerando para este problema que π = 3.14159:
        - Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π. */

        DecimalFormat decimalFormat= new DecimalFormat("0.0000");

        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = entradas.nextDouble();

        double area = 3.14159 * Math.pow(raio, 2);

        System.out.println("A="+ decimalFormat.format(area));

        entradas.close();
    }
}