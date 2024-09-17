import java.util.Objects;

// Início da seção com a definição da classe Celular ///////////////////////

class Celular {
    String modelo;
    String marca;
    long imei;
    String numero;
    String cor;
    int anoFabricacao;

    // Início: Seção de definição dos métodos construtores ///////////////////////    

    // Construtor com IMEI e Número de Telefone
    public Celular(long imei, String numero) {
        this.imei = imei;
        this.numero = numero;
    }

    // Construtor com Modelo e Marca
    public Celular(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    // Construtor Padrão (Default)
    public Celular() {
        // Construtor sem parâmetros
    }

    // Fim: Seção de definição dos métodos construtores //////////////////////////

    // Método que apresenta na tela o estado do objeto
    public void mostraDados() {
        System.out.println("Modelo : " + modelo);
        System.out.println("Marca : " + marca);
        System.out.println("IMEI : " + imei);
        System.out.println("Número de Telefone : " + numero);
        System.out.println("Cor : " + cor);
        System.out.println("Ano de Fabricação : " + anoFabricacao);
    }

    // Outros métodos da classe
    public int hashCode() {
        return Objects.hash(modelo, marca, imei, numero, cor, anoFabricacao);
    }
}


