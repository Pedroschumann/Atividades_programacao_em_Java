import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite o número 1: ");
        int numero1 = entradas.nextInt();

        System.out.print("Digite o número 2: ");
        int numero2 = entradas.nextInt();

        if (numero1%numero2 == 0 || numero2%numero1 == 0){
            System.out.println("Os números são múltiplos");
        }else{
            System.out.println("Os números não são múltiplos");
        }

        entradas.close();
    }
}
