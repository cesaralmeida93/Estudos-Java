package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {

	//Array []
	public static void main(String[] args) {

		int[] idades = new int[5];//inicializa os arrays com 0
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	
	}

}
