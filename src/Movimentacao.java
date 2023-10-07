import java.util.Scanner;
public class Movimentacao extends Conta{
    private int sacar;
    private int depositar;

    public Movimentacao(){

    }

    public Movimentacao(String nome, String numeroConta, int saldo){
        super(nome, numeroConta, saldo);
    }

    public void movimentarConta() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá " + getNome() + "!");
        System.out.println("Você deseja sacar ou depositar? ");
        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Seu saldo atual é de R$ " + getSaldo() );
                System.out.println("Quanto você deseja sacar da sua conta?");
                sacar = sc.nextInt();
                int novoSaldo = getSaldo() - sacar;
                setSaldo(novoSaldo);
                System.out.println("Seu novo saldo é de R$ 2" + novoSaldo);
                break;

            case 2:
                System.out.println("Seu saldo atual é de R$ " +getSaldo() );
                System.out.println("Quanto você deseja depositar na sua conta?");
                depositar = sc.nextInt();
                int newSaldo = getSaldo() + depositar;
                setSaldo(newSaldo);
                System.out.println("Seu novo saldo é de R$ " + newSaldo);
                break;
        }
    }
}