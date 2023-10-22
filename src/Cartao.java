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
    public static long gerarCartao() {
        Random gerador = new Random();
        long numeroAleatorio = 1_000_000_000_000_000L + gerador.nextLong(9_000_000_000_000_000L);
        cartao.setNumeroCartao(numeroAleatorio);
        long numCartao = cartao.getNumeroCartao();
        return numCartao;
    }
}