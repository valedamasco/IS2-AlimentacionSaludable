package dominio;

import dominio.Sistema.DiasDeLaSemana;
import dominio.Sistema.IngestasPorDia;
import dominio.Sistema.Paises;
import dominio.Sistema.Preferencias;
import dominio.Sistema.Restricciones;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import org.junit.Test;
import static org.junit.Assert.*;

public class SistemaTest {

    public SistemaTest() {

    }


    @Test
    public void testGetsSetsNullListaAlimentos() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        assertEquals(sistemaATestear.getListaAlimentos().size(), 0);
    }

    @Test
    public void testGetsSetsNullListaPlanes() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        assertEquals(sistemaATestear.getListaPlanesAlimentacion().size(), 0);
    }

    @Test
    public void testGetsSetsNullListaConversaciones() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        assertEquals(sistemaATestear.getListaConversaciones().size(), 0);
    }

    @Test
    public void testGetsSetsNullPersonaLogueada() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona personaLogueadaEsperada = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(sistemaATestear.getPersonaLogueada(), personaLogueadaEsperada);
    }

    @Test
    public void testGetsSetsDatosVaciosListaUsuarios() {
        Sistema sistemaATestear = new Sistema();
        assertEquals(sistemaATestear.getListaUsuarios().size(), 0);
    }

    @Test
    public void testGetsSetsDatosVaciosListaAlimentos() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        Persona personaLogueada = new Usuario(null, null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        assertEquals(sistemaATestear.getListaAlimentos().size(), 0);
    }

    @Test
    public void testAgregarMensajeConversacionListaVacia() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        boolean pudeAgregarMensaje = sistemaATestear.agregarMensajeConversacion("Martin", "Lucia", "aa", false, false);
        assertFalse(pudeAgregarMensaje);
    }

    @Test
    public void testAgregarMensajeConversacionNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        boolean pudeAgregarMensaje = sistemaATestear.agregarMensajeConversacion(null, null, "Segundo mensaje", false, false);
        assertFalse(pudeAgregarMensaje);
    }

    @Test
    public void testDevolverAlimentoNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Alimento alimentoEsperado = new Alimento(null, null, null, null);
        assertEquals(sistemaATestear.devolverAlimentoDadoNombre(null), alimentoEsperado);
    }

    @Test
    public void testDevolverAlimentoDatosVacios() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Alimento alimentoEsperado = new Alimento("", "", null, null);
        assertEquals(sistemaATestear.devolverAlimentoDadoNombre(""), alimentoEsperado);
    }

    @Test
    public void testDevolverAlimentoDatosCorrectos() {
        ArrayList listaAlimentos = new ArrayList<>();
        Alimento alimentoEsperado = new Alimento("Papa", "Verdura", null, null);
        listaAlimentos.add(alimentoEsperado);
        Sistema sistemaATestear = new Sistema(null, null, listaAlimentos, null, null, null);
        assertEquals(sistemaATestear.devolverAlimentoDadoNombre("Papa"), alimentoEsperado);
    }

    @Test
    public void testDevolverAlimentoDatosErroneos() {
        ArrayList listaAlimentos = new ArrayList<>();
        Alimento alimentoEsperado = new Alimento("Papa", "Verdura", null, null);
        listaAlimentos.add(alimentoEsperado);
        Sistema sistemaATestear = new Sistema(null, null, listaAlimentos, null, null, null);
        assertNotEquals(sistemaATestear.devolverAlimentoDadoNombre("Luca"), alimentoEsperado);
    }

    @Test
    public void testUsuarioDevolverPorNombreNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuarioEsperado = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(sistemaATestear.getProfesionalPorNombre(null), usuarioEsperado);
    }

    @Test
    public void testProfesionalDevolverPorNombreNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Profesional profesionalEsperado = new Profesional(null, null, null, null, null, null, null);
        assertEquals(sistemaATestear.getProfesionalPorNombre(null), profesionalEsperado);
    }

    @Test
    public void testDevolverProfesionalPorNombreDatosVacios() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Profesional profesionalEsperado = new Profesional(null, null, null, null, null, null, null);
        assertEquals(sistemaATestear.getProfesionalPorNombre(""), profesionalEsperado);
    }

    @Test
    public void testDevolverProfesionalPorNombreDatosErroneos() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Profesional profesionalEsperado = new Profesional("Martin", null, null, null, null, null, null);
        sistemaATestear.agregarProfesionalALaLista(profesionalEsperado);
        assertEquals(sistemaATestear.getProfesionalPorNombre("Martin"), profesionalEsperado);
    }

    @Test
    public void testDevolverUsuarioPorNombreDatosVacios() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuarioEsperado = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(sistemaATestear.getProfesionalPorNombre(""), usuarioEsperado);
    }

    @Test
    public void testDevolverUsuarioPorNombreDatosErroneos() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario = new Usuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista(usuario);
        Usuario usuario2 = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(sistemaATestear.getProfesionalPorNombre("Martin"), usuario2);
    }

    @Test
    public void testAgregarPlanAlimentacionUsuarioNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = null;
        Profesional profesional1 = new Profesional(null, null, null, null, null, null, null);
        assertFalse(sistemaATestear.agregarPlanSolicitado(usuario1, profesional1));
    }

    @Test
    public void testAgregarPlanAlimentacionProfesionalNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional1 = null;
        assertFalse(sistemaATestear.agregarPlanSolicitado(usuario1, profesional1));
    }

    @Test
    public void testAgregarPlanAlimentacionRepetidos() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional1 = new Profesional(null, null, null, null, null, null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1);
        assertFalse(sistemaATestear.agregarPlanSolicitado(usuario1, profesional1));
    }

    @Test
    public void testPlanesPendientes() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario("Martin", "Gómez", null, null, null, null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null, null, null, null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1);
        assertEquals(sistemaATestear.getListaPlanesPendientes(profesional1).length, 1);
    }

    @Test
    public void testPlanesPendientes2() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario("Martin", "Gómez", null, null, null, null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null, null, null, null, null);
        Profesional profesional2 = new Profesional("Joaquin", "Bardanca", null, null, null, null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1);
        assertEquals(sistemaATestear.getListaPlanesPendientes(profesional2).length, 0);
    }

    @Test
    public void testPlanesPendientesNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario("Martin", "Gómez", null, null, null, null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null, null, null, null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1);
        assertEquals(sistemaATestear.getListaPlanesPendientes(null).length, 0);
    }

    @Test
    public void testAgregarAListaConversacionesDatosErroneos() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = new Usuario("Martin", null, null, null, null, null, null, null);
        Persona profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        boolean agregoConversacionRepetida = sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        assertFalse(agregoConversacionRepetida);
    }

    @Test
    public void testAgregarIngestaDatosCorrectos() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        Ingesta ingesta1 = new Ingesta("11/02/17", null);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null, null, null);
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(listaIngestas, "11/02/16", "Papa");
        assertTrue(retorno);
    }

    @Test
    public void testAgregarIngestaRepetida() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        listaAlimentos.add(new Alimento("Papa", null, null, null));
        Ingesta ingesta1 = new Ingesta("11/02/17", listaAlimentos);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarIngestaAUsuario(listaIngestas, "11/02/17", "Papa");
        Usuario user = (Usuario) sistemaATestear.getUsuarioPorNombre("Martin");
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(user.getAlimentosIngeridos(), "11/02/16", "Papa");
        assertTrue(retorno);
    }

    @Test
    public void testAgregarIngestaFechaRepetida() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        listaAlimentos.add(new Alimento("Papa", null, null, null));
        Ingesta ingesta1 = new Ingesta("11/02/17", listaAlimentos);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarIngestaAUsuario(listaIngestas, "11/02/17", "Papa");
        Usuario user = (Usuario) sistemaATestear.getUsuarioPorNombre("Martin");
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(user.getAlimentosIngeridos(), "11/02/17", "Papa");
        assertTrue(retorno);
    }

    @Test
    public void testAgregarIngestaFechaNull() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        listaAlimentos.add(new Alimento("Papa", null, null, null));
        Ingesta ingesta1 = new Ingesta(null, listaAlimentos);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarIngestaAUsuario(listaIngestas, null, "Papa");
        Usuario user = (Usuario) sistemaATestear.getUsuarioPorNombre("Martin");
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(user.getAlimentosIngeridos(), null, "Papa");
        assertFalse(retorno);
    }

    @Test
    public void testAgregarIngestaAlimentoRepetidoFechaDistinta() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null, null, null);
        Usuario user = (Usuario) sistemaATestear.getUsuarioPorNombre("Martin");
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(user.getAlimentosIngeridos(), "11/02/16", "Papa");
        assertTrue(retorno);
    }

    @Test
    public void testDevolverPlanDadoNombreNull() {
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        assertEquals(sistemaATestear.devolverPlanDadoNombre(null), new PlanAlimentacion(null, null, null, false, null));
    }

    @Test
    public void testDevolverPlanDatosValidos() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan", user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        assertEquals(sistemaATestear.devolverPlanDadoNombre("Plan"), plan1);
    }

    @Test
    public void testDevolverPlanNoPertenece() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        assertEquals(sistemaATestear.devolverPlanDadoNombre("Plan").getNombreDelPlan(), plan1.getNombreDelPlan());
    }

    @Test
    public void testAtenderSolicitudPlan() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(), professional1,
                user1, plan1.getNombreDelPlan());
        assertTrue(fueAtendido);
    }

    @Test
    public void testAtenderSolicitudPlanAtendidoTrue() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, true, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(), professional1,
                user1, "Plan de alimentación");
        assertFalse(fueAtendido);
    }

    @Test
    public void testAtenderSolicitudPlanProfesionalDistinto() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        Profesional professional2 = new Profesional("Lautaro", null, null, null, null, null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(), professional2,
                user1, plan1.getNombreDelPlan());
        assertFalse(fueAtendido);
    }

    @Test
    public void testAtenderSolicitudPlanUsuarioDistinto() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        Usuario user2 = new Usuario("Martina", null, null, null, null, null, null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(), professional1,
                user2, plan1.getNombreDelPlan());
        assertFalse(fueAtendido);
    }

    @Test
    public void testAtenderSolicitudPlanListaVacia() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(), professional1,
                user1, plan1.getNombreDelPlan());
        assertFalse(fueAtendido);
    }

    @Test
    public void testListaPlanesAtendidosDatosCorrectos() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(), professional1,
                user1, plan1.getNombreDelPlan());
        boolean sonIguales = sistemaATestear.planesAtendidosDelUsuario(user1)[0].equals(plan1.getNombreDelPlan());
        assertTrue(sonIguales);
    }

    @Test
    public void testListaPlanesAtendidosListaVacia() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        assertEquals(sistemaATestear.planesAtendidosDelUsuario(user1).length, 0);
    }

    @Test
    public void testEnumPreferenciasCarnesBlancas() {
        String resultadoEsperado = "CarnesBlancas";
        assertEquals(Preferencias.CarnesBlancas.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPreferenciasCarnesRojas() {
        String resultadoEsperado = "CarnesRojas";
        assertEquals(Preferencias.CarnesRojas.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPreferenciasVerduras() {
        String resultadoEsperado = "Verduras";
        assertEquals(Preferencias.Verduras.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPreferenciasFrutas() {
        String resultadoEsperado = "Frutas";
        assertEquals(Preferencias.Frutas.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPreferenciasHarinas() {
        String resultadoEsperado = "Harinas";
        assertEquals(Preferencias.Harinas.name(), resultadoEsperado);
    }

    @Test
    public void testEnumRestriccionesDiabetes() {
        String resultadoEsperado = "Diabetes";
        assertEquals(Restricciones.Diabetes.name(), resultadoEsperado);
    }

    @Test
    public void testEnumRestriccionesVeganismo() {
        String resultadoEsperado = "Veganismo";
        assertEquals(Restricciones.Veganismo.name(), resultadoEsperado);
    }

    @Test
    public void testEnumRestriccionesIntoleranciaLactosa() {
        String resultadoEsperado = "IntoleranciaLactosa";
        assertEquals(Restricciones.IntoleranciaLactosa.name(), resultadoEsperado);
    }

    @Test
    public void testEnumRestriccionesHarinas() {
        String resultadoEsperado = "Celiaquia";
        assertEquals(Restricciones.Celiaquia.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaJueves() {
        String resultadoEsperado = "Jueves";
        assertEquals(DiasDeLaSemana.Jueves.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaViernes() {
        String resultadoEsperado = "Viernes";
        assertEquals(DiasDeLaSemana.Viernes.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaSabado() {
        String resultadoEsperado = "Sabado";
        assertEquals(DiasDeLaSemana.Sabado.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaDomingo() {
        String resultadoEsperado = "Domingo";
        assertEquals(DiasDeLaSemana.Domingo.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaMiercoles() {
        String resultadoEsperado = "Miercoles";
        assertEquals(DiasDeLaSemana.Miercoles.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaMartes() {
        String resultadoEsperado = "Martes";
        assertEquals(DiasDeLaSemana.Martes.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaLunes() {
        String resultadoEsperado = "Lunes";
        assertEquals(DiasDeLaSemana.Lunes.name(), resultadoEsperado);
    }

    @Test
    public void testEnumIngestasDiaDesayuno() {
        String resultadoEsperado = "Desayuno";
        assertEquals(IngestasPorDia.Desayuno.name(), resultadoEsperado);
    }

    @Test
    public void testEnumIngestasDiaAlmuerzo() {
        String resultadoEsperado = "Almuerzo";
        assertEquals(IngestasPorDia.Almuerzo.name(), resultadoEsperado);
    }

    @Test
    public void testEnumIngestasDiaCena() {
        String resultadoEsperado = "Cena";
        assertEquals(IngestasPorDia.Cena.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDevolverListaIngestas() {
        Sistema sistemaATestear = new Sistema();
        ArrayList<String> listaEsperada = new ArrayList<>();
        listaEsperada.add("Desayuno");
        listaEsperada.add("Almuerzo");
        listaEsperada.add("Cena");
        assertEquals(sistemaATestear.devolverListaIngestasDeLaSemana(), listaEsperada);
    }


    @Test
    public void testEnumDevolverListaDiasDeLaSemana() {
        Sistema sistemaATestear = new Sistema();
        ArrayList<String> listaEsperada = new ArrayList<>();
        listaEsperada.add("Lunes");
        listaEsperada.add("Martes");
        listaEsperada.add("Miercoles");
        listaEsperada.add("Jueves");
        listaEsperada.add("Viernes");
        listaEsperada.add("Sabado");
        listaEsperada.add("Domingo");
        assertEquals(sistemaATestear.devolverListaDiasDeLaSemana(), listaEsperada);
    }
    @Test
       public void testAgrearAlimentoOk (){
        Alimento nuevoAlimento = new Alimento("Ensalda de frutas", "", null, null);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        boolean fueAgregadoAlimento = sistemaATestear.agregarAlimentoALaLista(nuevoAlimento);
        assertTrue(fueAgregadoAlimento);
        
    }
    @Test
       public void testAgrearAlimentoYaExistente (){
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        Alimento alimentoExistente = new Alimento("Ensalda de frutas", "", null, null);
        listaAlimentos.add(alimentoExistente);
        sistemaATestear.setListaAlimentos(listaAlimentos);
        boolean noFueAgregadoAlimento = sistemaATestear.agregarAlimentoALaLista(alimentoExistente);
        assertFalse(noFueAgregadoAlimento);
        
    }
    @Test
      public void testCrearAlimento ()
      {
         Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
         boolean fueCreadoAlimento = sistemaATestear.crearAlimento("Torta de atún", "", null, null);
        assertTrue(fueCreadoAlimento);
    }

      
      
    @Test
     public void testDevolverListaPaises()
      {  
        Sistema sistemaATestear = new Sistema();
        ArrayList<String> listaEsperada = new ArrayList<>();
        listaEsperada.add("Argentina");
        listaEsperada.add("Bolivia");
        listaEsperada.add("Brasil");
        listaEsperada.add("Chile");
        listaEsperada.add("Colombia");
        listaEsperada.add("Costa Rica");
        listaEsperada.add("Cuba");
        listaEsperada.add("Ecuador");
        listaEsperada.add("El Salvador");
        listaEsperada.add("Guayana Francesa");
        listaEsperada.add("Granada");
        listaEsperada.add("Guatemala");
        listaEsperada.add("Guayana");
        listaEsperada.add("Haití");
        listaEsperada.add("Honduras");
        listaEsperada.add("Jamaica");
        listaEsperada.add("México");
        listaEsperada.add("Nicaragua");
        listaEsperada.add("Paraguay");
        listaEsperada.add("Panamá");
        listaEsperada.add("Perú");
        listaEsperada.add("Puerto Rico");
        listaEsperada.add("República Dominicana");
        listaEsperada.add("Surinam");
        listaEsperada.add("Uruguay");
        listaEsperada.add("Venezuela");
        assertEquals(sistemaATestear.devolverListaPaises(), listaEsperada);
        
        
        }
  @Test
    public void testAgregarProfesionalnoExistenteALista() {
        Sistema sistemaATestear = new Sistema();
        ArrayList<String> listaProfesionales = null;
        Persona persona = new Persona ("Yuliana", "Perez", "", null);
        Profesional nuevoProfesional = new Profesional (persona);
        boolean pudeAgregarProfesional= sistemaATestear.agregarProfesionalALaLista(nuevoProfesional);
        assertTrue(pudeAgregarProfesional);
    }
   
      @Test
    public void testAgregarProfesionalExistenteALista() {
         Sistema sistemaATestear = new Sistema();
         ArrayList listaProfesionales = new ArrayList<>();
         Profesional profesionalexistente = new Profesional("Yuliana", "Perez","", null);
         listaProfesionales.add(profesionalexistente);
         sistemaATestear.setListaProfesionales(listaProfesionales);
         boolean noPudeAgregarProfesional= sistemaATestear.agregarProfesionalALaLista(profesionalexistente);
         assertFalse(noPudeAgregarProfesional);
    }
    @Test
    public void testAgregarConversacionALaLista()
    {
         Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
         Persona persona1 = new Persona ("Joaquin", "Lopez", "", null);
         Persona persona2 = new Persona ("Yuliana", "Perez", "", null);
         InformacionMensaje informacion = new InformacionMensaje(persona1.getNombreCompleto(), persona2.getNombreCompleto(), "Hola soy celíaco");
         ArrayList<InformacionMensaje> listaMensajes = new ArrayList<>();
         listaMensajes.add(informacion);
         Conversacion nuevaConversacion = new Conversacion(persona1, persona2, listaMensajes);
         boolean fueAgregadaConversacion = sistemaATestear.agregarConversacionALaLista(nuevaConversacion);
        assertTrue(fueAgregadaConversacion);
    }
    
 
     @Test
     public void testCrearProfesional ()
     {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        boolean fueAgregadoProfesional = sistemaATestear.crearProfesional("Lola", "Arocena", "30/11/1994", null, "Ingeniero en Alimentos", "20/3/2019", "Uruguay");
        assertTrue(fueAgregadoProfesional);
    }
     
     @Test 
     public void testCrearConversacionAUsuarioYaExistente ()
     {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
         Usuario usuario = new Usuario("Gonzalo","Figueroa", "5/3/1976",null,"Uruguaya", null, null, null);
         Profesional profesional = new Profesional ("Lola", "Arocena", "30/11/1994", null, "Ingeniero en Alimentos", "20/3/2019", "Uruguay");
         sistemaATestear.getListaProfesionales().add(profesional);
         sistemaATestear.getListaUsuarios().add(usuario);
         boolean fueAgregadaConversacion = sistemaATestear.crearConversacion(usuario, profesional, "hola", true);
         assertTrue(fueAgregadaConversacion);
     }
    
     
         
     }

     
          
   
   


