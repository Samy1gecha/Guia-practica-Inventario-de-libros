package com.example.Guia.practica.Inventario.de.libros.Service;
import com.example.Guia.practica.Inventario.de.libros.Model.Libro;
import com.example.Guia.practica.Inventario.de.libros.Repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;
    public List<Libro> getLibros(){
        return libroRepository.getlistaLibros();
    }
    public Libro saveLibro(Libro libro){
        return libroRepository.guardar(libro);
    }
    public Libro getLibro(int id){
        return libroRepository.buscarPorId(id);
    }
    public Libro updateLibro(Libro libro){
        return libroRepository.actualizar(libro);
    }
    public String deleteLibro(int id){
        libroRepository.buscarPorId(id);
        return "Producto Eliminado";
    }
}
