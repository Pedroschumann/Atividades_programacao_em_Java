import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {

        float preco = 0.45f;

        Scanner entradas = new Scanner(System.in);
        
        System.out.println("Digite o peso da carta em gramas:");
        int pesoCarta = entradas.nextInt();

        if (pesoCarta > 50){
            int pesoExcesso = pesoCarta - 50;
            float precoExcesso = (pesoExcesso/20)*0.45f;
            if ( pesoExcesso %20 != 0){
                precoExcesso += 0.45f;
            }
            preco += precoExcesso;
        }

        System.out.println("O preço do selo da carta será de: R$ "+ preco+" reais");

        entradas.close();
    }
}