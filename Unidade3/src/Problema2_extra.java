import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema2_extra {
    public static void main(String[] args) {
        //Entradas : Preço do par do sapatos
        //Saídas: valor descontado e valor que o par de sapatos custa
        //Exemplo: 100.00 => 12.00 reais de desconto.. Preço atual: R$ 88.00

        Scanner entradas = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        
        float valor = entradas.nextFloat();

        float desconto = valor * 0.12f;
        float valorFinal = valor - desconto;

        System.out.println("O valor do desconto é de R$ "+decimalFormat.format(desconto));
        System.out.println("O preço do par de sapatos com desconto é R$ " + decimalFormat.format(valorFinal));

        entradas.close();
    }
}
