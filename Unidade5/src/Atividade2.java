public class Atividade2 {
    public static void main(String[] args) {
        int somaPar = 0;
        int somaImpar = 0;
        for (int cont = 1;cont<=100;cont++){
            if (cont%2==0){
                somaPar += cont;
            }else{
                somaImpar += cont;
            }
        }
        System.out.println("A soma dos números pares: "+somaPar);
        System.out.println("A soma dos números ímpares: "+somaImpar);
    }
}
