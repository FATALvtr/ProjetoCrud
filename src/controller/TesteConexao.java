package controller;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import dao.UsuarioDao;
import model.UsuarioModel;

public class TesteConexao {
    public static void main(String[] args) {
     Connection connection = new ConnectionMySql().getConnection();
     
        JOptionPane.showMessageDialog(null, "Conexão Estabelecida!");
        
        //TESTEEE
        UsuarioModel u1 = new UsuarioModel();
        UsuarioDao ud = new UsuarioDao(connection);
        
        u1.setNome("Felizberto");
        u1.setCpf("333.444.555-66");
        u1.setEmail("infeliz@hotmail.com");
        u1.setTelefone("(34)94445454545");
        u1.setNascimento(Date.valueOf("2026-08-06"));
        ud.adicionar(u1);
    }   
    
}