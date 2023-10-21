import java.util.Scanner;
public class Movimentacao extends Cliente {
    private int sacar;
    private int depositar;

    public int getSacar() {
        return sacar;
    }

    public void setSacar(int sacar) {
        this.sacar = sacar;
    }

    public int getDepositar() {
        return depositar;
    }

    public void setDepositar(int depositar) {
        this.depositar = depositar;
    }


    public Movimentacao(){

    }

    public Movimentacao(String nome, String numeroConta, int saldo){
        super(nome, numeroConta, saldo);
    }

    public void movimentarConta() {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------- Você deseja sacar ou depositar? ----------");
        System.out.println("|   1 - Sacar            |");
        System.out.println("|   2 - Depositar        |");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("---------- Seu saldo atual é de R$ " + novaCliente.getSaldo() + " ----------");
                System.out.println("---- Quanto você deseja sacar da sua conta? ------");
                sacar = sc.nextInt();
                if(sacar <= novaCliente.getSaldo()) {
                    int novoSaldo = novaCliente.getSaldo() - sacar;
                    if (novoSaldo < novaCliente.getSaldo()) {
                        novaCliente.setSaldo(novoSaldo);
                        System.out.println("---------- Seu novo saldo é de R$ " + novoSaldo + " ----------");
                    }
                }else{
                    System.out.println("** Não é possível sacar mais dinheiro do que você tem em conta. **");
                }
                break;

            case 2:
                System.out.println("----- Seu saldo atual é de R$ " + novaCliente.getSaldo() + " -----");
                System.out.println("----- Quanto você deseja depositar na sua conta? -----");
                depositar = sc.nextInt();
                if(depositar >= 0){
                    int newSaldo = novaCliente.getSaldo() + depositar;
                    if(newSaldo >= 0) {
                        novaCliente.setSaldo(newSaldo);
                        System.out.println("----- Seu novo saldo é de R$ " + newSaldo + " -----");
                    }
                }else{
                    System.out.println("*** Não é possivel depositar um valor negativo. ***");
                }
                break;
        }
    }
}