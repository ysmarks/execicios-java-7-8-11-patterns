package br.com.javacore.zztdesignpattern.proxy;

import java.util.Objects;

public class PessoaProxy implements Pesssoa{

	private String id;
	
	private Pesssoa pessoa;
	
	public PessoaProxy(String id) {
		this.id = id;
	}

	public String getId() {
		
		return this.id;
	}

	public String getNome() {
		
		if(Objects.isNull(pessoa)) {
			//Apenas cria o objeto real quando chama este metodo
			pessoa = PessoaDAO.getPessoaById(id);
		}
		//Delega para o objeto real
		return pessoa.getNome();
	}

}
