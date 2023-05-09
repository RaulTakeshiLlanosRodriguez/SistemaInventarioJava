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
import modelo.Mueble;

/**
 *
 * @author USER
 */
public class Ctrl_Mueble {
    //metodo para registrar equipo
    public boolean guardar(Mueble e){
        boolean respuesta = false;
        Connection conexion = Conexion.conectar();
        try {
            PreparedStatement consulta = conexion.prepareStatement("insert into muebles values(?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setInt(2, e.getNrOrden());
            consulta.setString(3, e.getCodPatrimonial());
            consulta.setString(4, e.getTipo());
            consulta.setString(5, e.getUnidadMedida());
            consulta.setString(6, e.getEstado());
            consulta.setString(7, e.getProcedencia());
            consulta.setString(8, e.getUbicacion());
            consulta.setString(9, e.getObservacion());
            
            if(consulta.executeUpdate()>0){
                respuesta = true;
            }
            conexion.close();
        } catch (SQLException error) {
            System.out.println("Error al guardar mueble: "+error);
        }
        return respuesta;
    }
    
    public boolean actualizar(Mueble e, int idMueble){
        boolean respuesta = false;
        Connection conexion = Conexion.conectar();
        try {
            PreparedStatement consulta = conexion.prepareStatement("update muebles set nrOrden=?,CodigoPatrimonial=?,tipo=?,unidadMedida=?,estado=?,procedencia = ?,ubicacion=?,observacion=? where idMueble='"+idMueble+"'");
            consulta.setInt(1, e.getNrOrden());
            consulta.setString(2, e.getCodPatrimonial());
            consulta.setString(3, e.getTipo());
            consulta.setString(4, e.getUnidadMedida());
            consulta.setString(5, e.getEstado());
            consulta.setString(6, e.getProcedencia());
            consulta.setString(7, e.getUbicacion());
            consulta.setString(8, e.getObservacion());
            
            if(consulta.executeUpdate()>0){
                respuesta = true;
            }
            conexion.close();
        } catch (SQLException error) {
            System.out.println("Error al actualizar mueble: "+error);
        }
        return respuesta;
    }
    
    public boolean eliminar(int idMueble){
        boolean respuesta = false;
        Connection conexion = Conexion.conectar();
        try {
            PreparedStatement consulta = conexion.prepareStatement("delete from muebles where idMueble= '"+idMueble+"'");
            consulta.executeUpdate();
            if(consulta.executeUpdate()>0){
                respuesta = true;
            }
            conexion.close();
        } catch (SQLException error) {
            System.out.println("Error al eliminar mueble: "+error);
        }
        return respuesta;
    }
}
