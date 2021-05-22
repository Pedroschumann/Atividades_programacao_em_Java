import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro número");
        float valor1 = entradas.nextFloat();
        System.out.print("Digite o valor do segundo número");
        float valor2 = entradas.nextFloat();

        System.out.println("Escolha uma opção: \n1 - Soma de dois números.\n"+
                         "2 - Diferença entre dois números. \n3 - Produto entre dois números. \n"+
                         "4 - Divisão entre dois números (o denominador não pode ser zero).");
        int opcao = entradas.nextInt();

        switch(opcao){
            case 1: float soma = valor1 + valor2;
            System.out.println(soma);
                break;

            case 2: float diferenca = valor1 - valor2;
            System.out.println(diferenca);
                break;

            case 3: float produto = valor1*valor2;
            System.out.println(produto);
                break;
            
            case 4: float divisao;
            if(valor2 != 0){
                divisao = valor1 / valor2;
                System.out.println(divisao);
            }else{
                System.out.println("Valor 2 não pode ser nulo");
            }
                break;

            default: System.out.println("Erro! Opção inválida");
        }

        entradas.close();
    }
}
