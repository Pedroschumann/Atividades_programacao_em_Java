import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        //análise: Ok
        //Entrada: tempo gasto em horas  e velocidade média em km/h
        //saida: litros gastos
        // Testes:
        // tempo -> 2 h     velocidade/m -> 60 km/h     resultado -> 10 litros
        // tempo -> 4 h     velocidade/m -> 45 km/h     resultado -> 15 litros


        // Algorítimo
        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite o tempo gasto em horas da viagem: ");
        float tempo = entradas.nextFloat();

        System.out.print("Digite a velocidade média do percurso: ");
        float velocidadeMedia = entradas.nextFloat();

        float distancia = tempo * velocidadeMedia;

        float combustivelGasto = distancia / 12;

        System.out.print("A quantidade de combustível gasto no trajeto foi de: " + combustivelGasto);

    }
}