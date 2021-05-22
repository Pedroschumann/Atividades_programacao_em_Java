import java.util.Scanner;

public class URI_1019 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        int tempo = entradas.nextInt();

        int minutos = tempo/60;
        int horas = minutos/60;
        int segundos = tempo - (minutos*60);
        minutos = minutos - (horas*60);
        
        System.out.println(horas + ":" + minutos + ":" + segundos);

        entradas.close();
    }
}
