
public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente();
		joao.setNome("João");

		Conta ccorrente = new ContaCorrente(joao);
		Conta cpoupanca = new ContaPoupanca(joao);

		ccorrente.depositar(100);
		ccorrente.transferir(100, cpoupanca);

		ccorrente.imprimirExtrato();
		cpoupanca.imprimirExtrato();

	}

}
