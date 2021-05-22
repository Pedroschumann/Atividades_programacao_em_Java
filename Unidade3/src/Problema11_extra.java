import java.util.Scanner;

public class Problema11_extra {
    public static void main(String[] args) {
        //Entradas: temperatura em °F 
        //Saídas: Temperatura em °C
        //Testes: 54 => 12,2222

        Scanner entradas = new Scanner(System.in);

        float grausF = entradas.nextFloat();
        
        //float grausC = (grausF -32) / (9/5);
        
        float grausC = ((grausF*5) - (32 * 5)) / 9;

        System.out.println("A temperatura em °C é de "+grausC);

        entradas.close();
    }
}
