package Uninter;
//cria a class dolar e faz ela ser filha da moeda
public class Dolar extends Moeda {

	public Dolar(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Dolar - "+ valor);
	}
//faz a parte de converter o valor digitado pela cotação da moeda em real
	@Override
	public double converter() {
		double total = (valor*5);
		return total ;
	}

	@Override
	public String toString() {
		return "Dolar Valor = " + valor ;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	
}
