package br.com.javacore.zztdesignpattern.decorator;

public interface DataSource {

    void writeData(String data);

    String readData();
}
