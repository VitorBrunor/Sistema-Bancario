import java.util.Scanner;
public class Investimento extends Conta {
    private int meses;
    private double jurosAoMesPoupanca = 0.02;
    private double CDI = 0.1365;
    public double getCDI() {
        return CDI;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public double getJurosAoMes() {
        return jurosAoMesPoupanca;
    }

    public Investimento(String nome, String numeroConta, int saldo) {
        super(nome, numeroConta, saldo);
    }

    Scanner sc = new Scanner(System.in);

    public void investir(){
        System.out.println("Olá " + getNome() + "!");
        System.out.println("Você deseja ver nossas opções de investimento?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int escolha = sc.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Escolha um investimento.");
                System.out.println("1 - Poupança");
                System.out.println("2 - CDB");
                int opcao = sc.nextInt();

                switch (opcao){
                    case 1:
                        poupanca();
                        break;
                    case 2:
                        CDB();
                        break;
                }
                break;

            case 2:
                System.out.println("Você escolheu não ver as opções de investimento");
                break;
        }
    }
    public void poupanca() {
        System.out.println("Olá, " + this.getNome());
        System.out.println("Seu saldo atual é: " + this.getSaldo());

        System.out.println("Você deseja investir na Poupança? ");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int opcao = sc.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Quanto você deseja investir?");
                int investir = sc.nextInt();

                // Atualiza o saldo após o investimento
                this.setSaldo(this.getSaldo() - investir);
                System.out.println("Seu saldo após o valor investido é de: " + this.getSaldo());

                if (investir <= this.getSaldo()) {
                    System.out.println("Por quantos meses você deseja investir?");
                    this.setMeses(sc.nextInt());

                    // pega o valor investido, multiplica pela taca de juros e multiplica isso pelos meses investidos
                    double totalInvestimento = investir * getJurosAoMes() * this.getMeses();

                    // pega o saldo(subtraido do valor investido), soma com o valor investido e soma isso com o lucro da aplicação
                    this.setSaldo((int) (this.getSaldo() + investir + totalInvestimento));

                    System.out.println("Seu saldo após o investimento é de " + this.getSaldo());
                } else {
                    System.out.println("Você não pode investir mais do que você tem na conta!");
                }
                break;

            case 2:
                System.out.println("Você escolheu não investir na Poupança.");
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    public void CDB() {
        System.out.println("olá " + getNome() + "!");
        System.out.println("Você deseja investir no CDB? Tem o rendimento de 100% de CDI (13,65% ao mês)");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int escolha = sc.nextInt();

        switch(escolha){
            case 1:
                System.out.println("Saldo atual: " + getSaldo());
                System.out.println("Quanto você deseja investir? ");
                int valor = sc.nextInt();
                if(valor <= getSaldo()){
                    valor = valor;
                }else{
                    System.out.println("Não é possível você investir um valor maior do que o seu saldo bancário ");
                }
                int novoSaldo = getSaldo() - valor;
                System.out.println("Por quantos meses você deseja investir? ");
                int meses = sc.nextInt();

                double rendimento = valor * CDI * meses;

                double saldoTotal = getSaldo() + rendimento;

                System.out.println("Saldo antes de investimento: R$" + (getSaldo() - valor));
                System.out.println("Rendimento: R$" + rendimento);
                System.out.println("Saldo total após o periodo investido: R$" + saldoTotal);
                break;

            case 2:
                System.out.println("Você escolheu não invstir no CDI");
                break;
        }
    }
}