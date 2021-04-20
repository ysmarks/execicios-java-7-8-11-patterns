package br.com.javacore.zztdesignpattern.decorator;

public class DataSourceDecorator implements DataSource{

    private DataSource wrappe;

    public DataSourceDecorator(DataSource wrappe) {
        this.wrappe = wrappe;
    }

    @Override
    public void writeData(String data) {
        wrappe.writeData(data);
    }

    @Override
    public String readData() {
        return wrappe.readData();
    }
}
