import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        // Entradas: Numero funcionário, número dde horas trabalhadas, valor recebido por hora
        // Saídas: Número e o salário
        // Testes: | numero funcionário | número de horas | valor
        //         |         1          |         10      | 50 -> 1 - 500
        //         |         2          |         40      | 25 -> 2 - 1000
        //         |         3          |         120     | 30 -> 3 - 3600
        
        // Algoritimo JAVA

        Scanner entradas = new Scanner(System.in);
        
        System.out.print("Digite o núemro do funcionário: ");
        int numeroFuncionario = entradas.nextInt();

        System.out.print("Digite as horas trabalhadas: ");
        int horasTrabalhadas = entradas.nextInt();

        System.out.print("Digite o valor da hora: ");
        int valorHora = entradas.nextInt();

        int salario = horasTrabalhadas * valorHora;

        System.out.print("Número funcionário: " + numeroFuncionario + " Salário: " + salario);
    }
}