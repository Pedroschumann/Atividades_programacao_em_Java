import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) throws ParseException {
        Scanner entradas = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.print("Digite sua massa corporal (kg): ");
        float massa = entradas.nextFloat();
        System.out.print("Digite sua altura (metros): ");
        float altura = entradas.nextFloat();

        float imc = massa/(altura*altura);
        String imcFormatado = df.format(imc);
        imc = df.parse(imcFormatado).floatValue();

        if(imc<18.5){
            System.out.println(imc+" | Grau de obesidade: Magreza");
        }else if(imc>=18.5 && imc<=24.9){
            System.out.println(imc+" | Grau de obesidade: Saudável");
        }else if(imc>=25 && imc<=29.9){
            System.out.println(imc+" | Grau de obesidade: Sobrepeso");
        }else if(imc>=30 && imc<=34.9){
            System.out.println(imc+" | Grau de obesidade: Obesidade Grau I");
        }else if(imc>=35 && imc<=39.9){
            System.out.println(imc+" | Grau de obesidade: Obesidade Grau II (severa)");
        }else if(imc>=40){
            System.out.println(imc+" | Grau de obesidade: Obesidade Grau III (mórbida)");
        }

        entradas.close();
    }
}