// Autor: ---- Pedro Schumann ----
import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Dê um valor maior que 2 para n: ");
        int n = entradas.nextInt();
        int numero = 8;
        int numero1 = 0;

        if(n>2){
            for(int cont = 0; cont<n; cont++){
                System.out.println(numero);
                if(cont % 2 == 0){
                    numero1 = numero;
                    numero += 2;
                }else{
                    numero = numero1*2;
                }
            }
        }else{
            System.out.println("O valor deve ser maior que 2!");
        }

        entradas.close();
    }
}
