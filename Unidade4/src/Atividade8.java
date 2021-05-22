import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Escreva uma letra: ");
        String letra = entradas.next();
        letra = letra.toUpperCase();
        letra = letra.trim();
        char caracter = letra.charAt(0);

        if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
            System.out.println("É vogal");
        } else {
            System.out.println("Não é uma vogal");
        }

        entradas.close();
    }
}
