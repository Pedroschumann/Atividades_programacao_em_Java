public class Atividade10 {
    public static void main(String[] args) {

        int numero = 1;
        int n2 = 10;

        for (int cont=0; cont<10;){
            String valor = String.valueOf(numero);

            int primeriaParte = Integer.parseInt(valor.substring(0, n2));
            int segundaParte = Integer.parseInt(valor.substring(n2));

            int soma = primeriaParte + segundaParte;
            if(soma*soma == numero){
                System.out.println(numero);
                cont++;
            }
            numero++;

            if(valor.length()%2 != 0){
                numero *= 10;
                n2 ++;
            }
        }
    }
}
