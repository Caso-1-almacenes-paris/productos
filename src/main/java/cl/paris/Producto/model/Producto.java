package cl.paris.Producto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table (name = "Productos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "ID_PROVEEDOR")
    private long idprovedor;

    @Column(name = "NOMBRE", nullable = false, length =50)
    private String nombre;

    @Column( name = "PRECIO", nullable = false, length =10)
    private int precio;

     @Column( name = "STOCK", nullable = false, length =10)
    private int stock;

    @Column( name = "DESCRIPCION", nullable = false, length =100)
    private String descripcion;

    @Column( name = "CATEGORIA", nullable = false, length =10)
    private String categoria;
    
   
}
