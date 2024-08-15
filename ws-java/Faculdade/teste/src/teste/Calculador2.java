package teste;
import java.util.Scanner;

public class Calculador2 {
    private static final int TAMANHO = 10;
    private static int[] vetor = new int[TAMANHO];
    private static int count = 0;    

    public static void adicionarElemento(int elemento) {
        if (count < TAMANHO) {
            vetor[count] = elemento;
            count++;
        }
    }

    public static int calcularSoma() {
        int soma = 0;
        for (int i = 0; i < count; i++) {
            soma += vetor[i];
        }
        return soma;
    }

    public static int encontrarMaior() {
        int maior = vetor[0];
        for (int i = 1; i < count; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static int encontrarMenor() {
        int menor = vetor[0];
        for (int i = 1; i < count; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    public static double calcularMedia(int soma) {
        return (double) soma / count;
    }

    // NÃO ALTERE O CÓDIGO DO MÉTODO PRINCIPAL //
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inserir elementos no vetor
        for (int i = 0; i < TAMANHO; i++) {
            int elemento = input.nextInt();
            adicionarElemento(elemento);
        }

        // Calcular e exibir soma dos elementos
        int soma = calcularSoma();
        System.out.println("Soma dos elementos: " + soma);

        // Encontrar e exibir o maior valor
        int maior = encontrarMaior();
        System.out.println("Maior valor: " + maior);

        // Encontrar e exibir o menor valor
        int menor = encontrarMenor();
        System.out.println("Menor valor: " + menor);

        // Calcular e exibir a média dos elementos
        double media = calcularMedia(soma);
        System.out.println("Média dos elementos: " + media);
        input.close();
    }    
}

