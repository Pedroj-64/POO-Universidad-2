package co.edu.uniquindio.poo;

public record Mascota(String nombre,String raza,String especie,byte edad,String genero,String color, double peso) {

 public Mascota{

    assert nombre !=null ;
    assert raza !=null ;
    assert especie !=null ;
    assert genero !=null ;
    assert peso >= 0.0;

 }
}

