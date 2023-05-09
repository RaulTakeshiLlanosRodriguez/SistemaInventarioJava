/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author USER
 */
public class Equipo {

    private int idEquipo;
    private int nroOrden;
    private String codPatrimonial;
    private String ubicacion;
    private String tipo;
    private String marca;
    private String tipoDescripcion;
    private String numDescripcion;
    
    public Equipo(){
        this.idEquipo = 0;
        this.nroOrden = 0;
        this.codPatrimonial = "";
        this.ubicacion = "";
        this.tipo = "";
        this.marca = "";
        this.tipoDescripcion = "";
        this.numDescripcion = "";
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public int getNroOrden() {
        return nroOrden;
    }

    public void setNroOrden(int nroOrden) {
        this.nroOrden = nroOrden;
    }

    public String getCodPatrimonial() {
        return codPatrimonial;
    }

    public void setCodPatrimonial(String codPatrimonial) {
        this.codPatrimonial = codPatrimonial;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoDescripcion() {
        return tipoDescripcion;
    }

    public void setTipoDescripcion(String tipoDescripcion) {
        this.tipoDescripcion = tipoDescripcion;
    }

    public String getNumDescripcion() {
        return numDescripcion;
    }

    public void setNumDescripcion(String numDescripcion) {
        this.numDescripcion = numDescripcion;
    }
    
    
}
