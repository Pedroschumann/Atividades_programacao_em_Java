public class Unidade5_21 {
    public static void main(String[] args) {
        
        float ze = 1.10f;
        float chico = 1.50f;
        int anos = 0;

        while (ze<chico){
            anos ++;
            ze += 0.03f;
            chico += 0.02f;
        }

        System.out.println("Para que Zé fique maior que Chico levará "+anos+" anos.");

    }
}
