import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        /*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas 
        receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que 
        leia o número de horas trabalhadas em um mês, o valor por hora e escreva o salário total do funcionário, que 
        deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas). */

        //Entradas: número de horas trabalhadas, valor da hora
        //Saídas: Salário
        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas: ");
        int numeroHoras = entradas.nextInt();

        System.out.print("Digite o valor pago por hora: ");
        float valorHora = entradas.nextFloat();

        float salario = 160 * valorHora;

        if (numeroHoras > 160){
            int horasExtras = numeroHoras - 160;
            salario += horasExtras * (valorHora * 1.5f);
        } 
        System.out.println("O salário do funcionário é de: R$ "+salario);
        entradas.close();
    }
}
