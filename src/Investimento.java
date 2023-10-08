import java.util.Scanner;
public class Investimento extends Conta {
    private int meses;
    public int getMeses() {
        return meses;
    }
    public void setMeses(int meses) {
        this.meses = meses;
    }

    public Investimento(){

    }

    Scanner sc = new Scanner(System.in);

    public void investir(){
        System.out.println("---------- Você deseja ver nossas opções de investimento? ----------");
        System.out.println("|   1 - Sim                       |");
        System.out.println("|   2 - Não                       |");
        int escolha = sc.nextInt();

        switch (escolha){
            case 1:
                System.out.println("---------- Escolha um investimento. ----------");
                System.out.println("|   1 - Poupança          |");
                System.out.println("|   2 - CDB               |");
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
                System.out.println("----- Você escolheu não ver as opções de investimento -----");
                break;

            default:
                System.out.println("*** Opção inválida ***");
                break;
        }
    }
    public void poupanca() {
        final double jurosAoMesPoupanca = 0.02;
        System.out.println("---------- Seu saldo atual é: " + novaConta.getSaldo() + " ----------");

        System.out.println("---------- Você deseja investir na Poupança? ----------");
        System.out.println("|   1 - Sim              |");
        System.out.println("|   2 - Não              |");
        int opcao = sc.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("---------- Quanto você deseja investir? ----------");
                int investir = sc.nextInt();

                // Atualiza o saldo após o investimento
                novaConta.setSaldo(novaConta.getSaldo() - investir);
                System.out.println("--- Seu saldo após o valor investido é de: " + novaConta.getSaldo() + " ---");

                if (investir <= novaConta.getSaldo()) {
                    System.out.println("----- Por quantos meses você deseja investir? -----");
                    this.setMeses(sc.nextInt());

                    // pega o valor investido, multiplica pela taca de juros e multiplica isso pelos meses investidos
                    double totalInvestimento = investir * jurosAoMesPoupanca * this.getMeses();

                    // pega o saldo(subtraido do valor investido), soma com o valor investido e soma isso com o lucro da aplicação
                    novaConta.setSaldo((int) (novaConta.getSaldo() + investir + totalInvestimento));

                    System.out.println("----- Seu saldo após o investimento é de " + novaConta.getSaldo() + " -----");
                } else {
                    System.out.println("----- Você não pode investir mais do que você tem na conta! -----");
                }
                break;

            case 2:
                System.out.println("---------- Você escolheu não investir na Poupança. ----------");
                break;

            default:
                System.out.println("----- Opção inválida. -----");
                break;
        }
    }

    public void CDB() {
        System.out.println("--- Você deseja investir no CDB? Tem o rendimento de 100% de CDI (13,65% ao mês) ---");
        System.out.println("|   1 - Sim            |");
        System.out.println("|   2 - Não            |");
        int escolha = sc.nextInt();

        switch(escolha){
            case 1:
                final double CDI = 0.1365;
                System.out.println("----- Saldo atual: " + novaConta.getSaldo() + " ---");
                System.out.println("--- Quanto você deseja investir? ---");
                int valor = sc.nextInt();
                if(valor > novaConta.getSaldo()){
                    System.out.println("--- Não é possível você investir um valor maior do que o seu saldo bancário ---");
                    break;
                }
                System.out.println("----- Por quantos meses você deseja investir? ---");
                int meses = sc.nextInt();

                double rendimento = valor * CDI * meses;

                double saldoTotal = novaConta.getSaldo() + rendimento;

                System.out.println("--- Saldo antes de investimento R$: " + (novaConta.getSaldo() - valor) + " ---");
                System.out.println("--- Rendimento R$: " + rendimento + " ---");
                System.out.println("--- Saldo total após o periodo investido R$:" + saldoTotal + " ---");
                novaConta.setSaldo((int) saldoTotal);
                break;

            case 2:
                System.out.println("----- Você escolheu não invstir no CDI -----2");
                break;
        }
    }
}