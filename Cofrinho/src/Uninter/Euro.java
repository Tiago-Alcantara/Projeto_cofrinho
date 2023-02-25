package Uninter;
//cria a class euro e faz ela ser filha da moeda
public class Euro extends Moeda {

	public Euro(double valor) {
		super(valor);
	}
	@Override
	void info() {
		System.out.println("Dolar - "+ valor);
	}
	@Override
	public String toString() {
		return "Euro valor = " + valor ;
	}
	//faz a parte de converter o valor digitado pela cotação da moeda em real
	@Override
	double converter() {
		double total = (valor*6);
		return total;
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
