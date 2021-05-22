import java.util.Scanner;

public class Unidade5_18 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.print("Digite o canal: ");
        int canal = entradas.nextInt();
        System.out.print("Digite o numero de pessoas: ");
        int numeroPessoas = entradas.nextInt();

        float canal4 = 0;
        float canal5 = 0;
        float canal9 = 0;
        float canal12 = 0;

        float totalPessoas = 0;
        while(canal!=0){
            if(canal == 4){
                canal4 += numeroPessoas;
                totalPessoas += numeroPessoas;
            } else if(canal == 5){
                canal5 += numeroPessoas;
                totalPessoas += numeroPessoas;
            } else if(canal == 9){
                canal9 += numeroPessoas;
                totalPessoas += numeroPessoas;
            } else if(canal == 12){
                canal12 += numeroPessoas;
                totalPessoas += numeroPessoas;
            }else{
                System.out.println("Canal informado incorretamente");
            }

            System.out.print("Digite o canal: ");
            canal = entradas.nextInt();
            System.out.print("Digite o numero de pessoas: ");
            numeroPessoas = entradas.nextInt();
        }

        canal4 = (canal4*100)/totalPessoas;
        canal5 = (canal5*100)/totalPessoas;
        canal9 = (canal9*100)/totalPessoas;
        canal12 = (canal12*100)/totalPessoas;

        System.out.println("Canal 4: "+canal4+"%.\nCanal 5: "+canal5+
        "%.\nCanal 9: "+canal9+"%.\nCanal 12: "+canal12+"%.");

        entradas.close();
    }
}