public class Atividade4 {
    public static void main(String[] args) {

        double s = 0;
        double divisor = 3;
        double dividendo = 2;

        for (int valor=1; valor<=20;valor++){
            s = s + (divisor/dividendo);
            divisor += 2;
            dividendo += 2 + 2*valor;
        }
        System.out.println(s);
    }
}
