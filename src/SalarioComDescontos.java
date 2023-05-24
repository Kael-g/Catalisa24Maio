import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioComDescontos {
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

        double salario_bruto = valor_hora * total_horas;
        double imposto_de_renda = salario_bruto * 0.11;
        double inss = salario_bruto * 0.08;
        double sindicato = salario_bruto * 0.05;
        double salario_liquido = salario_bruto - imposto_de_renda - inss - sindicato;

        System.out.printf("\nSalário bruto: R$%s\n", df.format(salario_bruto));
        System.out.printf("INSS: R$%s\n", df.format(inss));
        System.out.printf("Sindicato: R$%s\n", df.format(sindicato));
        System.out.printf("Salário líquido: R$%s\n", df.format(salario_liquido));
    }
}