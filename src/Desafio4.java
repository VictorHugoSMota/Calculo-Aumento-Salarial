import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        double salario = scanner.nextDouble();
        double percentualAumento;

        if (salario <= 280) {
            percentualAumento = 20;
        } else if (salario <= 700) {
            percentualAumento = 15;
        } else if (salario <= 1500) {
            percentualAumento = 10;
        } else {
            percentualAumento = 5;
        }

        double valorAumento = salario * (percentualAumento / 100);
        double novoSalario = salario + valorAumento;
        double inflacao = 3.8;
        double aumentoReal = valorAumento - (salario * (inflacao / 100));

        System.out.println("\nSalário antes do reajuste: R$ " + salario);
        System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
        System.out.println("Valor do aumento: R$ " + valorAumento);
        System.out.println("Novo salário após aumento: R$ " + novoSalario);
        System.out.println("Valor do aumento real (descontando a inflação): R$ " + aumentoReal);

    }
}
