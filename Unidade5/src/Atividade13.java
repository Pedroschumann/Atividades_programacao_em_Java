import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite o número de paradas: ");
        int paradas = entradas.nextInt();
        System.out.print("Digite o valor inicial do odômetro: ");
        int odometroInicial = entradas.nextInt();

        float quilometragemMedia = 0;

        for(int cont = 1; cont<=paradas; cont++){
            System.out.println("Digite o valor do odômetro relativo à parada: ");
            int odometroParada = entradas.nextInt();

            int diferenca = odometroParada-odometroInicial;
            System.out.println("Digite a quantidade de litros comprados: ");
            float quantidadeLitros = entradas.nextFloat();

            float consumoLitro = diferenca/quantidadeLitros;

            System.out.println("A quilometragem obtida por litro foi de: "+consumoLitro);

            quilometragemMedia +=consumoLitro;
        }
        float media = quilometragemMedia/paradas;
        System.out.println("A quilometragem média por litro de combustível foi de: "+media);

        entradas.close();
    }
}
