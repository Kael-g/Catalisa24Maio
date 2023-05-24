import java.text.DecimalFormat;
import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        new DecimalFormat("0.#");

        System.out.printf("Digite um número inteiro: ");
        int numero = input.nextInt();

        System.out.printf("Antecessor: %d\nSucessor: %d", numero - 1, numero + 1);
    }
}