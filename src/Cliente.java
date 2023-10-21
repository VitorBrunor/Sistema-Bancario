public class Cliente {
    private String nome;
    private String numeroConta;
    private int saldo;

    public Cliente() {

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

    public Cliente(String nome, String numeroConta, int saldo){
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void investimento(){
        Investimento investimento = new Investimento();
        investimento.investir();
    }

    public void movimentarConta(){
        Movimentacao movimentar = new Movimentacao();
        movimentar.movimentarConta();
    }

    static Cliente novaCliente = new Cliente("Vitor", "110202", 0);
}