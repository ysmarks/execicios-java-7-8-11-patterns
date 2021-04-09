package br.com.javacore.xnio.testes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CriandoPathTest {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\ysmarks.santos\\Downloads\\testediversos\\folder2\\arquivo-renomeado.txt");
        System.out.println(path.toAbsolutePath());

        //criar diretorio
        Path path1 = Paths.get("pasta");
        Path path2 = Paths.get("pasta\\subpasta\\subsubpasta");
        Path arquivo = Paths.get("pasta\\subpasta\\subsubpasta\\file.txt");
        try {
            if(Files.notExists(path2.getParent())) {
                Files.createDirectories(path2.getParent());
            }
            if(Files.notExists(arquivo)) {
                Files.createFile(arquivo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path source = Paths.get("folder2\\teste.txt");
        Path target = Paths.get("pasta\\subpasta\\subsubpasta\\arquivoCopiado.txt");
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            Files.deleteIfExists(target);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
