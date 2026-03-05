package edu.comillas.icai.gitt.pat.spring.mvc.repositorio;

import edu.comillas.icai.gitt.pat.spring.mvc.entity.Carrito;
import edu.comillas.icai.gitt.pat.spring.mvc.entity.LineaCarrito;
import org.springframework.data.repository.CrudRepository;

public interface RepoLineaCarrito extends CrudRepository<LineaCarrito, Long> {
    LineaCarrito findByIdCarrito (Long IdCarrito);

}
