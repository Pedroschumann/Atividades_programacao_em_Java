import java.util.Scanner;

public class Problema15_extra {
    public static void main(String[] args) {
        //Entradas: número inteiro de até 3 dígitos
        //Saídas: dividir em centena, dezena e unidade
        //Testes: 384 => 3 centena(s)  8 dezena(s) 4 unidade(s)

        Scanner entradas = new Scanner(System.in);

        int numero = entradas.nextInt();

        int centena = numero/100;
        int dezena = (numero-(centena*100)) / 10;
        int unidade = numero-((centena*100)+(dezena*10));

        System.out.println(centena+" centena(s) "+dezena+" dezena(s) "+unidade+" unidade(s)");

        entradas.close();
    }
}
