package cl.paris.Producto.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.paris.Producto.Service.ProductoService;
import cl.paris.Producto.dto.ProductoRequest;
import cl.paris.Producto.mapper.ProductoMapper;
import cl.paris.Producto.model.Producto;

@RestController
@RequestMapping("/api/v1/productos") // Conexión corregida agregando el /v1
public class ProductoController {

        private final ProductoService recService;

        public ProductoController(ProductoService recService) {
            this.recService = recService;
        }

        @GetMapping
        public List<Producto> getAllPrpducto() {
            return this.recService.getAllProducto();
        }
        
        @PostMapping
        public Producto seProducto(@RequestBody ProductoRequest requestProductoproducto) {
            Producto producto = ProductoMapper.toProducto(requestProductoproducto);
            this.recService.serById(producto); // Limpiado por completo el desorden de los System.err
            return producto;
        }

        @GetMapping("/{id}")
        public cl.paris.Producto.dto.ProductoResponce getProductoById(@PathVariable Long id) {
            Producto p = this.recService.getProductoById(id);
            return new cl.paris.Producto.dto.ProductoResponce(
                p.getId(),
                p.getIdprovedor(),
                p.getNombre(),
                p.getPrecio(),
                p.getStock(),
                p.getDescripcion(),
                p.getCategoria()
            );
        }
}