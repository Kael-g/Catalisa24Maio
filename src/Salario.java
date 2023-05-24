import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite quanto você recebe por hora trabalhada: ");
        double valor_hora;
        for(valor_hora = input.nextDouble(); valor_hora < 0.0; valor_hora = input.nextDouble()) {
            System.out.printf("Valor inválido. Por favor, digite quanto você recebe por hora trabalhada: ");
        }

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double total_horas;
        for(total_horas = input.nextDouble(); total_horas < 0.0; total_horas = input.nextDouble()) {
            System.out.printf("Valor inválido. Por favor, digite o número de horas trabalhadas no mês: ");
        }

        double recebido = valor_hora * total_horas;

        System.out.printf("\nSalário do mês: R$%s.", df.format(recebido));
    }
}
