public class Conta {
    private String nome;
    private String numeroConta;
    private int saldo;

    public Conta() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Conta(String nome, String numeroConta, int saldo){
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void investimento(){
        Investimento p1 = new Investimento("Vitor", "110200", 200);
        p1.investir();
    }

    public void movimentarConta(){
        Movimentacao m1 = new Movimentacao("Vitor", "110200", 200);
        m1.movimentarConta();
    }
}