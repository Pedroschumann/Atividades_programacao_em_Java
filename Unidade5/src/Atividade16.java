import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Digite a altura da pessoa: ");
        float altura = n.nextFloat();

        float mediaF = 0;
        float mediaGeral = 0;
        int cont = 0;
        int contF = 0;
        while(altura!=0){
            System.out.print("Digite o sexo (M - Masculino e F - Feminino): ");
            String sexo = n.next();

            cont++;
            mediaGeral += altura;
            if (sexo.equalsIgnoreCase("f")){
                mediaF += altura;
                contF ++;
            }
            System.out.print("Digite a altura da pessoa: ");
            altura = n.nextFloat();
        }

        mediaF /= contF;
        mediaGeral /= cont;

        System.out.println("A média da altura das mulheres é: "+mediaF);
        System.out.println("A média geral da altura do grupo é: "+mediaGeral);

        n.close();
    }
}
