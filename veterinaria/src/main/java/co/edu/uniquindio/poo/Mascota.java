/*
 * Clase tipo record para guardar informacion de la mascota atendida por la veterinaria
 */
package co.edu.uniquindio.poo;

public record Mascota(String nombre,String raza,String especie,byte edad,String genero,String color,String id ,double peso) {

 public Mascota{

    assert nombre != null && !nombre.isBlank() : "El nombre debe ser diferente de null";
    assert raza != null && !raza.isBlank() : "La raza no puede ser null" ;
    assert especie!= null && !especie.isBlank(): "La especie no puede null" ;
    assert genero!= null && !genero.isBlank() : "El genero no puede ser null";
    assert id !=null && !id.isBlank(): "El id no puede ser invalido";
    assert peso > 0;

 }

}


