import java.util.Scanner;

public class Unidade5_19 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        float valor = entradas.nextFloat();

        float valorComDesconto = 0;
        float valorGanho = 0;
        while(valor != 0){
            if (valor>500){
                valorComDesconto = valor * 0.80f;
            } else{
                valorComDesconto = valor * 0.85f;
            }

            System.out.println("O total a pagar é: "+valorComDesconto);

            valorGanho += valorComDesconto;

            System.out.print("Digite o valor da compra: ");
            valor = entradas.nextFloat();
        }
        System.out.println("O valor total recebido pela loja foi de: "+valorGanho);

        entradas.close();
    }
}
