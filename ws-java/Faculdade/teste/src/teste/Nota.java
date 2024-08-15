package teste;

public class Nota {
	public static void main (String [] args) {
	
	double p1;
	double p2;
	double p3;
	double media;
	
	p1 = 8.5;
	p2 = 9.6;
	p3 = 8;
	media = (p1+p2+p3)/3;
	
	System.out.print("A média obtida = ");
	System.out.printf("%.1f",media);
	System.out.println();
	}

}