/**
 * Clase para probar el funcionamiento del código de la veterinaria
 * @author Área de programación UQ
 * @since 2024-02
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class MascotaTest {
    private static final Logger LOG = Logger.getLogger(MascotaTest.class.getName());

    /**
     * Primera prueba con datos completos
     */
    @Test
    public void VeterinariaTestDatosCompletos() {
        LOG.info("Iniciado test Trabajo Veterinaria Con datos completos");
        
        Mascota Mascota = new Mascota("Paco","Bulldozer", "Canino", (byte) 4, "Masculino", "Amarillo con manchas", "",24.5);

         assertEquals("Paco", Mascota.nombre());
         assertEquals("Bulldozer", Mascota.raza());
         assertEquals("Canino", Mascota.especie());
         assertEquals(4, Mascota.edad());
         assertEquals("Masculino", Mascota.genero());
         assertEquals("Amarillo con manchas", Mascota.color());
         assertEquals(24.5, Mascota.peso());
         
        LOG.info("Finalizando test Veterinaria con datos completos");
    }
    /*
     * Prueba de datos nulos veterinaria 
     */
    @Test
    public void VeterinariaTestDatosNulos() {
        LOG.info("Iniciado test Trabajo Veterinaria Con datos Nulos");
        
       assertThrows(Throwable.class, ()-> new Mascota(null, null, null, (byte) 0, null, null, null,(double) 0));
       
  
        LOG.info("Finalizando test Veterinaria con datos Nulos");
    }
    /**
     * Primera prueba con datos incompletos
     */
    @Test
    public void VeterinariaTestDatosIncompletos() {
        LOG.info("Iniciado test Trabajo Veterinaria Con datos Incompletos");
          
        Mascota Mascota = new Mascota("Paco", "", "Felino", (byte) 4, "", "", "",(double) 24.5);

        assertEquals("Paco", Mascota.nombre());
        assertEquals("Bulldozer", Mascota.raza());
        assertEquals("Felino", Mascota.especie());
        assertEquals(4, Mascota.edad());
        assertEquals("Masculino", Mascota.genero());
        assertEquals("Amarillo con manchas", Mascota.color());
        assertEquals(24.5, Mascota.peso());

        LOG.info("Finalizando test Veterinaria con datos Incompletos");
    }

    /**
     * Primera prueba con datos negativos en numeros
     */

    @Test
    public void VeterinariaTestDatosNegativos() {
        LOG.info("Iniciado test Trabajo Veterinaria Con datos numericos negativos");

        assertThrows(Throwable.class, () -> new Mascota("Paco","Bulldozer", "Canino", (byte) 4, "Masculino", "Amarillo con manchas", "",-24.5));
        
        LOG.info("Finalizando test Veterinaria con datos numericos negativos");
    }
    /*
     * Primera prueba con datos de especies invalidad
     */
    @Test
    public void VeterinariaTestEspeciesInvalidas() {
        LOG.info("Iniciado test Trabajo Veterinaria Con Especies invalidas");

        Mascota Mascota = new Mascota("Paco","Bulldozer", "Leon", (byte) 4, "Masculino", "Amarillo con manchas", "", 24.5);
        
        assertEquals("Canino" , Mascota.especie());
        assertEquals("Felino" , Mascota.especie());

        LOG.info("Finalizando test Veterinaria Con Especies invalidas");
    }
}
