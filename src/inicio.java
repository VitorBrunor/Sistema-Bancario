import java.util.Scanner;
public class inicio extends Conta {
    public inicio(String nome, String numeroConta, int saldo){
        super(nome, numeroConta, saldo);

    }
    public inicio() {
        acoes();
    }


    public void acoes() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá " + novaConta.getNome());
        System.out.println("Sua conta tem as seguintes opções:");
        System.out.println("1 - Movimentar a conta (saque/Depósito");
        System.out.println("2 - Investir");
        System.out.println("Escolha uma opção: ");
        int escolhendo = sc.nextInt();

        switch (escolhendo) {
            case 1:
                novaConta.movimentarConta();

                System.out.println("Deseja retornar ao menu inicio? ");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                int escol = sc.nextInt();
                if(escol == 1){
                    acoes();
                }else{
                    System.out.println("Finalizando aplicação");
                    break;
                }
                break;

            case 2:
                novaConta.investimento();

                System.out.println("Deseja retornar ao menu inicio? ");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                int eScholar = sc.nextInt();
                if(eScholar == 1){
                    acoes();
                }else{
                    System.out.println("Finalizando aplicação");
                    break;
                }
                break;
        }
    }
}