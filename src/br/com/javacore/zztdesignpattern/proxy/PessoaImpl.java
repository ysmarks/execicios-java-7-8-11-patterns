package br.com.javacore.zztdesignpattern.proxy;

public class PessoaImpl implements Pesssoa{
	
	private String id;
	private String nome;

	public PessoaImpl(String id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public String getId() {
		
		return this.id;
	}
	
	public String getNome() {
		
		return this.nome;
	}

}
