import java.util.Scanner;

public class Problema7_extra {
    public static void main(String[] args) {
        //Entradas: Receber a quantidade de cada um dos 3 tipos de garrafa
        //Saídas: Quantidade de litros comprados
        //Teste: 2..3..1 => 4,5 litros

        Scanner entradas = new Scanner(System.in);

        int lata350 =  entradas.nextInt();
        int garrafa600 = entradas.nextInt();
        int garrafa2l = entradas.nextInt();

        float qtdLitros = (lata350 * 0.350f) + (garrafa600 * 0.600f) + (garrafa2l * 2);

        System.out.println("O comerciante comprou "+qtdLitros+" litros.");

        entradas.close();
    }
}
