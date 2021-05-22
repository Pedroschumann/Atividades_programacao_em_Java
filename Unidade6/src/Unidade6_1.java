import java.util.Scanner;

public class Unidade6_1 {

    public Unidade6_1() {
        int[] vetor = new int[10];

        inserirValoresVetor(vetor);

        escreverVetor(vetor);

    }
    
    public void inserirValoresVetor(int[] vetor){
        Scanner entradas = new Scanner(System.in);

        for(int cont = 0; cont < vetor.length; cont ++){
            System.out.print("Digite um valor pro vetor: ");
            vetor[cont] = entradas.nextInt();
        }
        entradas.close();
    }

    public void escreverVetor(int[] vetor){
        for(int vetorInverso = vetor.length-1; vetorInverso >= 0; vetorInverso--){
            System.out.println("vetor: "+vetor[vetorInverso]);
        }
    }

    public static void main(String[] args) {
        new Unidade6_1();
    }
}
