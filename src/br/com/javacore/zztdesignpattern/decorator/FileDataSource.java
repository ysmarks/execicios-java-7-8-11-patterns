package br.com.javacore.zztdesignpattern.decorator;

import java.io.*;

public class FileDataSource implements DataSource{
    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);
        try (OutputStream ops = new FileOutputStream(file)){
            ops.write(data.getBytes(), 0, data.length());
        }catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader fileReader = new FileReader(file)){
            buffer = new char[(int) file.length()];
            fileReader.read(buffer);

        }catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return new String(buffer);
    }
}
