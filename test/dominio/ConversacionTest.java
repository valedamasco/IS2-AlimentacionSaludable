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
        boolean usuarioAreEquals = this.personaUsuario.equals(conversacionATestear.getUsuario());
        assertTrue(usuarioAreEquals);
    }

    @Test
    public void testGetSetsNullProfesional() {
        ArrayList listaMensajes = new ArrayList();
        Conversacion conversacionATestear = new Conversacion(this.personaUsuario, this.personaProfesional, listaMensajes);
        boolean usuarioAreEquals = this.personaProfesional.equals(conversacionATestear.getProfesional());
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
        assertEquals(conversacionATestear.toString(), "Inicio de conversacion");
    }


    @Test
    public void testGetSetsDatosVaciosProfesional() {
        Persona usuario = new Usuario(this.personaUsuario);
        Persona profesional = new Profesional(this.personaProfesional);
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        boolean usuarioAreEquals = profesional.equals(conversacionATestear.getProfesional());
        assertTrue(usuarioAreEquals);
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
        assertEquals(conversacionATestear.toString(), "Inicio de conversacion");
    }


}
