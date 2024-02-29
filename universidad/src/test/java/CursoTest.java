import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.Curso;

public class CursoTest {


    @Test
    public void datosCompletos(){
        Curso curso1 = new Curso("Programacion 1");
        Log.info("Inicio de datosCompletos");


        assertEquals("Programacion 1", curso1.getNombre());

        LOG.info("fin datoaCompleto");

       
    }

     
}
