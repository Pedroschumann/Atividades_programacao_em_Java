public class Unidade5_22 {
    public static void main(String[] args) {
        double aumento = 0.015f;
        int ano = 1996;
        double salario = 2000;

        while(ano<2021){
            salario += salario*aumento;
            aumento *= 2;
            ano ++;
        }

        System.out.println("Seu salário atual é de: "+salario);
    }
}
