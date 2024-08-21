package teste;

class SomaThread extends Thread {
    private int[] vetor;
    private int inicio, fim;
    private int soma;
    private String id;

    public SomaThread(int[] vetor, int inicio, int fim, String id) {
        this.vetor = vetor;
        this.inicio = inicio;
        this.fim = fim;
        this.soma = 0;
        this.id = id;
    }

    public void run() {
        for (int i = inicio; i < fim; i++) {
            soma += vetor[i];
            System.out.println("Thread " + id + " somando: " + vetor[i] + " - Soma parcial: " + soma);
        }
    }

    public int getSoma() {
        return soma;
    }
}
