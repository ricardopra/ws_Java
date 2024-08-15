package teste;

import java.util.Scanner;

public class Praticando_Aula1 {
 
    public static void main(String[] args) {
 
        double n1, n2;
		int op;
		Scanner entrada = new Scanner(System.in);

		while (true) {
			
			op = entrada.nextInt();			
			
			if (op == 6)            
				break;
			if (op<1 || op>7) {     
				System.out.println("Opção do menu inválida");
				continue;
			}
			
			System.out.println("Digite 2 números: ");
			n1 = entrada.nextDouble();
			n2 = entrada.nextDouble();
			
			switch (op) {
			  case 1:			    
				  System.out.println("Potência = " + Math.pow(n1, n2));
                  break;
			  case 2:			    
				  System.out.println("Raiz quadrada " + n1 + " = " + Math.sqrt(n1));
                  System.out.println("Raiz quadrada " + n2 + " = " + Math.sqrt(n2));
                  break;
			  case 3:
				  System.out.println("Máximo = " + Math.max(n1, n2));
                  break;				
			  case 4:
				  System.out.println("Mínimo = " + Math.min(n1, n2));
                  break;
  			  case 5:                  
                  System.out.println("Média Geométrica = " + Math.sqrt(n1 * n2));
                  break;				
			default:
				System.out.println("Opção inválida");
			}
		}
		
		entrada.close();
	}
}