
package tarea.pkg1_rodrigovasquez;

import java.util.Date;

public class Vehiculo {
    String marca; 
    String modelo;
    Date fechaCreacion;
    Date fechaVenta;
    String color; 

    public Vehiculo(String marca, String modelo, Date fechaCreacion, Date fechaVenta, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCreacion = fechaCreacion;
        this.fechaVenta = fechaVenta;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo" + "\nMarca: " + marca + "\nModelo: " + modelo + "\nFecha de Creacion: " + fechaCreacion + "\nFecha de Venta: " + fechaVenta + "\nColor: " + color;
    }
    
    
}
