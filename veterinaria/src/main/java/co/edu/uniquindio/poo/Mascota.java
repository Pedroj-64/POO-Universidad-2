/*
 * Clase tipo record para guardar informacion de la mascota atendida por la veterinaria
 */
package co.edu.uniquindio.poo;

public record Mascota(String nombre,String raza,String especie,byte edad,String genero,String color, String id , double peso) {

 public Mascota{

    assert !nombre.isBlank();
    assert !raza.isBlank() ;
    assert !especie.isBlank() ;
    assert !genero.isBlank() ;
    assert peso > 0.0;

 }
}

