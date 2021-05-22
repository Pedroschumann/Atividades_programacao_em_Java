import java.util.Scanner;

public class Problema8_extra {
    public static void main(String[] args) {
        //Entradas: Cotação do dólar e valor de dólares entregue
        //Saídas: Valor em reais recebido
        //Teste: 100 dólares.. 5,50 => 550 reais

        Scanner entradas = new Scanner(System.in);

        float valorDolar = entradas.nextFloat();
        float cotacaoDolar = entradas.nextFloat();

        float valorReais = valorDolar * cotacaoDolar;

        System.out.print("O valor a ser devolvido em reais é: R$"+valorReais);

        entradas.close();
    }
}
