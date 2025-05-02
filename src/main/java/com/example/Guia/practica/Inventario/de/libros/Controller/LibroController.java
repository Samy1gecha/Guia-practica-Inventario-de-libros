package com.example.Guia.practica.Inventario.de.libros.Controller;
import com.example.Guia.practica.Inventario.de.libros.Model.Libro;
import com.example.Guia.practica.Inventario.de.libros.Service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {
    @Autowired
    private LibroService libroService;
    @GetMapping
    public List<Libro> listarLibros(){
        return libroService.getLibros();
    }
    @PostMapping
    public Libro agregarLibro(@RequestBody Libro libro){
        return libroService.saveLibro(libro);
    }
    @PutMapping
    public Libro actualizarLibro(@RequestBody Libro libro){
        return libroService.updateLibro(libro);
    }
    @DeleteMapping
    public String eliminarLibro(@PathVariable int id){
        return libroService.deleteLibro(id);
    }
}
