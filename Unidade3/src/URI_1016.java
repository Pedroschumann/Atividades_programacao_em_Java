import java.util.Scanner;

public class URI_1016 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        int km = entradas.nextInt();

        int tempo = km * 2;

        System.out.println(tempo + " minutos");

        entradas.close();
    }
}
