import java.util.Scanner;

public class Unidade6_5 {
    
    private Scanner entradas;

    public Unidade6_5(){
        entradas = new Scanner(System.in);

        String[] rapaz = new String[5];
        String[] moca = new String[5];
        lerValores(rapaz, moca);

        int afinidade = retornarAfinidade(rapaz, moca);

        if(afinidade==15){
            System.out.println("Casem!");
        }else if(afinidade>=10){
            System.out.println("Vocês têm muita coisa em comum!");
        }else if(afinidade>=5){
            System.out.println("Talvez não dê certo :(");
        }else if(afinidade>=0){
            System.out.println("Vale um encontro.");
        }else if(afinidade<0 && afinidade>=-9){
            System.out.println("Melhor não perder tempo");
        }else{
            System.out.println("Vocês se odeiam!");
        }
    }
    public void lerValores(String[] rapaz, String[] moca){
        System.out.println("Gosta de música sertaneja?\nGosta de futebol?\nGosta de seriados?\nGosta de redes sociais?\nGosta da Oktoberfest?");
        System.out.println("Para responder use SIM, NÃo ou IND(indiferente):");

        for(int cont = 0; cont<rapaz.length; cont++){
            System.out.println("Resposta do rapaz para a pergunta "+(cont+1)+": ");
            rapaz[cont] = entradas.next();
            System.out.println("Resposta da moça para a pergunta "+(cont+1)+": ");
            moca[cont] = entradas.next();
        }
    }
    public int retornarAfinidade(String[] rapaz, String[] moca){
        int afinidade = 0;

        for(int cont = 0; cont<rapaz.length; cont++){
            if(rapaz[cont].equalsIgnoreCase(moca[cont])){
                afinidade += 3;
            }else if(rapaz[cont].equalsIgnoreCase("IND") || moca[cont].equalsIgnoreCase("IND")){
                afinidade ++;
            }else{
                afinidade -= 2;
            }
        }

        return afinidade;
    }
    public static void main(String[] args) {
        new Unidade6_5();
    }
}
