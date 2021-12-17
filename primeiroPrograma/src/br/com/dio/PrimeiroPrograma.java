package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gato gato = new Gato();
		Livro livro = new Livro();
		
		System.out.println(gato);
		System.out.println(livro);
		
		/*System.out.println("Hello Wolrd!");
		
		int a=3, b=4;
		
		System.out.println("Soma: " + (a+b));*/
	}

}


class Livro{
	private String nome;
	private String npag;
}