import java.util.Scanner;

public class Problema5_extra {
    public static void main(String[] args) {
        //Entradas: Numero de frangos
        //Saídas: Custo com aneis para todos os frangos
        //Teste: 10 => 110 reais

        Scanner entradas = new Scanner(System.in);
        
        int totalFrangos = entradas.nextInt();
        int valorGasto = totalFrangos * 11;

        System.out.println("O total gasto é de: "+valorGasto);

        entradas.close();
    }
}
