/*
 * Clase que contiene informacion de la veterinaria para pruebas
 *
 * @author Área de programación UQ
 * @since 2024-03
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 *
 */


package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Veterinaria {
    private final String nombre;
    private final Collection<Mascota> mascotas;


    public Veterinaria(String nombre) {
        assert nombre != null && !nombre.isBlank() : "El nombre de la veterinaria no puede ser nulo";
        this.nombre = nombre; 
        mascotas = new LinkedList<>();
    }

   public String getNombre(){
    return nombre;
   }

   public void registrarMascota(Mascota mascota){
        assert !existeMascotaConID(mascota.id()) : "Ya existe una mascota con el mismo ID";
        mascotas.add(mascota);
   }

   /*
    * Metodo de busqueda de mascota a partir de ID
    * Siendo un ciclo que recorre la lista de mascotas
    */
   public Mascota getMascota(String id) {
    for (Mascota m : mascotas) {
        if (m.id().equals(id)) {
            return m; // Devuelve la mascota si se encuentra el ID
        }
    }
    return null; // Devuelve null si no se encuentra ninguna mascota con el ID dado
    }
    
    /*
    * Metodo privado para validar si existen mascotas del mismo id en la lista
    */
   private boolean existeMascotaConID(String id) {
    for (Mascota m : mascotas) {
        if (m.id().equals(id)) {
            return true;
        }
    }
    return false;
    }
    
    /*
     * Metodo para obtener lista de mascotas atentidas no modificable
     */
    public Collection<Mascota> getMascotas(){
        return Collections.unmodifiableCollection(mascotas);
    }
    /*
     * 
     * Metodo para obtener la lista de  mascotas mayores a 10 años
     */
    public List<Mascota> getMascotasMayoresA10Anios() {
        List<Mascota> mascotasMayoresA10 = new ArrayList<>();

        for (Mascota mascota : mascotas) {
            if (mascota.edad() > 10) {
                mascotasMayoresA10.add(mascota);
            }
        }

        return mascotasMayoresA10;
    }
}

