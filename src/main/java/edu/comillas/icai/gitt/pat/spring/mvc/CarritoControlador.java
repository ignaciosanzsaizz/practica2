package edu.comillas.icai.gitt.pat.spring.mvc;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/api/carrito")
public class CarritoControlador {

    // Creamos un HashMap cuya clave es el id del carrito y el valor es el objeto Carrito
    private final Map<Long, Carrito> carritos = new ConcurrentHashMap<>();

    // CREATE
    @PostMapping("/api/carrito")
    @ResponseStatus(HttpStatus.CREATED)
    public Carrito crea(@RequestBody Carrito carritoNuevo) {
        if (carritos.containsKey(carritoNuevo.idCarrito())) {
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
        carritos.put(carritoNuevo.idCarrito(), carritoNuevo);
        return carritoNuevo;
    }

    // READ
    @GetMapping("/api/carrito/{idCarrito}")
    public Carrito buscar(@PathVariable long idCarrito) {
        Carrito carrito = carritos.get(idCarrito);
        if (carrito == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return carrito;
    }

    // READ
    @GetMapping("/api/carrito")
    public Collection<Carrito> listar() {
        return carritos.values();
    }

    // UPDATE
    @PutMapping("/api/carrito/{idCarrito}")
    public Carrito actualiza(@PathVariable long idCarrito, @RequestBody Carrito carritoActualizado) {
        if (!carritos.containsKey(idCarrito)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        if (carritoActualizado.idCarrito() != idCarrito) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        carritos.put(idCarrito, carritoActualizado);
        return carritoActualizado;
    }

    // DELETE
    @DeleteMapping("/api/carrito/{idCarrito}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void borra(@PathVariable long idCarrito) {
        if (carritos.remove(idCarrito) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
