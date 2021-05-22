import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        int carta1 = entradas.nextInt();
        int carta2 = entradas.nextInt();
        int carta3 = entradas.nextInt();

        if (carta1<4 || carta2<4 || carta3<4){
            if(carta1<4 && carta2<4 && carta3<4){
                System.out.println("NOVE");
            }else{
                if(carta1<4 && carta2<4 || carta1<4 && carta3<4 || carta2<4 && carta3<4){
                    System.out.println("SEIS");
                }else{
                    System.out.println("TRUCO");
                }
            }
        }

        entradas.close();
    }
}
