import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a nota do primeiro bimestre:");

        double nota1;
        for (nota1 = input.nextDouble(); nota1 < 0.0 || nota1 > 10.0; nota1 = input.nextDouble()) {
            System.out.println("Nota inválida. Por favor, digite a nota do primeiro bimestre (Ex: 7,8)");
        }

        System.out.println("Digite a nota do segundo bimestre:");

        double nota2;
        for (nota2 = input.nextDouble(); nota2 < 0.0 || nota2 > 10.0; nota2 = input.nextDouble()) {
            System.out.println("Nota inválida. Por favor, digite a nota do segundo bimestre (Ex: 7,8)");
        }

        System.out.println("Digite a nota do terceiro bimestre:");

        double nota3;
        for (nota3 = input.nextDouble(); nota3 < 0.0 || nota3 > 10.0; nota3 = input.nextDouble()) {
            System.out.println("Nota inválida. Por favor, digite a nota do terceiro bimestre (Ex: 7,8)");
        }

        System.out.println("Digite a nota do quarto bimestre:");

        double nota4;
        for (nota4 = input.nextDouble(); nota4 < 0.0 || nota4 > 10.0; nota4 = input.nextDouble()) {
            System.out.println("Nota inválida. Por favor, digite a nota do quarto bimestre (Ex: 7,8)");
        }

        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        System.out.printf("A média é %.1f.", media);
    }
}
