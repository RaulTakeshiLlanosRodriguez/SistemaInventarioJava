/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Equipo;

/**
 *
 * @author USER
 */
public class Ctrl_Equipo {
    
    public boolean guardar(Equipo e){
        boolean respuesta = false;
        Connection conexion = Conexion.conectar();
        try {
            PreparedStatement consulta = conexion.prepareStatement("insert into equipos values(?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setInt(2, e.getNroOrden());
            consulta.setString(3, e.getCodPatrimonial());
            consulta.setString(4, e.getUbicacion());
            consulta.setString(5, e.getTipo());
            consulta.setString(6, e.getMarca());
            consulta.setString(7, e.getTipoDescripcion());
            consulta.setString(8, e.getNumDescripcion());
            
            if(consulta.executeUpdate()>0){
                respuesta = true;
            }
            conexion.close();
        } catch (SQLException error) {
            System.out.println("Error al guardar equipo: "+error);
        }
        return respuesta;
    }
    
    public boolean actualizar(Equipo e, int idEquipo){
        boolean respuesta = false;
        Connection conexion = Conexion.conectar();
        try {
            PreparedStatement consulta = conexion.prepareStatement("update equipos set nroOrden=?,codPatrimonial=?,ubicacion=?,tipo=?,marca=?,tipoDescripcion=?,numDescripcion=? where idEquipo= '"+idEquipo+"'");
            consulta.setInt(1, e.getNroOrden());
            consulta.setString(2, e.getCodPatrimonial());
            consulta.setString(3, e.getUbicacion());
            consulta.setString(4, e.getTipo());
            consulta.setString(5, e.getMarca());
            consulta.setString(6, e.getTipoDescripcion());
            consulta.setString(7, e.getNumDescripcion());
            
            if(consulta.executeUpdate()>0){
                respuesta = true;
            }
            conexion.close();
        } catch (SQLException error) {
            System.out.println("Error al actualizar equipo: "+error);
        }
        return respuesta;
    }
    
    public boolean eliminar(int idEquipo){
        boolean respuesta = false;
        Connection conexion = Conexion.conectar();
        try {
            PreparedStatement consulta = conexion.prepareStatement("delete from equipos where idEquipo= '"+idEquipo+"'");
            consulta.executeUpdate();
            if(consulta.executeUpdate()>0){
                respuesta = true;
            }
            conexion.close();
        } catch (SQLException error) {
            System.out.println("Error al eliminar equipo: "+error);
        }
        return respuesta;
    }
}
