import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome  = entradas.next();

        // !nome.equalsIgnoreCase("fim")
        while (!nome.equalsIgnoreCase("fim")){
            System.out.println("Digite a nota 1: ");
            float nota1 = entradas.nextFloat();
            System.out.println("Digite a nota 2: ");
            float nota2  =entradas.nextFloat();
            
            System.out.println("A média do aluno é: "+ (nota1+nota2)/2);

            System.out.println("Digite o nome do aluno: ");
            nome = entradas.next();
        }

        entradas.close();
    }
}
