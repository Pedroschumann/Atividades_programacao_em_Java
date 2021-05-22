import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        
        Scanner entradas = new Scanner(System.in);
        double soma = 0;
        for (int cont = 0; cont < 20; cont++){
            System.out.print("Digite a altura da pessoa: ");
            float altura = entradas.nextFloat();
            soma += altura;
        }
        double media = soma/20;

        System.out.println("A média das alturas é: "+ media);

        entradas.close();
    }
}
