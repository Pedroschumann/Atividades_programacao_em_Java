import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite o número do seu curso: \n"+
                        "1 - Ciências da Computação\n 2 - Licenciatura da Computação\n"+
                        "3 - Sistemas da Informação:");
        
        int curso = entradas.nextInt();

        switch (curso) {
            case 1: System.out.println("Bacharel em Ciências da Computação");
                break;
            case 2: System.out.println("Licenciado em Computação");
                break;
            case 3: System.out.println("Bacharel em Sistemas de Informação");
                break;
            default: System.out.println("Curso inválido");
        }

        entradas.close();
    }
}
