import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.print("Digite a nota da prova 1: ");
        float prova1 = entradas.nextFloat();

        System.out.print("Digite a nota da prova 2: ");
        float prova2 = entradas.nextFloat();

        System.out.print("Digite a nota da prova 3: ");
        float prova3 = entradas.nextFloat();

        System.out.print("Digite a nota dos exercícios: ");
        float notaExercicios = entradas.nextFloat();

        double media = (prova1+(prova2*2)+(prova3*3)+notaExercicios)/7;
        df.format(media);

        char conceito;
        if (media>=9){
            conceito = 'A';
        }else if(media<9 && media>=7.5){
            conceito = 'B';
        }else if(media<7.5 && media>=6){
            conceito = 'C';
        }else if(media<6 && media>=4){
            conceito = 'D';
        }else{
            conceito = 'E';
        }
        if(conceito=='A' || conceito=='B' || conceito=='C'){
            System.out.println("Média "+media+". conceito "+conceito+". Aprovado");
        }else{
            System.out.println("Média "+media+". conceito "+conceito+". Reprovado");
        }
        
        entradas.close();
    }
}