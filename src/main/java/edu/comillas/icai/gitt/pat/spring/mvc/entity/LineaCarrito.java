package edu.comillas.icai.gitt.pat.spring.mvc.entity;

import jakarta.persistence.*;

@Entity
public class LineaCarrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) public Long idCarrito;

    @Column(nullable = false, unique = true) public Long idArticulo;

    @Column(nullable = false) public Long precioUnitario;

    @Column(nullable = false, unique = true) public int unidades;

    @Column(nullable = false) public Long costeLinea;

    public Long getIdCarrito() {
        return this.idCarrito;
    }

    public Long getArticulo() {
        return this.idArticulo;
    }

    public void setArticulo(Long idArticulo) {
        this.idArticulo = idArticulo;
    }
}
