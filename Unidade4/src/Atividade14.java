import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.println("Digite uma data (XX/XX/XXXX): ");
        String data = entradas.next();
        int dia = Integer.parseInt(data.substring(0, 2));
        int mes = Integer.parseInt(data.substring(3, 5));
        int ano = Integer.parseInt(data.substring(6));

        if(mes<13){
            if(mes==1|| mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
                if(dia<=31){
                    System.out.println("Data informada corretamente!");
                }
            }else{
                if(mes==4||mes==6||mes==9||mes==11){
                    if(dia<=30){
                        System.out.println("Data informada corretamente!");
                    }else{
                        System.out.println("Dia informado incorretamente");
                    }
                }else{
                    if(mes==2 && ano%4!=0){
                        if(dia<=28){
                            System.out.println("Data informada corretamente!");
                        }else{
                            System.out.println("Dia informado incorretamente!");
                        }
                    }else{
                        if(dia<=29){
                            System.out.println("Data informada corretamente!");
                        }else{
                            System.out.println("Dia informado incorretamente!");
                        }
                    }
                }
            }
        }else{
            System.out.print("Mês informado incorretamente");
        }

        entradas.close();
    }
}