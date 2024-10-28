//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente guillerme = new Cliente();
        guillerme.setNome("guillerme");


        Conta cc = new ContaCorrente(guillerme);
        Conta cp = new ContaPoupanca(guillerme);

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cc.imprimirinfoscomuns();
        cp.imprimirExtrato();
        cp.imprimirinfoscomuns();

    }
}