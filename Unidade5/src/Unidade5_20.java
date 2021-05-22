import java.util.Scanner;

public class Unidade5_20 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite a massa inicial do material: ");
        float massaInicial = entradas.nextFloat();

        float massa = massaInicial * 1000;
        int tempo = 0;
        while(massa>=0.5){
            tempo += 50;
            massa /= 2;
        }

        System.out.println("A massa inicial foi de: "+massaInicial+
        ".\nA massa final foi de: "+massa+".\nNo tempo de: "+tempo+" segundos.");

        entradas.close();
    }
}
