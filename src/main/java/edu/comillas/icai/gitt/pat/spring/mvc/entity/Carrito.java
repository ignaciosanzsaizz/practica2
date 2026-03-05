package edu.comillas.icai.gitt.pat.spring.mvc.entity;

import jakarta.persistence.*;

@Entity
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) public Long idCarrito;

    @Column (nullable = false, unique = true)public Long idUsuario;
    
    @Column(nullable = false, unique = true) public String correo;

    @Column(nullable = false) public Long precioTotal;

    public Long getIdCarrito() {
        return this.idCarrito;
    }

    public Long getUsuario() {
        return this.idUsuario;
    }

    public String getCorreo() {
        return this.correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Long getPrecioTotal() {
        return this.precioTotal;
    }
    public void setPrecioTotal(Long precio_total) {
        this.precioTotal = precio_total;
    }
}
