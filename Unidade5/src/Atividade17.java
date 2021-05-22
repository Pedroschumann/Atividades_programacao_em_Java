import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite o número da inscrição do atleta: ");
        int nInscricao = entradas.nextInt();

        int inscricaoMaior = 0;
        int inscricaoMenor = 0;
        float alturaMaior = 0;
        float alturaMenor = 0;

        float alturaMedia = 0;
        int cont = 0;

        while(nInscricao!=0){
            System.out.print("Digite a altura do atleta: ");
            float altura = entradas.nextFloat();

            if (cont == 0){
                alturaMaior = altura;
                inscricaoMaior = nInscricao;
                alturaMenor= altura;
                inscricaoMenor = nInscricao;
            }

            if (altura>alturaMaior){
                alturaMaior = altura;
                inscricaoMaior = nInscricao;
            } else if(altura<alturaMenor){
                alturaMenor = altura;
                inscricaoMenor = nInscricao;
            }

            alturaMedia += altura;

            System.out.print("Digite o número da inscrição do atleta: ");
            nInscricao = entradas.nextInt();

            cont ++;
        }

        System.out.println("--Maior atleta-- \nnº inscrição: "+inscricaoMaior+". Com "+alturaMaior+" de altura.");
        System.out.println("--Menor atleta-- \nnº inscrição: "+inscricaoMenor+". Com "+alturaMenor+" de altura.");
        System.out.println("A altura média do grupo é de: "+alturaMedia);

        entradas.close();
    }
}
