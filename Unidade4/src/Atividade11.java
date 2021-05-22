import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento do irmão 1: ");
        int irmao1 = entradas.nextInt();
        System.out.print("Digite o ano de nascimento do irmão 2: ");
        int irmao2 = entradas.nextInt();
        System.out.print("Digite o ano de nascimento do irmão 3: ");
        int irmao3 = entradas.nextInt();

        if(irmao1 != irmao2 && irmao1 != irmao3 && irmao2 != irmao3){
            System.out.println("São apenas irmãos!");
        }else if(irmao1 == irmao2 && irmao1 == irmao3){
            System.out.println("São trigêmeos");
        }else{
            System.out.println("São gêmeos");
        }

        entradas.close();
    }
}
