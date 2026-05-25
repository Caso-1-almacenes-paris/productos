package cl.paris.Producto.model;

import jakarta.persistence.*;
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
    private int id;

    @Column(name = "TIPO", nullable = false, length =50)
    private String tipó;

    @Column( name = "PRECIO", nullable = false, length =10)
    private int precio;

    @Column( name = "ESTADO", nullable = false, length =10)
    private String estado;

}
