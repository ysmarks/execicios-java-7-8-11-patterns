package br.com.javacore.wio.testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderXML {

	public static void main(String[] args) {

		// Criado no C:\ do Windows com as seguintes informa��es para finalizade de
		// teste
		/*
		 * <?xml version="1.0"> <filmes> <filme id="1"> <titulo>O XML veste
		 * prada</titulo> <resumo>O filme mostra a elegância da XML na representação
		 * de dados estruturados e semi estruturados.</resumo> <genero>Aventura</genero>
		 * <genero>Documentário</genero> <elenco> <ator>Mark UPlanguage</ator>
		 * <ator>Mary well-Formed</ator> <ator>Sedna D. Atabase</ator> </elenco>
		 * </filme> </filmes>
		 */
		String file = "C:\\exemplo.xml";
		String linha = null;

		try (FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader)) {

			linha = bufferedReader.readLine();
			System.out.println(linha);

			while (linha != null) {

				linha = bufferedReader.readLine();
				System.out.println(linha);
			}

		} catch (IOException e) {
			System.err.println("Erro na abertura do arquivo: %s. \n");
		}
	}

}
