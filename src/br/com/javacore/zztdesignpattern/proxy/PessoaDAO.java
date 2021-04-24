package br.com.javacore.zztdesignpattern.proxy;

/**
 * Exemplo 1
 * 
 * @author ysmarks 
 * Simula o acesso ao banco de dados
 */
public class PessoaDAO {

	public static Pesssoa getPessoaById(String id) {

		System.out.println("select * from PESSOA where id = " + id);

		return new PessoaImpl(id, " Pessoa" + id);
	}
}
