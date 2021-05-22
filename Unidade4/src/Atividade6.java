import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite um caracter: ");
        String letra = entradas.next();
        letra = letra.toUpperCase();//deixa todas as letras maiúsculas
        letra = letra.trim(); //remove espaços em branco nas bordas do texto
        char caracter = letra.charAt(0);//pega a primeira letra da palavra

        if (caracter == 'M'){
            System.out.println("Masculino");
        }else{
            if (caracter == 'F'){
                System.out.println("Feminino");
            }else{
                if (caracter == 'I'){
                    System.out.println("Não Informado");
                }else{
                    System.out.println("Entrada Incorreta");
                }
            }
        }
        entradas.close();
    }
}
