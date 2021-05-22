import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema9_extra {
    public static void main(String[] args) {
        //Entradas: raio e altura
        //Saídas: volume
        //Testes: 2.. 3 => 37,69911

        Scanner entradas = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00000");

        float raio = entradas.nextFloat();
        float altura = entradas.nextFloat();

        double volume = Math.PI * altura * Math.pow(raio,2);

        System.out.println("O volume é: "+ decimalFormat.format(volume));

        entradas.close();
    }
}
