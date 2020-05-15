package dominio;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class ConversacionTest {
    
    Persona personaUsuario;
    Persona personaProfesional;
    
    @Before
    public void setUp() throws Exception {
        personaUsuario = new Persona();
        personaProfesional = new Persona();
    }


    @Test
    public void testGetSetsNullUsuario() {
        ArrayList listaMensajes = new ArrayList();
        Conversacion conversacionATestear = new Conversacion(this.personaUsuario, this.personaProfesional, listaMensajes);
        Persona usuarioEsperado = new Usuario(this.personaUsuario);
        boolean usuarioAreEquals = usuarioEsperado.equals(conversacionATestear.getUsuario());
        assertTrue(usuarioAreEquals);
    }

    @Test
    public void testGetSetsNullProfesional() {
        ArrayList listaMensajes = new ArrayList();
        Conversacion conversacionATestear = new Conversacion(this.personaUsuario, this.personaProfesional, listaMensajes);
        Persona profesionalEsperado = new Profesional(this.personaProfesional);
        boolean usuarioAreEquals = profesionalEsperado.equals(conversacionATestear.getProfesional());
        assertTrue(usuarioAreEquals);
    }

    @Test
    public void testGetSetsNullLsitaMensajes() {
        ArrayList listaMensajes = new ArrayList();
        Conversacion conversacionATestear = new Conversacion(this.personaUsuario, this.personaProfesional, listaMensajes);
        assertEquals(conversacionATestear.getListaMensajes().size(), 0);
    }

    @Test
    public void testGetSetsNullToString() {
        ArrayList listaMensajes = new ArrayList();
        Conversacion conversacionATestear = new Conversacion(this.personaUsuario, this.personaProfesional, listaMensajes);
        assertEquals(conversacionATestear.toString(), "No hay mensajes para mostrar");
    }


    @Test
    public void testGetSetsDatosVaciosProfesional() {
        Persona usuario = new Usuario(this.personaUsuario);
        Persona profesional = new Profesional(this.personaProfesional);
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.getProfesional(), profesional);
    }

    @Test
    public void testGetSetsDatosVaciosListaMensajes() {
        Persona usuario = new Usuario(this.personaUsuario);
        Persona profesional = new Profesional(this.personaProfesional);
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.getListaMensajes().size(), 0);
    }

    @Test
    public void testGetSetsDatosVaciosToString() {
        Persona usuario = new Usuario(this.personaUsuario);
        Persona profesional = new Profesional(this.personaProfesional);
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.toString(), "No hay mensajes para mostrar");
    }


}
