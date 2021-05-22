import java.util.Scanner;

public class Atividade27 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);
        
        System.out.println("Informe as horas e minutos de chegada: ");
        int horaChegada = entradas.nextInt();
        int minutoChegada = entradas.nextInt();
        System.out.println("Informe as horas e minutos de saída: ");
        int horaSaida = entradas.nextInt();
        int minutoSaida = entradas.nextInt();

        int horasEstacionado;
        int minutosEstacionado;
        double valorFinal = 0;
        if (horaChegada <= 23 && horaChegada >=0 && horaSaida <= 23 && horaSaida >=0 && minutoChegada <= 59 && minutoChegada >=0 && minutoSaida <= 59 && minutoSaida >=0){
            if (horaChegada>horaSaida){
                horasEstacionado = (24 - horaChegada)+horaSaida;
                if(minutoChegada>minutoSaida){
                    minutosEstacionado = (60-minutoChegada)+minutoSaida;
                    horasEstacionado -= 1;
                }else{
                    minutosEstacionado = minutoSaida-minutoChegada;
                }
            }else{
                horasEstacionado = horaSaida - horaChegada;
                if(minutoChegada>minutoSaida){
                    minutosEstacionado = (60-minutoChegada)+minutoSaida;
                    horasEstacionado -= 1;
                }else{
                    minutosEstacionado = minutoSaida-minutoChegada;
                }
            }

            int horasPagas = 0;
            if (minutosEstacionado>=30){
                horasPagas += 1 + horasEstacionado;
            }else if(minutosEstacionado <30 && horasEstacionado==0){
                horasPagas += 1;
            }else{
                horasPagas = horasEstacionado;
            }
            
            switch (horasPagas){
                case 1: valorFinal = 5;
                break;
                case 2: valorFinal = 10;
                break;
                case 3: valorFinal = 10 + 7.5f;
                break;
                case 4: valorFinal = 10 + 15;
                break;
                default: valorFinal = 10 + 15 + ((horasPagas-4)*10);
            }
        }else{
            System.out.println("Horas ou minutos digitados errados!");
        }
        System.out.println("O preço a ser cobrado é: R$ "+valorFinal);

        entradas.close();
    }
}
