import java.util.Scanner;

public class Caixa {
	public Scanner Ler = new Scanner(System.in);
	public double Valor;
	public int N200;
	public int N100;
	public int N50;
	public int N20;
	public int N10;
	public int N5;
	public int N2;

	public void InsereValorSaque() {
		System.out.printf("valor para saque somente em notas: ");
		Valor = Ler.nextDouble();
	}

	public void Calcula200() {
		while (Valor >= 200) {
			Valor = Valor - 200;
			N200++;
		}
	}

	public void Calcula100() {
		while ((Valor >= 100) & (Valor < 200)) {
			Valor = Valor - 100;
			N100++;
		}
	}

	public void Calcula50() {
		while ((Valor >= 50) & (Valor < 100)) {
			Valor = Valor - 50;
			N50++;
		}
	}

	public void Calcula20() {
		while ((Valor >= 20) & (Valor < 50)) {
			Valor = Valor - 20;
			N20++;
		}
	}

	public void Calcula10() {
		while ((Valor >= 10) & (Valor < 20)) {
			Valor = Valor - 10;
			N10++;
		}
	}

	public void Calcula5() {
		while ((Valor >= 5) & (Valor < 10)) {
			Valor = Valor - 5;
			N5++;
		}
	}

	public void Calcula2() {
		while ((Valor >= 2) & (Valor < 5)) {
			Valor = Valor - 2;
			N2++;
		}
	}

	public void MostraResultado() {
		System.out.println("Nota 200:" + N200);
		System.out.println("Nota 100:" + N100);
		System.out.println("Nota 50:" + N50);
		System.out.println("Nota 20:" + N20);
		System.out.println("Nota 10:" + N10);
		System.out.println("Nota 5:" + N5);
		System.out.println("Nota 2:" + N2);
		System.out.println("valor final:" + Valor);
	}
}