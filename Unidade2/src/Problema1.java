import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        
        // Entradas: raio
        // Saída: Área
        //Teste: 
        //      Teste1 - raio:2 área:12,566
        //      Teste2 - raio:5 área:78,5375
        // ....

        //Algorítimo: java

        //Scanner faz pra pedir dados, pra n dar erro se usa o comando Ctrl + barra_espaço
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o raio: ");

        // o comando a seguir é pra pedir o raio pelo terminal
        float raio = entrada.nextFloat();
        float pi = 3.1415f;
        
        float area = (raio * raio) * pi;
        float area2 = (raio * raio) * 3.1415f;

        System.out.println("área 1: " + area);
        System.out.print("Área 2: " + area2);
    }
}