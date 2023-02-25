package Uninter;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		Cofrinho cofrinho = new Cofrinho();
		
		//Cria o menu base para o usuario interragir  
		System.out.println("---Menu---");
		System.out.println("1-Adicionar Moeda");
		System.out.println("2-remover moeda");
		System.out.println("3-listagem de Moedas");
		System.out.println("4- Total Convertido em Real");
		System.out.println("0- Encerrar progama");
		System.out.println("-----------");
		opcao =  teclado.nextInt();
		
		//começa a parte de verificao para saber a escolha do usuario e assim dar seguimento no progama 
		int tipoMoeda;
		double valor;
		Moeda cofri;
		while(opcao!= 0) {
			
			switch(opcao) {
			
			case 1:
				//adicionar moedas
				tipoMoeda = 0;
				while(tipoMoeda>3 || tipoMoeda <=0) {
					System.out.println("1-Dolar");
					System.out.println("2-Euro");
					System.out.println("3-Real");
					tipoMoeda = teclado.nextInt();				
				}
				System.out.println("Qual o valor?");
				valor = teclado.nextInt();
				//verifica qual moeda quer escolher 
				cofri = null;
				if(tipoMoeda == 1 ) {
					cofri = new Dolar(valor);
					System.out.println("Adicionado com Sucesso!");
				}else if(tipoMoeda == 2 ) {
					cofri = new Euro(valor);
					System.out.println("Adicionado com Sucesso!");
					
				}else if(tipoMoeda == 3 ) {
					cofri = new Real(valor);
					System.out.println("Adicionado com Sucesso!");
					
				}
				//adiciona moeda no cofrinho
				cofrinho.adicionar(cofri);
				
				break;
				
			case 2:
				//remover moeda
				tipoMoeda = 0;
				while(tipoMoeda>3 || tipoMoeda <=0) {
					System.out.println("Deseja remover? ");
					System.out.println("1-Dolar");
					System.out.println("2-Euro");
					System.out.println("3-Real");
					tipoMoeda = teclado.nextInt();				
				}
				System.out.println("Qual o valor?");
				valor = teclado.nextInt();
				// verifica qual tipo de moeda vai ser removida
				cofri = null;
				if(tipoMoeda == 1 ) {
					cofri = new Dolar(valor);
					System.out.println("Removida com Sucesso!");
				}else if(tipoMoeda == 2 ) {
					cofri = new Euro(valor);
					System.out.println("Removido com Sucesso!");
					
				}else if(tipoMoeda == 3 ) {
					cofri = new Real(valor);
					System.out.println("Removido com Sucesso!");
					
				}
				//remove a moeda da lista
				cofrinho.remover(cofri);
				
				break;
				
			case 3:
				//Listar as Moedas
				cofrinho.listar();
				break;
			
			case 4:
				//Total convertido,chama a funcao para converter as moedas
				cofrinho.calcular();
				break;
			default:
				System.out.println("Opção Invalida!");
			
			}
			System.out.println("---Menu---");
			System.out.println("1-Adicionar Moeda");
			System.out.println("2-remover moeda");
			System.out.println("3-listagem de Moedas");
			System.out.println("4- Total Convertido em Real");
			System.out.println("0- Encerrar progama");
			opcao = teclado.nextInt();
			
		}
		

	}

}
