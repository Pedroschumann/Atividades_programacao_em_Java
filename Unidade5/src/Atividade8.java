import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite um número n: ");
        int n = entradas.nextInt();

        float somaPositivos = 0;
        int menorNegativo = 0;
        int qtdPositivos = 0;
        for (int cont = 0; cont<n; cont++){
            System.out.print("Digite um número: ");
            int numero = entradas.nextInt();

            if(numero<menorNegativo){
                menorNegativo = numero;
            }else if(numero>0){
                somaPositivos += numero;
                qtdPositivos ++;
            }
        }
        float mediaPositivos = somaPositivos / qtdPositivos;

        System.out.println("O menor número negativo é: "+menorNegativo+". E a média dos números positivos é: "+mediaPositivos);

        entradas.close();
    }
}
