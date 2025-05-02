package com.example.Guia.practica.Inventario.de.libros.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Libro {
    private int id;
    private String isbn;
    private String titulo;
    private String autor;
    private String editoral;
    private int fec_publicacion;
}
