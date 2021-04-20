package br.com.javacore.zztdesignpattern.decorator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class CompressionDecorator extends br.com.javacore.zztdesignpattern.decorator.DataSourceDecorator {

    private int compressionLevel = 10;

    public CompressionDecorator(DataSource wrappe) {
        super(wrappe);
    }

    public int getCompressionLevel() {
        return compressionLevel;
    }

    public void setCompressionLevel(int compressionLevel) {
        this.compressionLevel = compressionLevel;
    }

    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        return decompress(super.readData());
    }

    private String compress(String data) {

        byte[] data1 = data.getBytes();

        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream(512);
            DeflaterOutputStream dos = new DeflaterOutputStream(bos, new Deflater(compressionLevel));
            dos.write(data1);
            dos.close();
            bos.close();
            return Base64.getEncoder().encodeToString(bos.toByteArray());
        }catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    private String decompress(String readData) {

        byte[] data = Base64.getDecoder().decode(readData);

        try (InputStream in = new ByteArrayInputStream(data);
             InflaterInputStream iin = new InflaterInputStream(in);
             ByteArrayOutputStream bout = new ByteArrayOutputStream(512);) {
            
            int b;
            while((b = iin.read()) != -1) {
            	bout.wait(b);
            }
            return new String(bout.toByteArray());
        }catch (IOException | InterruptedException e) {
			e.printStackTrace();
			return null;
		}

    }

}
