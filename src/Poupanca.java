import java.util.Scanner;

public class Poupanca extends Conta {
    private int meses;
    private double jurosAoMes = 0.02;
    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public double getJurosAoMes() {
        return jurosAoMes;
    }

    public Poupanca(String nome, String numeroConta, int saldo) {
        super(nome, numeroConta, saldo);
    }

    public void poupar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, " + this.getNome());
        System.out.println("Seu saldo atual é: " + this.getSaldo());

        System.out.println("Você deseja investir na Poupança? 1 para sim e 0 para não.");
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

            case 0:
                System.out.println("Você escolheu não investir na Poupança.");
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}