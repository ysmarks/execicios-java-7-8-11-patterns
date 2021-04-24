package br.com.javacore.zztdesignpattern.proxy.testes;

import java.util.ArrayList;
import java.util.List;
import br.com.javacore.zztdesignpattern.proxy.PessoaProxy;
import br.com.javacore.zztdesignpattern.proxy.Pesssoa;

public class ProxyExemplo {
	
	public static void main(String[] args) {
		
		List<Pesssoa> pesssoas = new ArrayList<>();
		pesssoas.add(new PessoaProxy("1"));
		pesssoas.add(new PessoaProxy("2"));
		pesssoas.add(new PessoaProxy("3"));
		
		//Busca no banco de dados
		System.out.println("Nome: " + pesssoas.get(0).getNome());
		System.out.println("Nome: " + pesssoas.get(1).getNome());
		
		//Já buscou essa pessoa...apenas retorna do cache
		System.out.println("Pessoa: " + pesssoas.get(0).getNome());
		
		//A terceira pessoa nunca será consultada no banco de dados, melhora a performance - lazy loading
		System.out.println("Id da 3ª - " + pesssoas.get(2).getId());
	}

}
