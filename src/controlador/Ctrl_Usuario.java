/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author USER
 */
public class Ctrl_Usuario {

    public boolean loginUser(Usuario u) {
        boolean respuesta = false;

        Connection conexion = Conexion.conectar();
        String sql = "select usuario, password from usuario where usuario = '" + u.getUsuario() + "' and password = '" + u.getPassword() + "'";
        Statement statement;
        try {
            statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión");
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión");
        }
        return respuesta;
    }

    public boolean guardar(Usuario e) {
        boolean respuesta = false;
        Connection conexion = Conexion.conectar();
        try {
            PreparedStatement consulta = conexion.prepareStatement("insert into usuario values(?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, e.getNombre());
            consulta.setString(3, e.getApellido());
            consulta.setString(4, e.getUsuario());
            consulta.setString(5, e.getPassword());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            conexion.close();
        } catch (SQLException error) {
            System.out.println("Error al guardar usuario: " + error);
        }
        return respuesta;
    }

    public boolean actualizar(Usuario e, int idMueble) {
        boolean respuesta = false;
        Connection conexion = Conexion.conectar();
        try {
            PreparedStatement consulta = conexion.prepareStatement("update usuario set nombre=?,apellido=?,usuario=?,password=? where idUsuario='" + idMueble + "'");
            consulta.setString(1, e.getNombre());
            consulta.setString(2, e.getApellido());
            consulta.setString(3, e.getUsuario());
            consulta.setString(4, e.getPassword());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            conexion.close();
        } catch (SQLException error) {
            System.out.println("Error al actualizar usuario: " + error);
        }
        return respuesta;
    }

    public boolean eliminar(int idUsuario) {
        boolean respuesta = false;
        Connection conexion = Conexion.conectar();
        try {
            PreparedStatement consulta = conexion.prepareStatement("delete from usuario where idUsuario= '" + idUsuario + "'");
            consulta.executeUpdate();
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            conexion.close();
        } catch (SQLException error) {
            System.out.println("Error al eliminar usuario: " + error);
        }
        return respuesta;
    }
}
