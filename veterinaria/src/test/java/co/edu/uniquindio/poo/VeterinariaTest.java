/**
 * Clase para probar el funcionamiento del código de la veterinaria
 * @author Área de programación UQ
 * @since 2024-02
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());

    /**
     * Primera prueba con datos completos
     */
    @Test
    public void VeterinariaTestDatosCompletos() {
        LOG.info("Iniciado test Trabajo Veterinaria Con datos completos");
        
        Mascota miMascota = new Mascota("Paco","Canino", "Bulldozer", (byte) 4, "Masculino", "Amarillo con manchas", 24.5);

        System.out.println("Nombre: " + miMascota.nombre());
        System.out.println("Especie: " + miMascota.especie());
        System.out.println("Raza: " + miMascota.raza());
        System.out.println("Edad: " + miMascota.edad());
        System.out.println("Género: " + miMascota.genero());
        System.out.println("Color: " + miMascota.color());
        System.out.println("Peso: " + miMascota.peso() + " kg");
        
        assertNotNull(miMascota);

        LOG.info("Finalizando test Veterinaria con datos completos");
    }
    /*
     * Prueba de datos nulos veterinaria 
     */
    @Test
    public void VeterinariaTestDatosNulos() {
        LOG.info("Iniciado test Trabajo Veterinaria Con datos completos");
        
        Mascota miMascota = new Mascota(null, null, null, 0, null, null, null);
        
        System.out.println("Nombre: " + miMascota.nombre());
        System.out.println("Especie: " + miMascota.especie());
        System.out.println("Raza: " + miMascota.raza());
        System.out.println("Edad: " + miMascota.edad());
        System.out.println("Género: " + miMascota.genero());
        System.out.println("Color: " + miMascota.color());
        System.out.println("Peso: " + miMascota.peso() + " kg");
        
        assertNull(miMascota);
    
        LOG.info("Finalizando test Veterinaria con datos completos");
    }
    /**
     * Primera prueba con datos incompletos
     */
    @Test
    public void VeterinariaTestDatosIncompletos() {
        LOG.info("Iniciado test Trabajo Veterinaria Con datos completos");
        
        Mascota miMascota = new Mascota("","Canino", "Bulldozer", (byte) 4, "", "Amarillo con manchas", 24.5);

        System.out.println("Nombre: " + miMascota.nombre());
        System.out.println("Especie: " + miMascota.especie());
        System.out.println("Raza: " + miMascota.raza());
        System.out.println("Edad: " + miMascota.edad());
        System.out.println("Género: " + miMascota.genero());
        System.out.println("Color: " + miMascota.color());
        System.out.println("Peso: " + miMascota.peso() + " kg");
        
        assertNotNull(miMascota);

        LOG.info("Finalizando test Veterinaria con datos completos");
    }
    /**
     * Primera prueba con datos negativos en numeros
     */
    @Test
    public void VeterinariaTestDatosNegativos() {
        LOG.info("Iniciado test Trabajo Veterinaria Con datos completos");
        
        Mascota miMascota = new Mascota("Paco","Canino", "Bulldozer", (byte) -4, "Masculino", "Amarillo con manchas",  -24.5);

        System.out.println("Nombre: " + miMascota.nombre());
        System.out.println("Especie: " + miMascota.especie());
        System.out.println("Raza: " + miMascota.raza());
        System.out.println("Edad: " + miMascota.edad());
        System.out.println("Género: " + miMascota.genero());
        System.out.println("Color: " + miMascota.color());
        System.out.println("Peso: " + miMascota.peso() + " kg");
        
        assertNotNull(miMascota);
        assert miMascota.edad() >= 0 : "los valores de edad no pueden ser negativos";
        assert miMascota.peso() >= 0:  "los valores de peso no pueden ser negativos";

        LOG.info("Finalizando test Veterinaria con datos completos");
    }
}
