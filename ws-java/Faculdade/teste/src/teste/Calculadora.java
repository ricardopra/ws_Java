package teste;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Calculadora {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1-Potência\n2-Raiz Quadrada\n3-Máximo\n4-Mínimo\n5-Média Geométrica\n6-Sair");
            int op = scanner.nextInt();

            if (op == 6) {
                System.out.println("Sair");
                break;
            }

            if (op < 1 || op > 6) {
                System.out.println("Opção do menu inválida");
                continue;
            }

            System.out.println("Digite o primeiro número:");
            double num1 = scanner.nextDouble();
            System.out.println("Digite o segundo número:");
            double num2 = scanner.nextDouble();

            switch (op) {
                case 1:
                    System.out.println("Resultado: " + Math.pow(num1, num2));
                    break;
                case 2:
                    System.out.println("Raiz quadrada do primeiro número: " + Math.sqrt(num1));
                    System.out.println("Raiz quadrada do segundo número: " + Math.sqrt(num2));
                    break;
                case 3:
                    System.out.println("Máximo: " + Math.max(num1, num2));
                    break;
                case 4:
                    System.out.println("Mínimo: " + Math.min(num1, num2));
                    break;
                case 5:
                    System.out.println("Média Geométrica: " + Math.sqrt(num1 * num2));
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}
