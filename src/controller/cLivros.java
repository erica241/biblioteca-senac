/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.mysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.mEditoras;


/**
 *
 * @author erica.matos1
 */
public class cLivros {
    public void cadastrar(mEditoras modelE) {
        Connection conn = mysql.conexao();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.prepareStatement("INSERT INTO livros (fk_editoras_id_editora, fk_autores_id_autor, título, descriçao, ano) VALUES (?,?,?,?,?)");
            stmt.setInt(1, modelL.getEditoras().getId_editora());
            stmt.setInt(2, modelL.getAutores().getId_autor());
            stmt.setInt(3, modelL.getTítulo().getId_título());
            stmt.setInt(4, modelL.getDescriçao().getId_descriçao());
            stmt.setInt(5, modelL.getAno().getId_ano());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Editora cadastrada com sucesso!");

        } catch (SQLException ex) {
            Logger.getLogger(cEditoras.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
