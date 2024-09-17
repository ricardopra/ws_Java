import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte code = input.nextByte();
        System.out.println(switch (code) {
            case 1 -> new Celular().hashCode();
            case 2 -> new Celular(input.nextLong(), input.next()).hashCode();
            case 3 -> new Celular(input.next(), input.next()).hashCode();
            default -> throw new IllegalArgumentException("Error");
        });

        input.close();
    }
}