import java.util.Scanner;

public class Problema3_extra {
    public static void main(String[] args) {
        //Entradas : Preço da gasolina e valor de pagamento
        //Saídas : litros que abasteceu
        //teste: 5.. 45 => 9 litros

        Scanner entradas = new Scanner(System.in);

        float valorGasolina = entradas.nextFloat();
        float valorPago = entradas.nextFloat();

        float litros = valorPago / valorGasolina;

        System.out.println("Abasteceu um total de "+litros+" litros de gasolina.");

        entradas.close();
    }
}
