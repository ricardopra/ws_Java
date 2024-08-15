package teste;

public class ficha1 {
	public static void main(String [] args) {
		double montante;
		double taxa;
		double renda;
		
		montante = 17000;
		taxa = 0.07;
		renda = montante * taxa;
		montante = montante + renda;
		
		System.out.print("A renda obtida - ");
		System.out.printf("%.2f", renda);
		System.out.println();
		System.out.print("Valor do investimento após 1 ano = ");
		System.out.printf("%.2f", montante);
	}

}
