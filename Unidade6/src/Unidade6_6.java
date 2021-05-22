import java.util.Scanner;

public class Unidade6_6 {

    private Scanner entradas;

    public Unidade6_6(){
        entradas = new Scanner(System.in);

        float numerosVetor[] = lerVetor();
        pesquisar(numerosVetor);
    }
    public float[] lerVetor(){
        System.out.println("Digite o número de elementos que deseja inserir no vetor: ");
        int quantidade = entradas.nextInt();
        float vetor[] = new float[quantidade];

        for(int cont = 0; cont<vetor.length; cont ++){
            System.out.print("Digite um valor pro vetor: ");
            vetor[cont] = entradas.nextFloat();
        }
        return vetor;
    }
    public boolean pesquisar(float[] vetor){
        System.out.print("Digite um valor pra comparar com os valores do vetor: ");
        float numero = entradas.nextFloat();

        entradas.close();
        for(int cont = 0; cont<vetor.length; cont++){
            if(vetor[cont]==numero){
                 return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        new Unidade6_6();
    }
}
