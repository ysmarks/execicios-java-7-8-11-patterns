package br.com.javacore.zztdesignpattern.decorator.testes;

import br.com.javacore.zztdesignpattern.decorator.DataSource;
import br.com.javacore.zztdesignpattern.decorator.DataSourceDecorator;
import br.com.javacore.zztdesignpattern.decorator.EncryptionDecorator;
import br.com.javacore.zztdesignpattern.decorator.FileDataSource;

public class DecoratorTest {
	
	public static void main(String[] args) {
		
		String data = "nome,salario\nRomario,1000000\nBebeto,500000";
		DataSourceDecorator decorator = new DataSourceDecorator(new EncryptionDecorator(new FileDataSource("out/outputData.txt")));
		decorator.writeData(data);
		DataSource dataSource = new FileDataSource("out/outputData.txt");
		
		System.out.println("-------Input-------");
		System.out.println(data);
		System.out.println("-------Encoded-------");
		System.out.println(dataSource.readData());
		System.out.println("-------Decoded-------");
		System.out.println(decorator.readData());
	}

}
