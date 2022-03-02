/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.mycompany.hotel.commons.domain;

import java.util.ArrayList;



/**
 *
 * @author Kevin Morales
 */
public class Habitacion {
    private int id;
    private String descripcion;
    private int precio;
    private String foto;
    private boolean reserva;
    private TipoHabitacion tipo;
    ArrayList<DiaSemana> dias;

    public ArrayList<DiaSemana> getDias() {
        return dias;
    }

    public void setDias(ArrayList<DiaSemana> dias) {
        this.dias = dias;
    }
    
    public Habitacion(){}

    public Habitacion(int id, String descripcion, int precio, TipoHabitacion tipo) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipo = tipo;
    }

    public Habitacion(int id, String descripcion, int precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }

    public boolean isReserva() {
        return reserva;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    } 

    @Override
    public String toString() {
        return "Habitacion{" + "id=" + id + ", descripcion=" + descripcion + ", precio=" + precio + ", foto=" + foto + ", reserva=" + reserva + ", tipo=" + tipo + ", dias=" + dias + '}';
    }


    
    
}
