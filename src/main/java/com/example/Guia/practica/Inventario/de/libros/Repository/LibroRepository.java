package com.example.Guia.practica.Inventario.de.libros.Repository;
import com.example.Guia.practica.Inventario.de.libros.Model.Libro;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;

@Repository
public class LibroRepository {

    private final List<Libro> listaLibros= new ArrayList<>();

    public List<Libro> getlistaLibros() {
        return listaLibros;
    }
    public Libro buscarPorId(int id) {
        for  (Libro libro : listaLibros) {
            if(libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }
    public Libro buscarPorIsbn(String isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }
    public Libro guardar(Libro libro) {
        listaLibros.add(libro);
        return libro;
    }
    public Libro actualizar(Libro libro) {
        int id= 0;
        int idPosicion= 0;
        for (int i=0; i< listaLibros.size(); i++){
            if (getlistaLibros().get(i).getId()== libro.getId()){
                id= libro.getId();
                idPosicion=i;
            }
        }
        Libro libro1 = new Libro();
        libro1.setId(id);
        libro1.setTitulo(libro.getTitulo());
        libro1.setAutor(libro.getAutor());
        libro1.setFec_publicacion(libro.getFec_publicacion());
        libro1.setEditoral(libro.getEditoral());
        libro1.setIsbn(libro.getIsbn());

        listaLibros.set(idPosicion, libro1 );
        return libro1 ;
    }
    public void delete(int id) {
        Libro libro= buscarPorId(id);
        if(libro!=null){
            listaLibros.remove(libro);
        }
    }

}
