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
public class Mueble {
        private int idMueble;
    private int nrOrden;
    private String codPatrimonial;
    private String tipo;
    private String unidadMedida;
    private String estado;
    private String procedencia;
    private String ubicacion;
    private String observacion;
    
    public Mueble(){
        this.idMueble = 0;
        this.nrOrden = 0;
        this.codPatrimonial = "";
        this.tipo = "";
        this.unidadMedida = "";
        this.estado = "";
        this.procedencia = "";
        this.ubicacion = "";
        this.observacion = "";
    }

    public int getIdMueble() {
        return idMueble;
    }

    public void setIdMueble(int idMueble) {
        this.idMueble = idMueble;
    }

    public int getNrOrden() {
        return nrOrden;
    }

    public void setNrOrden(int nrOrden) {
        this.nrOrden = nrOrden;
    }

    public String getCodPatrimonial() {
        return codPatrimonial;
    }

    public void setCodPatrimonial(String codPatrimonial) {
        this.codPatrimonial = codPatrimonial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
}
