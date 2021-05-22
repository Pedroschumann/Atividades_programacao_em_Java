import java.util.Scanner;

public class Unidade6_10 {
    private Scanner entradas;

    public Unidade6_10(){
        entradas = new Scanner(System.in);
        int[] vetor = new int[50];
        int posicao = 0;

        System.out.println("“1 – Incluir valor”\n“2 – Pesquisar valor”\n“3 – Alterar valor”\n“4 – Excluir valor”\n“5 – Mostrar valores”\n“6 – Ordenar valores”\n“7 – Sair do sistema”");
        System.out.print("Digite uma opcao: ");
        int opcao = entradas.nextInt();
        while(opcao != 7){
            switch(opcao){
                case 1: incluirValor(vetor, posicao);
                        posicao ++;
                break;
                case 2: System.out.println(pesquisarValor(vetor, posicao));
                break;
                case 3: alterarValor(vetor, posicao);
                break;
                case 4: excluirValor(vetor, posicao);
                        posicao --;
                break;
                case 5: mostrarValores(vetor, posicao);
                break;
                case 6: ordenarValores(vetor, posicao);
                break;
                case 7: break;
                default: System.out.println("A opção digitada está incorreta!");
            } 
            System.out.print("Digite uma opcao: ");
            opcao = entradas.nextInt();
        }
    }
    public void incluirValor(int[] vetor, int posicao){
        if(posicao<50){
            System.out.print("Digite um valor pra ser incluído: ");
            vetor[posicao] = entradas.nextInt();
        }
    }
    public String pesquisarValor(int[] vetor, int posicao){
        int cont = 0;
        String mensagem = "";
        System.out.print("Digite um valor para pesquisar: ");
        int valor = entradas.nextInt();
        while(cont<posicao){
            if(vetor[cont] == valor){
                mensagem = "O valor está no vetor";
                return mensagem;
            }      
            cont ++;
        }
        mensagem = "O vetor não possui este valor";
        return mensagem;
    }
    public void alterarValor(int[] vetor, int posicao){
        System.out.print("Qual número deseja substituir? ");
        int numeroPraRetirar = entradas.nextInt();
        System.out.print("Deseja colocar que número no lugar? ");
        int numeroSubstituto = entradas.nextInt();
        
        for(int cont = 0; cont<posicao; cont++){
            if(vetor[cont]==numeroPraRetirar){
                vetor[cont] = numeroSubstituto;
                break;
            }else if(cont == posicao-1){
                System.out.println("Valor não encontrado: ");
            }
        }
    }
    public void excluirValor(int[] vetor, int posicao){
        System.out.print("Digite um valor para excluir: ");
        int valorExcluir = entradas.nextInt();
        for(int cont = 0; cont<posicao; cont ++){
            if(vetor[cont] == valorExcluir){
                for(int indice = cont; indice<posicao; indice ++){
                    vetor[indice] = vetor[indice+1];
                }
                break;
            }
        }
    }
    public void mostrarValores(int[] vetor, int posicao){
        for(int cont = 0; cont<posicao; cont++){
            System.out.println(vetor[cont]+"  ");
        }
    }
    public void ordenarValores(int[] vetor, int posicao){
        for(int cont = 0; cont<posicao; cont ++){
            for(int contador2 = 0; contador2<posicao; contador2++){
                if(vetor[cont]<vetor[contador2]){
                    int varTemporaria = vetor[cont];
                    vetor[cont] = vetor[contador2];
                    vetor[contador2] = varTemporaria;
                }
            }
        }
    }
    public static void main(String[] args) {
        new Unidade6_10();
    }
}