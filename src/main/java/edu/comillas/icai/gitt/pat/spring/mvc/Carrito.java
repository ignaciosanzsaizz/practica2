package edu.comillas.icai.gitt.pat.spring.mvc;

public record Carrito(
        Long idCarrito,
        String idArticulo,
        String descripcion,
        Integer numeroUnidades,
        Double precioFinal
) {
    public Carrito conID(Long nuevoId) {
        return new Carrito(nuevoId, idArticulo, descripcion, numeroUnidades, precioFinal);
    }

}