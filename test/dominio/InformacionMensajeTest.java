package dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class InformacionMensajeTest {
	
	public InformacionMensajeTest() {

    }
    @Test
    public void testGetsSetsNullRemitente() {
        InformacionMensaje info = new InformacionMensaje();
        assertEquals(info.getRemitente(), "");
    }

    @Test
    public void testGetsSetsNullMensaje() {
        String remitente = null;
        String destinatario = null;
        String mensaje = null;
        InformacionMensaje info = new InformacionMensaje(remitente, destinatario, mensaje);
        assertEquals(info.getMensaje(), mensaje);
    }

    @Test
    public void testGetsSetsNullToString() {
        InformacionMensaje info = new InformacionMensaje();
        String esperadoToString = "" + ": \n" + "";
        assertEquals(info.toString(), esperadoToString);
    }

    @Test
    public void testGetsSetsStringsVaciosRemitente() {
        InformacionMensaje info = new InformacionMensaje();
        assertEquals(info.getRemitente(), "");
    }

    @Test
    public void testGetsSetsStringsVaciosDestinatario() {
        InformacionMensaje info = new InformacionMensaje();
        assertEquals(info.getDestinatario(), "");
    }

    @Test
    public void testGetsSetsStringsVaciosMensaje() {
        InformacionMensaje info = new InformacionMensaje();
        assertEquals(info.getMensaje(), "");
    }

    @Test
    public void testGetsSetsStringsVaciosToString() {
        InformacionMensaje info = new InformacionMensaje();
        String esperadoToString = "" + ": \n" + "";
        assertEquals(info.toString(), esperadoToString);
    }

}
