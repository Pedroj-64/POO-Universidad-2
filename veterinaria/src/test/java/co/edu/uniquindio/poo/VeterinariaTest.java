/**
 * Clase para probar el funcionamiento del código del problema de la veterinaria
 * @author Área de programación UQ
 * @since 2024-03
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());

    /**
     * Prueba para verificar que los datos de un estudiante estén completos
     */
    @Test
    public void datosCompletos() {
        LOG.info("Inicio prueba de datos completos de la veterinaria");

        var veterinaria = new Veterinaria("Amigos Peludos");

        assertEquals("Amigos Peludos", veterinaria.getNombre());

        LOG.info("Finalización de la prueba de datos completos de la veterinaria");
    }

    /**
     * Prueba para verificar que se agregue un estudiante
     */
    @Test
    public void agregarMascota() {
        LOG.info("Inicio de la prueba de agregar una mascota atendida");

        var veterinaria = new Veterinaria("Amigos Peludos");
        var mascota = new Mascota("Mateo", "Callejero", "canino", (byte)0, "Masculino", "Amarillo & blanco", "340", 27.8);

        veterinaria.registrarMascota(mascota);

        assertTrue(veterinaria.getMascotas().contains(mascota));
        assertEquals(1, veterinaria.getMascotas().size());

        LOG.info("Finalización de la prueba de agregar una mascota atendida");
    }

    /**
     * Prueba para verificar que los datos de una veterinaria nulos
     */
    @Test
    public void VeterinariaNula() {
        LOG.info("Inicio de prueba  de datos nulos");

        assertThrows(Throwable.class, () -> new Veterinaria(null));

        LOG.info("Finalización de prueba  de datos nulos");
    }

    /**
     * Prueba para verificar que no existan mascotas con ID repetida
     */
    @Test
    public void agregarEstudianteRepetido() {
        LOG.info("Inicio de la prueba de agregar mascotas repetidas");

        var veterinaria = new Veterinaria("Amigos Peludos");

        var mascota_1 = new Mascota("Aquiles", "Gran danes aleman", "Masculino", (byte)6, "Masculino", "Blanco", "89", 26.9);
        var mascota_2 = new Mascota("Lenin", "Gato montes", "Felino", (byte)2, "Femenino", "Amarillo", "89", 10.5);

        veterinaria.registrarMascota(mascota_1);

        assertThrows(Throwable.class, () -> veterinaria.registrarMascota(mascota_2));

        LOG.info("Finalización de la prueba de agregar mascotas repetidas");
    }

   
}