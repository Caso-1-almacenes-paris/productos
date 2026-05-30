package cl.paris.Producto.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.paris.Producto.Repository.ReProducto;
import cl.paris.Producto.model.Producto;

@Service
public class RecService {
    @Autowired
    private ReProducto reProducto;

    public List<Producto> getAllProducto() {
        return reProducto.findAll();
    }

    public void serById(Producto producto) {
        reProducto.save(producto);
    }
    
}