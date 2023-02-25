package Uninter;

import java.util.ArrayList;
public class Cofrinho {
	//cria a lista de moedas
	ArrayList<Moeda> ListaMoedas = new ArrayList<Moeda>();
	//funcao que adiciona moedas a partir doq o usuario coloou no console
	public void adicionar(Moeda c) {
		ListaMoedas.add(c);
	}
	//funcao que remove moedas a partir doq o usuario coloou no console
	public void remover(Moeda c) {
		ListaMoedas.remove(c);
	}
	//lista a moedas
	public void listar() {
		for(Moeda c : ListaMoedas) {
			System.out.println(c);
		}
	}
	//Converte juntas todas as moedas e assim faz a conversao
	int sum;
	public void calcular() {
		sum = 0  ;
		for (Moeda c: ListaMoedas) {
			sum += c.converter();
			
		}
		//return sum;
		System.out.println("O total convertido em real: "+ sum);
	}
}
