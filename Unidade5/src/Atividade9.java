import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);
    
        int n = entradas.nextInt();

        String listaAlunos18 = "";
        int alunosMaiores20 = 0;
        for (int cont = 0; cont<n; cont++){
            System.out.print("Digite o nome do aluno: ");
            String nome = entradas.next();

            System.out.print("Digite a idade do aluno: ");
            int idade = entradas.nextInt();

            if (idade==18){
                listaAlunos18 += nome + ", ";
            }else if(idade>20){
                alunosMaiores20 ++;
            }
        }
        System.out.println("Os alunos com 18 anos são os seguintes: "+listaAlunos18);
        System.out.println("Existem "+alunosMaiores20+" alunos com mais de 20 anos");

        entradas.close();
    }
}
