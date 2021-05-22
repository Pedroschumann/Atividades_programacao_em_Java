import java.util.Scanner;

public class Problema14_extra {
    public static void main(String[] args) {
        //Entradas: distância e tempo
        //Saídas: velocidade média e gaslina gasta
        //Testes:120.. 2 => 60km/h.. 10 litros

        Scanner entradas = new Scanner(System.in);

        float distancia = entradas.nextFloat();
        float tempo = entradas.nextFloat();
        
        float velocidadeMedia = distancia/tempo;
        float gasolinaGasta = distancia/12;

        System.out.println("A velocidade média do trajeto foi de: "+velocidadeMedia+" km/h.");
        System.out.println("Foram gastos um total de: "+gasolinaGasta+" litros de gasolina.");

        entradas.close();
    }
}
