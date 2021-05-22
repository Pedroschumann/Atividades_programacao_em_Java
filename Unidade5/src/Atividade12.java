import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite um númer n: ");
        int n = entradas.nextInt();

        int numero = 1;
        for(int cont = 1; cont<=n; cont++){
            String impressao = "";
            for(int qtd = 1; qtd<=cont;qtd++){
                impressao += numero+" ";
                numero ++;
            }
            System.out.println(impressao);
        }
        entradas.close();
    }
}
