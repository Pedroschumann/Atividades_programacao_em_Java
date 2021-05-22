import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        for (int cont=0; cont<20; cont++){
            System.out.print("Digite um número inteiro:  ");
            int numero = entradas.nextInt();

            if(numero%2==0){
                System.out.println("par");
            }else{
                System.out.println("ímpar");
            }
        }
        entradas.close();
    }
}
