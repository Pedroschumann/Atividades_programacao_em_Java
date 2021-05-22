import java.util.Scanner;

public class Unidade6_7 {

    private Scanner entradas;

    public Unidade6_7(){
        entradas = new Scanner(System.in);

        int[] vetor = criarVetor();
        inserirNumeros(vetor);
        informarVetorResultante(vetor);
    }
    public int[] criarVetor(){
        int situacao = 0;
        System.out.print("Digite a quantidade de elementos que o vetor irá conter, limitando-se a 20 posições: ");
        int[] vetor = new int[entradas.nextInt()];

        while(situacao != 1){
            if(vetor.length>20){
                System.out.println("O número de posições ultrapassou o limite de 20 posições! Digite outro número INFERIOR OU IGUAL a 20?:");
                vetor = new int[entradas.nextInt()];
                situacao = 0;

            }else{
                situacao = 1;
            }
        }

        return vetor;
    }
    public void inserirNumeros(int[] vetor){
        for(int posicao = 0;posicao<vetor.length;posicao++){
            System.out.print("Digite um valor pro vetor: ");
            int valor = entradas.nextInt();

            if(posicao == 0){
                vetor[posicao] = valor;
            }else{
                for(int cont = 0; cont<posicao;cont++){
                    if(vetor[cont] == valor){
                        System.out.println("O valor já existe na lista, digite outro valor! ");
                        valor = entradas.nextInt();
                        cont = -1;
                    }
                }
                if(vetor[posicao-1]<valor){
                    vetor[posicao] = valor;
                }else{
                    for(int cont = posicao; cont>0; cont--){
                        if(valor<vetor[cont-1]){
                            vetor[cont] = vetor[cont-1];
                            vetor[cont-1] = valor;
                        }     
                    }
                }
            }
        }
    }
    public void informarVetorResultante(int[] vetor){
        String valoresVetor = "";
        for(int posicao = 0; posicao<vetor.length; posicao++){
            valoresVetor += vetor[posicao] + " ";
        }
        System.out.println(valoresVetor);
    }
    public static void main(String[] args) {
        new Unidade6_7();
    }
}
