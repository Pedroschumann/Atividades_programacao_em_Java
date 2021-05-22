import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        int lucroMenos10 = 0;
        int lucroEntre10e20 = 0;
        int lucroMaior20 = 0;

        float pcTotal = 0;
        float pvTotal = 0;
        float lucroTotal = 0;
        for (int cont = 0; cont<20; cont++){
            System.out.print("Digite o nome da mercadoria: ");
            String nome = entradas.next();

            System.out.print("Digite o preço de compra: ");
            float pc = entradas.nextFloat();

            System.out.print("Digite o preço de venda: ");
            float pv = entradas.nextFloat();

            float porcentagemLucro = (pv-pc)/pc*100;

            if (porcentagemLucro<10){
                lucroMenos10 ++;
            }else if(porcentagemLucro>=10 && porcentagemLucro<20){
                lucroEntre10e20 ++;
            }else{
                lucroMaior20 ++;
            }

            pcTotal += pc;
            pvTotal += pv;
            lucroTotal += pv - pc;
        }

        System.out.println(lucroMenos10+" mercadorias proporcionam lucro inferior a 10%, "+lucroEntre10e20+
        " proporcionam lucros entre 10% e 20% e "+lucroMaior20+" proporcionam lucro maior ou igual a 20%.");
        System.out.println("O valor total de compra foi de: "+pcTotal+
        ". O valor total de vendas foi de "+pvTotal+". Obtendo lucro total de "+lucroTotal);

        entradas.close();
    }
}
