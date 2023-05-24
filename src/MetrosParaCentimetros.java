import java.text.DecimalFormat;
import java.util.Scanner;

public class MetrosParaCentimetros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.####");
        System.out.println("Corversor de metros para centímetros");
        System.out.println("Metros:");
        double metros = input.nextDouble();

        double centimetros = metros * 100.0;

        System.out.printf("%s metros = %s centímetros", df.format(metros), df.format(centimetros));
    }
}
