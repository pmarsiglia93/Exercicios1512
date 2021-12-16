package br.com.generation.ex1512;

public class TestaTodosAnimais extends Animal{

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		
		c1.setNome("Bastião");
		c1.setIdade(7);
		c1.setLatir("Cachorro Latindo...");
		c1.setCorrer("Cachorro correndo...");
				
		System.out.println("Nome: " + 	c1.getNome());
		System.out.println("Som: " + 	c1.getLatir());
		System.out.println("Corre: " +	c1.getCorrer());
		System.out.println("Idade: " +	c1.getIdade() + " anos.");
						
		Cavalo c2 = new Cavalo();
		
		c2.setNome("Wallace");
		c2.setIdade(10);
		c2.setRelinchar("Cavalo Relinchando...");
		c2.setCorrer("Cavalo correndo...");
		
		System.out.println();
		System.out.println("Nome: " + 	c2.getNome());
		System.out.println("Som: " + 	c2.getRelinchar());
		System.out.println("Corre: " +	c2.getCorrer());
		System.out.println("Idade: " +	c2.getIdade() + " anos.");
		
		Preguica p1 = new Preguica();
		
		p1.setNome("Preguiçola");
		p1.setIdade(2);
		p1.setBocejar("Preguiça Bocejando...");
		p1.setSubir("A preguiça está subindo a arvore...");
		
		System.out.println();
		System.out.println("Nome: " + 				p1.getNome());
		System.out.println("Som: " +  				p1.getBocejar());
		System.out.println("Sobe em àrvores: " +	p1.getSubir());
		System.out.println("Idade: " + 				p1.getIdade() + " anos.");
		
				

	}

}
