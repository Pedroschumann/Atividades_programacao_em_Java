import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1015 {
    public static void main(String[] args) {

        Scanner entradas = new Scanner(System.in);

        DecimalFormat decimalFormat = new DecimalFormat("0.0000");

        float x1 = entradas.nextFloat();
        float y1 = entradas.nextFloat();
        float x2 = entradas.nextFloat();
        float y2 = entradas.nextFloat();

        double x_ = Math.pow(x2 - x1, 2);
        double y_ = Math.pow(y2 - y1, 2);

        double distancia = Math.sqrt(x_ + y_);

        System.out.println(decimalFormat.format(distancia));

        entradas.close();
    }
}
