public class Atividade11 {
    public static void main(String[] args) {
        
        int biscoitosQuebrados = 0;
        int elevacao = 1;
        for(int cont = 1; cont<=16; cont++){
            biscoitosQuebrados += elevacao;
            elevacao *= 3;
        }
        System.out.println("O número de biscoitos quebrados foram: "+biscoitosQuebrados);
    }
}
