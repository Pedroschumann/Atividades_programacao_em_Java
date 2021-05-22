import java.util.Scanner;

public class Problema16_extra {
    public static void main(String[] args) {
        //Entradas: valor troco
        //Saídas: número mínimo de notas utilizadas e quantas nota de cada
        //Testes: 132 =>    Serão necessárias ao menos 6 notas.
        //                  1 nota(s) de 100, 3 nota(s) de 10 e 2 nota(s) de 1.

        Scanner entradas = new Scanner(System.in);

        int troco = entradas.nextInt();

        int nota100 = troco/100;
        troco -= nota100 * 100;
        int nota10 = troco/10;
        troco -= nota10*10;
        int nota1 = troco;

        int notasminimas = nota100 + nota10 + nota1;

        System.out.println("Serão necessárias ao menos "+notasminimas+" notas.");
        System.out.println(nota100+ " nota(s) de 100, " +nota10+ 
                                " nota(s) de 10 e " +nota1+ " nota(s) de 1.");

        entradas.close();
    }
}
