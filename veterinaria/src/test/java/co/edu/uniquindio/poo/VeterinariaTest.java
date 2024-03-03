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

import java.util.List;
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
    public void agregarMascotaRepetido() {
        LOG.info("Inicio de la prueba de agregar mascotas repetidas");

        var veterinaria = new Veterinaria("Amigos Peludos");

        var mascota_1 = new Mascota("Aquiles", "Gran danes aleman", "Masculino", (byte)6, "Masculino", "Blanco", "89", 26.9);
        var mascota_2 = new Mascota("Lenin", "Gato montes", "Felino", (byte)2, "Femenino", "Amarillo", "89", 10.5);

        veterinaria.registrarMascota(mascota_1);

        assertThrows(Throwable.class, () -> veterinaria.registrarMascota(mascota_2));

        LOG.info("Finalización de la prueba de agregar mascotas repetidas");
    }

    @Test
    public void obtenerMascotasMayoresA10Anios() {
        LOG.info("Inicio de la prueba para obtener mascotas mayores a 10 años");

        var  veterinaria = new Veterinaria("Amigos Peludos");
        var  mascota_1 = new Mascota("Aquiles", "Gran danes aleman", "Canino", (byte) 6, "Masculino", "Blanco", "89", 26.9);
        var  mascota_2 = new Mascota("Lenin", "Gato montes", "Felino", (byte) 12, "Femenino", "Amarillo", "90", 10.5);
        var  mascota_3 = new Mascota("Firulais", "Pastor alemán", "Canino", (byte) 11, "Masculino", "Negro", "91", 15.2);

        // Agregar las mascotas a la veterinaria
        veterinaria.registrarMascota(mascota_1);
        veterinaria.registrarMascota(mascota_2);
        veterinaria.registrarMascota(mascota_3);

        // Obtener la lista de mascotas mayores a 10 años
        List<Mascota> mascotasMayoresA10 = veterinaria.getMascotasMayoresA10Anios();

        // Verificar que la lista contiene las mascotas correctas
        assertEquals(2, mascotasMayoresA10.size()); // Debería haber 2 mascotas mayores a 10 años

        LOG.info("Finalización de la prueba para obtener mascotas mayores a 10 años");
    }
}
   
