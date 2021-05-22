import java.util.Scanner;

public class Unidade6_2{
    
    public Unidade6_2(){
        float[] vetorNumeros = new float[12];
        pedirValores(vetorNumeros);

        float media = calcularMedia(vetorNumeros);
        System.out.println("A média é: "+media);

        informarValoresMaioresMedia(vetorNumeros, media);
    }
    private void pedirValores (float[] vetorNumeros){
        Scanner entradas = new Scanner(System.in);
        for(int indice = 0; indice<vetorNumeros.length;indice++){
            System.out.print("Digite um valor real: ");
            vetorNumeros[indice] = entradas.nextFloat();
        }
        entradas.close();
    }
    private float calcularMedia(float[] vetorNumeros){
        float soma = 0;

        for(int indice = 0; indice<vetorNumeros.length;indice++){
            soma += vetorNumeros[indice];
        }
        float media = soma / vetorNumeros.length;
        return media;
    }
    private void informarValoresMaioresMedia(float[] vetorNumeros, float media) {
        String maiores = "";

        for(int indice = 0;indice<vetorNumeros.length;indice++){
            if(vetorNumeros[indice]>media){
                maiores += vetorNumeros[indice] + "\n";
            }
        }
        System.out.println(maiores);
    }
    public static void main(String[] args) {
        new Unidade6_2();
    }
}