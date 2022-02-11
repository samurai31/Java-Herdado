
public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente CC = new ContaCorrente(111, 111);
		CC.deposita(100.0);

		ContaCorrente CP = new ContaCorrente(222, 222);
		CP.deposita(200.0);

		CC.transfere(10.0, CP);

		System.out.println(CC.getSaldo());
		System.out.println(CP.getSaldo());

	}
}
