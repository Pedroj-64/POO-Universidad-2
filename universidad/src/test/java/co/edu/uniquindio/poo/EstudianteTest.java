/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class EstudianteTest {
    private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());

    @Test
    public void datosCompletos(){
        LOG.info("Inicio de la prueba datos completos");
        Estudiante estudiante = new Estudiante("Carlos","Casas Gomez","234561","314256363","ccasas@gmail.com",(byte)33);
        assertEquals("Carlos", estudiante.nombres());
        assertEquals("Casas Gomez", estudiante.apellidos());
        assertEquals("234561", estudiante.identificacion());
        assertEquals("314256363", estudiante.telefono());
        assertEquals("ccasas@gmail.com", estudiante.correo());
        assertEquals((byte)33, estudiante.edad());
    }
    @Test
    public void datosNulos(){
        LOG.info("Inicio de la prueba datos nulos");
        Estudiante estudiante = new Estudiante(null, null, null, null, null, (byte)0);
        assertEquals(null, estudiante.nombres());
        assertEquals(null, estudiante.apellidos());
        assertEquals(null, estudiante.identificacion());
        assertEquals(null, estudiante.telefono());
        assertEquals(null, estudiante.correo());
        assertEquals((byte)0, estudiante.edad());
    }

  

    
}