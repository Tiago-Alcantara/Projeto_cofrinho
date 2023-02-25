package Uninter;

import java.util.Objects;
//cria a class abstrada Moeda
public abstract class Moeda {
	//cria o a variavel valor 
	protected double valor;
	
	//cria o objeto moeda
	public Moeda(double valor) {
		this.valor = valor;
	}
	
	//define oq tem que ter dentro de moeda
	abstract void info();
	abstract double converter();


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

}
