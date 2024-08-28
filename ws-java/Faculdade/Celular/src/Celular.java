import java.util.Scanner;

// Início da seção com a definição da classe Celular ///////////////////////

class Celular {
    String modelo;
    String marca;
    long imei;
    String numero;
    String cor;
    int anoFabricacao;

    // Método para verificar a garantia
    String verificaGarantia() {
        int anoAtual = java.time.Year.now().getValue();
        if (anoAtual - anoFabricacao <= 2) {
            return "Dentro da garantia";
        } else {
            return "Fora da garantia";
        }
    }

    // Método para checar o IMEI
    boolean checaImei(long nro) {
        return this.imei == nro;
    }

    // Método para exibir o número formatado
    String exibeNumeroFormatado() {
        return String.format("(%s) %s-%s", 
            numero.substring(0, 2), 
            numero.substring(2, 7), 
            numero.substring(7, 11));
    }
}

// Fim da seção com a definição da classe Celular ///////////////////////

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Celular c = new Celular();
        c.modelo = input.next();
        c.marca = input.next();
        c.imei = input.nextLong();
        c.numero = input.next();
        c.cor = input.next();
        c.anoFabricacao = input.nextInt();
        
        System.out.print(fichaTecnica(c) + "\n" + "Imei: " + ((c.checaImei(input.nextLong()))? "válido" : "inválido"));        
        input.close();
    }

    static String fichaTecnica(Celular c) {
        return "Modelo: " + c.modelo + "\n" + 
                "Marca: " + c.marca + "\n" + 
                "Imei: " + c.imei + "\n" +
                "Número: " + c.exibeNumeroFormatado() + "\n" + 
                "Cor: " + c.cor + "\n" +
                "Ano de Fabricação: " + c.anoFabricacao + "\n" +
                "Garantia: " + c.verificaGarantia();
    }
}

