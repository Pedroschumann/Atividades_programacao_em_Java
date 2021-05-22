import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite a quantos meses o funcionário foi admitido: ");
        int meses = entradas.nextInt();

        if (meses<12){
            System.out.println("Valor de reajuste de 5%.");
        } else if(meses>=13 && meses<=48){
            System.out.println("Valor de reajuste de 7%.");
        }

        entradas.close();
    }
}
