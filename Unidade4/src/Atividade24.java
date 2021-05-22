import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        int valor1 = entradas.nextInt();
        System.out.print("Digite o valor 2: ");
        int valor2 = entradas.nextInt();
        System.out.print("Digite o valor 3: ");
        int valor3 = entradas.nextInt();
        System.out.print("Digite a opção: ");
        int opcao = entradas.nextInt();

        switch (opcao){
            case 1: if(valor1<valor2 && valor1<valor3){
                if(valor2<valor3){
                    System.out.println(valor1 +"\n"+valor2+"\n"+valor3);
                }else{
                    System.out.println(valor1 +"\n"+valor3+"\n"+valor2);
                }
            }else if(valor2<valor1 && valor2<valor3){
                if(valor1<valor3){
                    System.out.println(valor2 +"\n"+valor1+"\n"+valor3);
                }else{
                    System.out.println(valor2 +"\n"+valor3+"\n"+valor1);
                }
            }else{
                if(valor1<valor2){
                    System.out.println(valor3 +"\n"+valor1+"\n"+valor2);
                }else{
                    System.out.println(valor3 +"\n"+valor2+"\n"+valor1);
                }
            }       
            break;

            case 2: if(valor1>valor2 && valor1>valor3){
                if(valor2>valor3){
                    System.out.println(valor1 +"\n"+valor2+"\n"+valor3);
                }else{
                    System.out.println(valor1 +"\n"+valor3+"\n"+valor2);
                }
            }else if(valor2>valor1 && valor2>valor3){
                if(valor1>valor3){
                    System.out.println(valor2 +"\n"+valor1+"\n"+valor3);
                }else{
                    System.out.println(valor2 +"\n"+valor3+"\n"+valor1);
                }
            }else{
                if(valor1>valor2){
                    System.out.println(valor3 +"\n"+valor1+"\n"+valor2);
                }else{
                    System.out.println(valor3 +"\n"+valor2+"\n"+valor1);
                }
            }   
            break;

            case 3: if(valor1>valor2 && valor1>valor3){
                System.out.print(valor2 +"\n"+valor1+"\n"+valor3);
            } else if(valor2>valor1 && valor2>valor3){
                System.out.print(valor1 +"\n"+valor2+"\n"+valor3);
            }else{
                System.out.print(valor1 +"\n"+valor3+"\n"+valor2);
            }
            break;

            default:System.out.println("Opção incorreta");
        }

        entradas.close();
    }
}
