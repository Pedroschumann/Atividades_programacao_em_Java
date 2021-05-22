import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite a idade de Marquinho: ");
        int idadeMarquinho = entradas.nextInt();

        System.out.print("Digite a idade de Zezinho: ");
        int idadeZezinho = entradas.nextInt();

        System.out.print("Digite a idade de Luluzinha: ");
        int idadeLuluzinha = entradas.nextInt();

        if (idadeMarquinho<idadeZezinho){
            if (idadeMarquinho<idadeLuluzinha){
                System.out.println("Marquinho é caçula");
            }else{
                if (idadeLuluzinha<idadeMarquinho){
                    System.out.println("Luluzinha é caçula");
                }
            }
        }else{
            if(idadeZezinho<idadeLuluzinha){
                System.out.println("Zezinho é caçula");
            }else{
                System.out.println("Luluzinha é caçula");
            }
        }
        entradas.close();
    }
}
