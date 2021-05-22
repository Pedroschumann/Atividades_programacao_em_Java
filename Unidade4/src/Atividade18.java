import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite o dia do vencimento: ");
        int diaVencimento = entradas.nextInt();
        System.out.print("Digite o dia do pagamento: ");
        int diaPagamento = entradas.nextInt();
        System.out.print("Digite o valor da prestação: ");
        double valorPrestacao = entradas.nextInt();

        if (diaPagamento<=diaVencimento){
            valorPrestacao *= 0.90f;
            System.out.println("Prestação com 10% de desconto -> R$ "+valorPrestacao+". seu pagamento está em dia");
        }else if(diaPagamento-diaVencimento<=5){
            System.out.println("Prestação sem desconto -> R$ "+valorPrestacao);
        }else{
            int diasAtraso = diaPagamento-diaVencimento;
            double multa = diasAtraso*(valorPrestacao*0.02f);
            valorPrestacao -= multa;
            System.out.println("Valor com multa de atraso -> R$ "+valorPrestacao);
        }

        entradas.close();
    }
}
