package teste;

public class SomaVetor {
    public static void main(String[] args) {
        int[] vetor = new int[100];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1; // Preenchendo o vetor com valores de 1 a 100
        }

        // Dividindo o vetor em duas partes
        int meio = vetor.length / 2;

        // Criando duas threads para somar as duas partes do vetor
        SomaThread thread1 = new SomaThread(vetor, 0, meio, "1");
        SomaThread thread2 = new SomaThread(vetor, meio, vetor.length, "2");

        // Iniciando as threads
        thread1.start();
        thread2.start();

        try {
            // Esperando as threads terminarem
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Somando os resultados das duas threads
        int somaTotal = thread1.getSoma() + thread2.getSoma();
        System.out.println("A soma total dos elementos do vetor é: " + somaTotal);
    }
}

