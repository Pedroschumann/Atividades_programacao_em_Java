import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Informe a medida do lado 1: ");
        float lado1 = entradas.nextFloat();
    
        System.out.print("Informe a medida do lado 2: ");
        float lado2 = entradas.nextFloat();
       
        System.out.print("Informe a medida do lado 3: ");
        float lado3 = entradas.nextFloat();

        if (lado1<lado2+lado3 && lado2<lado1+lado3 && lado3<lado1+lado2){
            if(lado1 == lado2 && lado2==lado3){
                System.out.println("É um triângulo equilátero");
            }else{
                if(lado1==lado2 || lado1==lado3 || lado2==lado3){
                    System.out.println("É um triângulo isóscele");
                }else{
                    System.out.println("É um triângulo escaleno");
                }
            }
        }else{
            System.out.println("As medias não são de um triângulo");
        }

        entradas.close();
    }
}
