package cl.paris.Producto.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.paris.Producto.Repository.ProductoRepository;
import cl.paris.Producto.model.Producto;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository reProducto;

    public List<Producto> getAllProducto() {
        return reProducto.findAll();
    }

    public void serById(Producto producto) {
        reProducto.save(producto);
    }

    public Producto getProductoById(Long id) {
        return reProducto.findById(id)
                .orElseThrow(() -> new cl.paris.Producto.Exepcion.ProductoException.ResourceNotFoundException("Producto no encontrado con ID: " + id));
    }
}