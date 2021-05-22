import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {
        /*Faça um programa que calcule e mostre o volume de uma esfera sendo
        fornecido o valor de seu raio (R). A fórmula para calcular o volume é:
        (4/3) * pi * R³. Considere (atribua) para pi o valor 3.14159.

        Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas
        linguagens (dentre elas o Java), assumem que o resultado da divisão entre dois
        inteiros é outro inteiro. */
        
        //Análise: Ok
        /*O que não é necessário: 
        
        */
        // Entradas: Raio da esfera
        //Saídas: Volume
        //Testes:
        //raio: 2       resultado: 33,51029

        //Algorítimo

        float pi = 3.14159f;

        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        float raio = entradas.nextFloat();

        double volume = (4.0f/3) * pi * Math.pow(raio, 3);

        System.out.print("O volume da esfera é: " + volume);

    }
}
