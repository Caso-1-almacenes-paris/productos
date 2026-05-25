package cl.paris.Producto.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.paris.Producto.model.Producto;
import cl.paris.Producto.Repository.ReProducto;

@Service
public class RecService {
    @Autowired
    private ReProducto reProducto;
    public RecService(ReProducto reProducto){
        this.reProducto = reProducto;
         }
        public List<Producto> getAllProducto() {
            return reProducto.findAll();
        }

        public void serById(Producto producto) {
            reProducto.save(producto);
        }
    
}
