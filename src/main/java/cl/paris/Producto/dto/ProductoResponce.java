package cl.paris.Producto.dto;

public record ProductoResponce(

    Long id,
    Long idprovedor,
    String nombre,
    int precio,
    int stock,
    String descripcion,
    String categoria
) {}
