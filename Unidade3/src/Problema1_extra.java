import java.util.Scanner;

public class Problema1_extra {
    public static void main(String[] args) {
        // Entradas: duas medidas de terreno
        // Saída: Área do terreno
        // Teste: 20 * 30 = 600m2

        Scanner entradas = new Scanner(System.in);

        float lado1 = entradas.nextFloat();
        float lado2 = entradas.nextFloat();

        float area = lado1 * lado2;

        System.out.println("Área = "+area+" m2");

        entradas.close();
    }
}
