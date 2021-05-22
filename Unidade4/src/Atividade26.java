import java.util.Scanner;

public class Atividade26 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.println("Escolha uma opção de cálculo de área:\nT--> Triângulo\n"+
                        "Q--> Quadrado\nR--> Retângulo\nC--> Círculo");
        String opcao = entradas.next();
        opcao = opcao.toUpperCase();//deixa todas as letras maiúsculas
        opcao = opcao.trim(); //remove espaços em branco nas bordas do texto
        char caracter = opcao.charAt(0);//pega a primeira letra da palavra
        
        switch (caracter){
            case 'T': System.out.print("Digite a base 'b' do triângulo: ");
            float b = entradas.nextFloat();
            System.out.print("Digite a altura 'h' do triângulo: ");
            float h = entradas.nextFloat();
            float areaTriangulo = (b*h)/2;
            System.out.println("A área do triângulo é: "+areaTriangulo);
                break;

            case 'Q': System.out.print("Digite o lado 'l' do quadrado: ");
            float l = entradas.nextFloat();
            float areaQuadrado = l*l;
            System.out.println("A área do quadrado é: "+areaQuadrado);
                break;

            case 'R': System.out.print("Digite a base 'b' do retângulo: ");
            b = entradas.nextFloat();
            System.out.print("Digite a altura 'h' do retângulo: ");
            h = entradas.nextFloat();
            float areaRetangulo = (b*h);
            System.out.println("A área do Retângulo é: "+areaRetangulo);
                break;

            case 'C': System.out.print("Digite o raio 'r' do círculo: ");
            float r = entradas.nextFloat();
            double areaCirculo = Math.PI * (r*r);
            System.out.println("A área do círculo é: "+areaCirculo);
                break;

            default: System.out.println("Opção incorreta!");
        }

        entradas.close();
    }
}
