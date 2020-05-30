package dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class ComposicionAlimentoTest {

	
    @Test
    public void testGetsSetsNull() {
        ComposicionAlimento composicion = new ComposicionAlimento();
        assertEquals(composicion.getNutriente(), "");
    }

    @Test
    public void testGetsSestNegativo() {
        ComposicionAlimento composicion = new ComposicionAlimento("", -5);
        assertEquals(1, composicion.getProporcion(), 0);
    }

    @Test
    public void testGetsSestPositivo() {
        ComposicionAlimento composicion = new ComposicionAlimento("Papa", 5);
        assertEquals(1, composicion.getProporcion(), 5);
    }

    @Test
    public void testGetsSestDatoCorrecto() {
        ComposicionAlimento composicion = new ComposicionAlimento("Papa", 5);
        assertEquals(composicion.getNutriente(), "Papa");
    }

}
