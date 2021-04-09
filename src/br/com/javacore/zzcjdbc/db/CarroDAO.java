package br.com.javacore.zzcjdbc.db;

import br.com.javacore.zzcjdbc.classes.Carro;
import br.com.javacore.zzcjdbc.classes.Comprador;
import br.com.javacore.zzcjdbc.conn.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarroDAO {

    public static void save(Carro carro) {
        String sql = "INSERT INTO tbl_carro(placa, marca, modelo, id_comprador) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, carro.getPlaca());
            pstm.setString(2, carro.getMarca());
            pstm.setString(3, carro.getModelo());
            pstm.setInt(4, carro.getComprador().getId());
            pstm.executeUpdate();
            System.out.println("Dados inseridos com sucesso!");

        } catch (SQLException e) {

        }
    }

    public static void delete(Carro carro) {
        String sql = "DELETE FROM tbl_carro WHERE id = ?";
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setInt(1, carro.getId());
            pstm.executeUpdate();
            System.out.println("Dados deletados com suceaao.");
        } catch (SQLException e) {

        }
    }

    public static void update(Carro carro) {
        String sql = "UPDATE tbl_carro SET placa = ?, marca = ?, modelo = ? where id = ?";
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, carro.getPlaca());
            pstm.setString(2, carro.getMarca());
            pstm.setString(3, carro.getModelo());
            pstm.setInt(4, carro.getId());
            pstm.executeUpdate();
            System.out.println("Dados atualizados com sucesso!");
        } catch (SQLException e) {

        }
    }

    public static List<Carro> selectAll() {
        String sql = "SELECT * FROM tbl_carro";
        List<Carro> carroList = new ArrayList<>();
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement pstm = conn.prepareStatement(sql);
             ResultSet rs = pstm.executeQuery()) {
            while (rs.next()) {
                Comprador comprador = CompradorDAO.selectById(rs.getInt("id_comprador"));
                carroList.add(
                        new Carro(
                                rs.getInt(1),
                                rs.getString(2),
                                rs.getString(3),
                                rs.getString(4), comprador));
            }
            return carroList;
        } catch (SQLException e) {

        }
        return null;
    }

    public static List<Carro> selectByName(String marca) {
        String sql = "SELECT * FROM tbl_carro WHERE marca like ?";
        List<Carro> carroList = new ArrayList<>();
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, "%" + marca + "%");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Comprador comprador = CompradorDAO.selectById(rs.getInt("id_comprador"));
                carroList.add(
                        new Carro(
                                rs.getInt(1),
                                rs.getString(2),
                                rs.getString(3),
                                rs.getString(4), comprador));
            }
            return carroList;

        } catch (SQLException e) {

        }
        return null;
    }
}
