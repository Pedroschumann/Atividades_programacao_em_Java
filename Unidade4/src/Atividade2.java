import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        Scanner entradas = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int valor = entradas.nextInt();

        if (valor % 2 == 0){
            System.out.println("É um número par!");
        } else {
            System.out.println("É um número ímpar!");
        }

        entradas.close();
    }
}
