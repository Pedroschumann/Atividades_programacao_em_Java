import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("A cor é azul?: ");
        boolean resposta = entradas.nextBoolean();

        if (resposta){
            System.out.println("Sim");
        } else{
            System.out.println("Não");
        }

        entradas.close();
    }
}
