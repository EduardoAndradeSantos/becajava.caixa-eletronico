public class Principal {

	public static void main(String[] args) {

		Caixa caixa = new Caixa();
		caixa.InsereValorSaque();
		caixa.Calcula200();
		caixa.Calcula100();
		caixa.Calcula50();
		caixa.Calcula20();
		caixa.Calcula10();
		caixa.Calcula5();
		caixa.Calcula2();
		caixa.MostraResultado();
	}
}