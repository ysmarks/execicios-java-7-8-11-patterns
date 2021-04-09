package br.com.javacore.zzeconcorrencia.teste;

import java.util.concurrent.ConcurrentHashMap;

public class ConcorrenciaDeColecoesTest {

    public static void main(String[] args) {
        //ConcurrentHashMap
        //ConcurrentLinkedDeque
        //ConcurrentLinkedQueue
        //ConcurrentSkipListMap
        //ConcurrentSkipLisSet
        ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<>();
        chm.putIfAbsent("1", "2");
        chm.putIfAbsent("1", "1");
        System.out.println(chm.get("1"));
    }
}
