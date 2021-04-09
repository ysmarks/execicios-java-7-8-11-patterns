package br.com.javacore.zzcjdbc.db;

import br.com.javacore.zzcjdbc.classes.Comprador;
import br.com.javacore.zzcjdbc.conn.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CompradorDAO {

    public static void save(Comprador comprador) {
        String sql = "insert into tbl_comprador(cpf, nome) values(?, ?) ";
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, comprador.getCpf());
            pstm.setString(2, comprador.getNome());
            pstm.executeUpdate();
            System.out.println("Dados inseridos com sucesso!");
        } catch (SQLException e) {

        }
    }

    public static void delete(Comprador comprador) {
        String sql = "delete from tbl_comprador where id = ?";
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setInt(1, comprador.getId());
            pstm.executeUpdate();
            System.out.println("Dados Deletados com sucesso!");
        } catch (SQLException e) {

        }
    }

    public static void atualizar(Comprador comprador) {
        String sql = "UPDATE tbl_comprador SET cpf = ?, nome = ? where id = ?";
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, comprador.getCpf());
            pstm.setString(2, comprador.getNome());
            pstm.setInt(3, comprador.getId());
            pstm.executeUpdate();
            System.out.println("Dados atualizados com sucesso!");
        } catch (SQLException e) {

        }
    }

    public static List<Comprador> selectAll() {
        String sql = "select * from tbl_comprador";
        List<Comprador> compradorList = new ArrayList<>();
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement pstm = conn.prepareStatement(sql);
             ResultSet rs = pstm.executeQuery()) {
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
            return compradorList;

        } catch (SQLException e) {

        }
        return null;
    }

    public static List<Comprador> selectByName(String name) {
        String sql = "select * from tbl_comprador where nome like ?";
        List<Comprador> compradorList = new ArrayList<>();
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, "%" + name + "%");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }

            return compradorList;

        } catch (SQLException e) {

        }
        return null;
    }

    public static Comprador selectById(Integer id) {
        String sql = "select * from tbl_comprador where id = ?";
        Comprador comprador = null;
        try(Connection conn = ConexaoFactory.getConexao();
            PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()) {
                comprador = new Comprador(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            return comprador;
        } catch (SQLException e) {

        }
        return null;
    }
}

