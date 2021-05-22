import java.util.Scanner;

public class Unidade6_3 {
    public Unidade6_3(){
        float[] vetor = new float[12];

        lerValores(vetor);
        reajustasValores(vetor);
        imprimirValoresAtualizados(vetor);
    }
    private void lerValores(float[] vetor){
        Scanner entradas = new Scanner(System.in);
        for(int cont = 0; cont<vetor.length; cont++){
            System.out.print("Digite um valor Real pro vetor: ");
            vetor[cont] = entradas.nextFloat();
        }
        entradas.close();
    }
    private void reajustasValores(float[] vetor){
        for(int cont = 0; cont<vetor.length; cont++){
            if (cont%2 == 0){
                vetor[cont] *= 1.02f;
            }else{
                vetor[cont] *= 1.05f;
            }
        }
    }
    private void imprimirValoresAtualizados(float[] vetor){
        for(int cont = 0; cont<vetor.length; cont++){
            System.out.println(vetor[cont]+" ");
        }
    }
    public static void main(String[] args) {
        new Unidade6_3();
    }
}
