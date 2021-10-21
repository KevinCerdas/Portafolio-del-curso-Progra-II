package Test.Servicios;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import Entidades.Libro;
import Servicios.Libreria;

public class LibreriaTest {
    @Test
    public void testPrestarLibroQueNoSeHaPrestado() {
        Libro miLibro = new Libro("Moby Dick", "Hnernan Melville");
        Libreria miLibreria = new Libreria();
        try {
            miLibreria.prestar(miLibro);
            assertTrue(true);
        } catch (Exception ex) {
            fail();
        }
    }

    @Test
    public void testPrestar() {
        Libro miLibro = new Libro("Moby Dick", "Hnernan Melville");
        miLibro.setPrestado(true);
        Libreria miLibreria = new Libreria();
        try {
            miLibreria.prestar(miLibro);
            fail();
        } catch (Exception ex) {
            assertTrue(true);
        }
    }

    @Test
    public void testDevolver() {
        Libro miLibro = new Libro("Moby Dick", "Hnernan Melville");
        Libreria miLibreria = new Libreria();
        try {
            miLibreria.devolver(miLibro);
            fail();
        } catch (Exception ex) {
            assertTrue(true);
        }
    }
}
