import java.util.Scanner;

public class Problema10_extra {
    public static void main(String[] args) {
        //Entradas: cateto 1 e 2
        //Saídas: hipotenusa
        //Testes: 3..4 => 5

        Scanner entradas = new Scanner(System.in);

        float cateto1 = entradas.nextFloat();
        float cateto2 = entradas.nextFloat();

        double hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));

        System.out.println("A hipotenusa mede: "+ hipotenusa);

        entradas.close();
    }
}
