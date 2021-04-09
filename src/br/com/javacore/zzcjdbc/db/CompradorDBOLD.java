package br.com.javacore.zzcjdbc.db;

import br.com.javacore.zzcjdbc.classes.Comprador;
import br.com.javacore.zzcjdbc.conn.ConexaoFactory;

import javax.sql.rowset.JdbcRowSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompradorDBOLD {

    public static void salvar() {
        String sql = "insert into tbl_comprador(cpf, nome) values('484.199.272-46', 'gato')";
        Connection conexao = ConexaoFactory.getConexao();
        try {
            Statement statement = conexao.createStatement();
            statement.executeUpdate(sql);
            ConexaoFactory.close(conexao, statement);
            System.out.println("Registro inserido com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void salvarTrasacao() {
        String sql1 = "insert into tbl_comprador(cpf, nome) values('Teste1', 'Teste1')";
        String sql2 = "insert into tbl_comprador(cpf, nome) values('Teste2', 'Teste2')";
        String sql3 = "insert into tbl_comprador(cpf, nome) values('Teste3', 'Teste3')";
        Connection conexao = ConexaoFactory.getConexao();
        try {
            conexao.setAutoCommit(false);
            Statement stm = conexao.createStatement();
            stm.executeUpdate(sql1);
            stm.executeUpdate(sql2);
            conexao.commit();
            if (true) {
                throw new SQLException("**********TESTE**********");
            }
            stm.executeUpdate(sql3);
            System.out.println("Dados inseridos com sucesso");
            ConexaoFactory.close(conexao);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deletar() {
        String sql = "delete from tbl_comprador where id = 2";
        Connection conexao = ConexaoFactory.getConexao();
        try {
            Statement statement = conexao.createStatement();
            statement.executeUpdate(sql);
            ConexaoFactory.close(conexao, statement);
            System.out.println("Registro deletado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void atualizar() {
        String sql = "update tbl_comprador set nome = 'cachorro' where id = 1";
        Connection conexao = ConexaoFactory.getConexao();
        try {
            Statement statement = conexao.createStatement();
            statement.executeUpdate(sql);
            ConexaoFactory.close(conexao, statement);
            System.out.println("Registro atualizado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void selecionaTudo() {
        String sql = "select * from tbl_comprador";
        Connection conexao = ConexaoFactory.getConexao();
        try {
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
            }
            ConexaoFactory.close(conexao, statement, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Comprador> getByName(String nome) {
        String sql = "select * from tbl_comprador where nome like ?";
        Connection conexao = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
            ConexaoFactory.close(conexao, ps, rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Comprador> searcheByNameRowSet(String nome) {
        String sql = "select * from tbl_comprador where nome like ?";
        JdbcRowSet rscon = ConexaoFactory.getRowSetConnection();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            rscon.setCommand(sql);
            rscon.setString(1, "%" + nome + "%");
            rscon.execute();
            while (rscon.next()) {
                compradorList.add(new Comprador(rscon.getInt(1), rscon.getString(2), rscon.getString(3)));
            }
            ConexaoFactory.close(rscon);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Comprador> searchByNameCallableStatement(String nome) {
        String sql = "CALL `agencia`.`SP_getCompradorPorNome`(?)";
        Connection conexao = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            CallableStatement cs = conexao.prepareCall(sql);
            cs.setString(1, "%" + nome + "%");
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
            ConexaoFactory.close(conexao, cs, rs);
            return compradorList;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void selecionarMetaData() {
        String sql = "select * from tbl_comprador";
        Connection conexao = ConexaoFactory.getConexao();
        try {
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData metaData = rs.getMetaData();
            rs.next();

            int columnCount = metaData.getColumnCount();
            System.out.println("Quantidade de colunas: " + columnCount);
            for (int i = 1; i <= columnCount; i++) {
                System.out.println("Tabela:" + metaData.getTableName(i));
                System.out.println("Nome coluna: " + metaData.getColumnName(i));
                System.out.println("Tamanho coluna: " + metaData.getColumnDisplaySize(i));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void checkDriverStatus() {
        Connection conexao = ConexaoFactory.getConexao();
        try {
            final DatabaseMetaData dbmd = conexao.getMetaData();
            if (dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                System.out.println("Suporta TYPE_FORWARD_ONLY");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println("e também suporta CONCUR_UPDATABLE");
                }
            }
            if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                System.out.println("Suporta TYPE_SCROLL_INSENSITIVE");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println("e também suporta CONCUR_UPDATABLE");
                }
            }
            if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                System.out.println("Suporta TYPE_SCROLL_SENSITIVE");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println("e também suporta CONCUR_UPDATABLE");
                }
            }
            ConexaoFactory.close(conexao);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void typeScrollTest() {
        String sql = "select * from tbl_comprador";
        Connection conexao = ConexaoFactory.getConexao();
        try {
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs.last()) {
                System.out.println("ultima linha: " + new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
                System.out.println("numero da ultima linha:" + rs.getRow());
            }
            System.out.println("Retornou a primeira linha:" + rs.first());
            System.out.println("Numero da primeira linha:" + rs.getRow());
            rs.absolute(2);
            System.out.println("linha 2: " + new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            System.out.println();
            System.out.println("--------------------");
            rs.relative(-1);
            System.out.println("linha 1: " + new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateNomesToUpperCase() {
        String sql = "select * from tbl_comprador";
        Connection conexao = ConexaoFactory.getConexao();
        try {
            DatabaseMetaData dbmd = conexao.getMetaData();
            Statement stm = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stm.executeQuery(sql);
            System.out.println(dbmd.updatesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println(dbmd.insertsAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println(dbmd.deletesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            /*while (rs.next()) {
                rs.updateString("nome", rs.getString("nome").toUpperCase());
                rs.updateRow();
            }
            rs.beforeFirst();
            while (rs.next()) {
                System.out.println(rs.getString("nome"));
            }*/
            if (rs.next()) {
                rs.updateString("nome", rs.getString("nome").toUpperCase());
                rs.updateRow();
            }
            rs.absolute(3);
            String nome = rs.getString("nome");
            rs.moveToInsertRow();
            rs.updateString("nome", rs.getString("nome"));
            rs.updateString("cpf", "999.999.999-99");
            rs.insertRow();
            rs.moveToCurrentRow();
            System.out.println(rs.getString("nome") + "row " + rs.getRow());
            rs.absolute(4);
            ConexaoFactory.close(conexao);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
