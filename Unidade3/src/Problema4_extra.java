import java.util.Scanner;

public class Problema4_extra {
    public static void main(String[] args) {
        //Entradas: ler 3 notas 
        //Saídas: imprimir a média ponderada
        //Teste: 2..7..9 => 4.9

        Scanner entradas = new Scanner(System.in);

        float nota1 = entradas.nextFloat();
        float nota2 = entradas.nextFloat();
        float nota3 = entradas.nextFloat();

        float media = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / 10;

        System.out.println("A média ponderada do aluno é de: "+media);

        entradas.close();
    }
}
