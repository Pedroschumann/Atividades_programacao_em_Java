import java.util.Scanner;

public class Problema13_extra {
    public static void main(String[] args) {
        //Entradas: Comprimento e altura da parede
        //Saídas: valor gasto com azulejos
        //Testes:10.. 3 => 3375

        Scanner entradas = new Scanner(System.in);

        float comprimento = entradas.nextFloat();
        float altura = entradas.nextFloat();

        float area = comprimento * altura;

        float azulejos = 9 * area;
        float custo = azulejos * 12.5f;

        System.out.println("O custo é de R$ "+custo);

        entradas.close();
    }
}
