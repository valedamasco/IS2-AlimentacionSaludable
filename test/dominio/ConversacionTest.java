package dominio;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConversacionTest {


    @Test
    public void testGetSetsNullUsuario() {
        Persona usuario = new Persona();
        Persona profesional = new Persona();
        ArrayList listaMensajes = new ArrayList();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        Persona usuarioEsperado = new Usuario();
        boolean usuarioAreEquals = usuarioEsperado.equals(conversacionATestear.getUsuario());
        assertTrue(usuarioAreEquals);
    }

    @Test
    public void testGetSetsNullProfesional() {
        Persona usuario = new Persona();
        Persona profesional = new Persona();
        ArrayList listaMensajes = new ArrayList();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        Persona profesionalEsperado = new Persona();
        boolean usuarioAreEquals = profesionalEsperado.equals(conversacionATestear.getProfesional());
        assertTrue(usuarioAreEquals);
    }

    @Test
    public void testGetSetsNullLsitaMensajes() {
        Persona usuario = new Persona();
        Persona profesional = new Persona();
        ArrayList listaMensajes = new ArrayList();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.getListaMensajes().size(), 0);
    }

    @Test
    public void testGetSetsNullToString() {
        Persona usuario = new Persona();
        Persona profesional = new Persona();
        ArrayList listaMensajes = new ArrayList();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.toString(), "No hay mensajes para mostrar");
    }


    @Test
    public void testGetSetsDatosVaciosProfesional() {
        Persona usuario = new Usuario();
        Persona profesional = new Profesional(null, null, null, null, null, null, null);
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        Persona profesionalEsperado = new Profesional(null, null, null, null, null, null, null);
        assertEquals(conversacionATestear.getProfesional(), profesionalEsperado);
    }

    @Test
    public void testGetSetsDatosVaciosListaMensajes() {
        Persona usuario = new Usuario(null, null, null, null, null, null, null, null);
        Persona profesional = new Profesional(null, null, null, null, null, null, null);
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.getListaMensajes().size(), 0);
    }

    @Test
    public void testGetSetsDatosVaciosToString() {
        Persona usuario = new Usuario(null, null, null, null, null, null, null, null);
        Persona profesional = new Profesional(null, null, null, null, null, null, null);
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.toString(), "No hay mensajes para mostrar");
    }


}
