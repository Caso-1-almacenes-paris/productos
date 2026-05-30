package cl.paris.Producto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import cl.paris.Producto.Service.RecService;
import cl.paris.Producto.dto.RequestProducto;
import cl.paris.Producto.mapper.ProductoMapper;
import cl.paris.Producto.model.Producto;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {

        private final RecService recService;

        public ProductoController(RecService recService) {
            this.recService = recService;
        }

        @GetMapping
        public List<Producto> getAllPrpducto() {
            return this.recService.getAllProducto();
        }
        
        @PostMapping
        public Producto seProducto(@RequestBody RequestProducto requestProductoproducto) {
            Producto producto = ProductoMapper.toProducto(requestProductoproducto);
            System.err.println(producto.getId());
            System.err.println(producto.getIdprovedor());
            System.err.println(producto.getNombre());
            System.err.println(producto.getPrecio());
            System.err.println(producto.getStock());
            System.err.println(producto.getDescripcion());
            System.err.println(producto.getCategoria());
            this.recService.serById(producto);
            return producto;
        }
}
