import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);
        
        System.out.print("Informe o valor do número 1: ");
        int valor1 = entradas.nextInt();
        System.out.print("Informe o valor do numero 2: ");
        int valor2 = entradas.nextInt();

        if (valor1 > valor2){
            System.out.println(valor1+" é maior que "+valor2);
        }
        else{
            System.out.println(valor2+" é maior que "+valor1);
        }

        entradas.close();
    }
}
