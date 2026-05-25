package cl.paris.Producto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.paris.Producto.model.Producto;

@Repository
public interface ReProducto extends JpaRepository<Producto, Integer> {

}
