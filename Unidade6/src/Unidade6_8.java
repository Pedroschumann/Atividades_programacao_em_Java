import java.util.Scanner;

public class Unidade6_8 {
    private Scanner entradas;
    public Unidade6_8(){
        entradas = new Scanner(System.in);

        float[] vetor = lerNumeroPosicoes();
        preencherVetor(vetor);
        imprimirTabela(vetor);

    }
    public float[] lerNumeroPosicoes(){
        System.out.print("Digite quantas posições o vetor terá, limitando-se a 20 posições: ");
        float[] valores = new float[entradas.nextInt()];
        while(valores.length>20){
            System.out.print("O número digitado é superior ao solicitado, limite-se a 20 posições: ");
            valores = new float[entradas.nextInt()];
        }
        return valores;
    }
    public void preencherVetor(float[] vetor){
        for(int posicao = 0; posicao<vetor.length; posicao++){
            System.out.println("Digite um valor pro vetor: ");
            vetor[posicao] = entradas.nextInt();
        }
    }
    public void imprimirTabela(float[] vetor){
        System.out.println("Valor   Frequência");
        
        for(int posicao = 0; posicao<vetor.length; posicao++){
            int frequencia = 0;
            if(posicao==0){
                for(int cont = 0; cont<vetor.length; cont++){
                    if(vetor[posicao]==vetor[cont]){
                        frequencia ++;
                    }
                }
                System.out.println(vetor[posicao]+"     "+frequencia);
            }else{
                for(int verificador = 0; verificador<posicao; verificador++){
                    if(vetor[verificador]==vetor[posicao]){
                        if(posicao<vetor.length-1){
                            posicao ++;
                            verificador = -1;
                        }
                    }
                }   
                for(int cont = 0; cont<vetor.length; cont++){
                    if(vetor[posicao]==vetor[cont]){
                        frequencia ++;
                    }
                }
                System.out.println(vetor[posicao]+"     "+frequencia);
            }
        }
    }
    public static void main(String[] args) {
        new Unidade6_8();
    }
}
