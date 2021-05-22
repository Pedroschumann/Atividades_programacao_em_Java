import java.util.Scanner;

public class Unidade6_4 {

    private Scanner entradas;

    public Unidade6_4(){
        entradas = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorSoma = new int[vetor1.length];
        lerValores(vetor1, vetor2, vetorSoma);
        somar(vetor1, vetor2, vetorSoma);
        escreverVetores(vetor1, vetor2, vetorSoma);

    }
    public void lerValores(int[] vetor1, int[] vetor2,int[] vetorSoma){
        for(int cont = 0; cont < vetor1.length; cont ++){
            System.out.print("Digite um valor pro vetor 1: ");
            vetor1[cont] = entradas.nextInt();
        }
        for(int cont = 0; cont < vetor1.length; cont ++){
            System.out.print("Digite um valor pro vetor 2: ");
            vetor2[cont] = entradas.nextInt();
        }

    }
    public void somar(int[] vetor1, int[] vetor2,int[] vetorSoma){
        for(int cont = 0; cont < vetor1.length; cont ++){
            vetorSoma[cont] = vetor1[cont] + vetor2[cont];
        }

    }
    public void escreverVetores(int[] vetor1, int[] vetor2,int[] vetorSoma){
        String somaVetor1 = "";
        String somaVetor2 = "";
        String somaVetor3 = "";

        for(int cont = 0; cont < vetor1.length; cont ++){
            somaVetor1 += vetor1[cont] + "  ";
            somaVetor2 += vetor2[cont] + "  ";
            somaVetor3 += vetorSoma[cont] + "  ";
        }

        System.out.println("Vetor 1: "+somaVetor1+"\nVetor 2: "+somaVetor2+"\nVetor 3(Soma): "+somaVetor3);
    }
    public static void main(String[] args) {        
        new Unidade6_4();
    }
}
