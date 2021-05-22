import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite a coordenada de x: ");
        float x = entradas.nextFloat();
        System.out.print("Digite a coordenada de y: ");
        float y = entradas.nextFloat();

        if (x==0 || y==0){
            System.out.println("0");
        }else if(x>0 && y>0){
            System.out.println("1");
        }else if(x>0 && y<0){
            System.out.println("2");
        }else if(x<0 && y<0){
            System.out.println("3");
        }else{
            System.out.println("4");
        }

        entradas.close();
    }
}
