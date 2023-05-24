import java.text.DecimalFormat;
import java.util.Scanner;

public class FarenheitParaCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.#");

        System.out.printf("Conversor de Farenheit para Celsius\n");
        System.out.printf("Farenheit: ");
        double farenheit = input.nextDouble();

        double celsius = (farenheit - 32.0) / 1.8;

        System.out.printf("\n%s°F = %s°C", df.format(farenheit), df.format(celsius));
    }
}