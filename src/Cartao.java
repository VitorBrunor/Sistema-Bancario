import java.util.Random;
public class Cartao {
    private long numeroCartao;

    public long getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(long numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public Cartao() {
    }

    static Cartao cartao = new Cartao();
    public static void gerarCartao() {
        Random gerador = new Random();
        long numeroAleatorio = 1_000_000_000_000_000L + gerador.nextLong(9_000_000_000_000_000L);
        cartao.setNumeroCartao(numeroAleatorio);
        System.out.println("Número do cartão: " + cartao.getNumeroCartao());
    }

    public static void main(String[] args) {
        gerarCartao();
    }
}