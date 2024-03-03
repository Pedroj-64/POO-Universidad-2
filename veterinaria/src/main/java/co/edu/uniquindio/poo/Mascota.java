/*
 * Clase tipo record para guardar informacion de la mascota atendida por la veterinaria
 * @author Área de programación UQ
 * @since 2024-03
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 *
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


