import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite um número n: ");
        int n = entradas.nextInt();

        float maior = 0;
        float menor = 0;
        for (int cont = 0; cont<n; cont++){
            System.out.print("Digite um número: ");
            float numero = entradas.nextFloat();
            if(cont==0){
                maior = numero;
                menor = numero;
            } else if(numero > maior){
                maior = numero;
            }else if(numero<menor){
                menor = numero;
            }
        }

        System.out.println("O maior número é: "+maior+". E o menor número é: "+menor);

        entradas.close();
    }
}
