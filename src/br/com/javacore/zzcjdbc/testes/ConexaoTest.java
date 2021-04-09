package br.com.javacore.zzcjdbc.testes;

import br.com.javacore.zzcjdbc.db.CompradorDBOLD;

public class ConexaoTest {
    public static void main(String[] args) {
       //salvar();
       //deletar();
       //atualizar();
        // selecionaTudo();
        //CompradorDB.selecionarMetaData();
        //CompradorDB.checkDriverStatus();
        //CompradorDB.typeScrollTest();
        //CompradorDB.updateNomesToUpperCase();
        //System.out.println(CompradorDB.getByName("CAVALo"));
        //System.out.println(CompradorDB.searchByNameCallableStatement("%ato%"));
        //System.out.println(CompradorDB.searcheByNameRowSet("%cav%"));
        CompradorDBOLD.salvarTrasacao();

    }

    private static void salvar() {
        CompradorDBOLD.salvar();
    }

    private static void deletar() {
        CompradorDBOLD.deletar();
    }

    private static void atualizar() {
        CompradorDBOLD.atualizar();
    }

    private static void selecionaTudo() {
        CompradorDBOLD.selecionaTudo();
    }
}
