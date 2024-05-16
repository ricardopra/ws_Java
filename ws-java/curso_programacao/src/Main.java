import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		System.out.println("Hello World !");
		System.out.println("Good Morning !");
		System.out.println(y);
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
	}

}
