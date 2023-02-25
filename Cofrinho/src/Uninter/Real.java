package Uninter;
//cria a class real e faz ela ser filha da moeda
public class Real extends Moeda {

	public Real(double valor) {
		super(valor);
		this.valor = valor;
	}

	@Override
	void info() {
		System.out.println("Dolar - "+ valor);
		
	}
//faz a parte de converter o valor digitado pela cotação da moeda em real
	@Override
	double converter() {
		double total = valor;
		return total;
	}

	@Override
	public String toString() {
		return "Real valor =" + valor;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
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
