package cl.paris.Producto.mapper;

import cl.paris.Producto.dto.RequestProducto;
import cl.paris.Producto.model.Producto;

public class ProductoMapper {
    public static Producto toProducto(RequestProducto request) {
        Producto producto = new Producto();
        producto.setNombre(request.nombre());
        producto.setPrecio(request.precio());
        producto.setStock(request.stock());
        producto.setDescripcion(request.descripcion());
        return producto;
    }

}
