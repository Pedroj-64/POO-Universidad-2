package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Curso  {

    private final String nombre;
    private final Collection<Estudiante> listaEstudiantes;
    
    public Curso(String nombre){
        this.nombre = nombre;
        this.listaEstudiantes = new LinkedList<Estudiante>();
    }

    /*
     * 
     *     public void setNombre(String nombre){
        this.nombre = nombre;
        }
     * 
     */

    public String getNombre(){
        return nombre;
    }
    
    public Collection<Estudiante> getListaEstudiantes(){
        return Collections.unmodifiableCollection(listaEstudiantes);
    }
    
}
