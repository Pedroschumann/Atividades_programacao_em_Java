import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Informe o valor: ");
        float valor = entradas.nextFloat();

        float valorDec = valor % 1;

        if (valorDec > 0){
            System.out.println("O valor possui casas decimais");
        }
        else{
            System.out.println("O valor NÃO possui casas decimais");
        }
        
        entradas.close();
    }
}
