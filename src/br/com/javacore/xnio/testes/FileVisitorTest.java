package br.com.javacore.xnio.testes;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

class AcharTodosOsBkp extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.getFileName().toString().endsWith(".bkp")) {
            System.out.println(file.getFileName());
        }

        return FileVisitResult.CONTINUE;

    }
}

class PrintDirs extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("File " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Pre: " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Pos: " + dir);
        return FileVisitResult.CONTINUE;
    }
}

public class FileVisitorTest {

    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("pasta"), new AcharTodosOsBkp());
    }
}
