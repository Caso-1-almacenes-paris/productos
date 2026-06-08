package cl.paris.Producto.mapper;

import cl.paris.Producto.dto.ProductoRequest;
import cl.paris.Producto.model.Producto;

public class ProductoMapper {
    public static Producto toProducto(ProductoRequest request) {
        Producto producto = new Producto();
        producto.setNombre(request.nombre());
        producto.setPrecio(request.precio());
        producto.setStock(request.stock());
        producto.setDescripcion(request.descripcion());
        producto.setCategoria(request.categoria());
        return producto;
    }

}
