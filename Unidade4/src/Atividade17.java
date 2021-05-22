//import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {

        //DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner entradas = new Scanner(System.in);

        double rendaAnual = entradas.nextDouble();
        int numDependentes = entradas.nextInt();

        double rendaLiquida = rendaAnual *(1.00f - (0.02*numDependentes));
        rendaLiquida /= 12;

        if (rendaLiquida <= 2000){
            System.out.println("Não paga importo de renda");
        }else if(rendaLiquida > 2000 && rendaLiquida<5000){
            System.out.println("Imposto de renda de 5%");
        }else if(rendaLiquida>=5000 && rendaLiquida<=10000){
            System.out.println("Imposto de renda de 10%");
        }else{
            System.out.println("Imposto de renda de 15%");
        }

        entradas.close();
    }
}
