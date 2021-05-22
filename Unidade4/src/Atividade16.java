import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite a idade do homem 1: ");
        int homem1 = entradas.nextInt();

        System.out.print("Digite a idade do homem 2: ");
        int homem2 = entradas.nextInt();

        System.out.print("Digite a idade da mulher 1: ");
        int mulher1 = entradas.nextInt();

        System.out.print("Digite a idade da mulher 2: ");
        int mulher2 = entradas.nextInt();

        int soma;
        int produto;

        if (homem1 > homem2) {
            if (mulher1 < mulher2) {
                soma = homem1 + mulher1;
                produto = homem2 * mulher2;
            } else {
                soma = homem1 + mulher2;
                produto = homem2 * mulher1;
            }
        } else {
            if (mulher1 < mulher2) {
                soma = homem2 + mulher1;
                produto = homem1 * mulher2;
            } else {
                soma = homem2 + mulher1;
                produto = homem1 * mulher2;
            }
        }
        System.out.println("A soma do homem mais velho e mulher mais nova é: " + soma);
        System.out.println("O produto do homem mais novo e mulher mais velha é: " + produto);

        entradas.close();
    }
}
