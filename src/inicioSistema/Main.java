package inicioSistema;

import dominio.Profesional;
import dominio.Sistema;
import dominio.Usuario;
import interfaz.VentanaMenuPrincipal;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

    public static void main(String[] args) {
        Sistema sistema;

        try {
            try (FileInputStream f = new FileInputStream("Sistema.data")) {
                sistema = (Sistema) new ObjectInputStream(new BufferedInputStream(f)).readObject();
                Profesional profesionalARegistrar = new Profesional("Profesional", "1", null , null, null, null, null);
                Usuario usuarioARegistrar = new Usuario("Usuario", "1",null,null,null,null,null,null);
                sistema.agregarProfesionalALaLista(profesionalARegistrar);
                sistema.agregarUsuarioALaLista(usuarioARegistrar);
            }
        } catch (IOException | ClassNotFoundException e) {
            sistema = new Sistema();
        }
        VentanaMenuPrincipal ventana = new VentanaMenuPrincipal(sistema);
        ventana.setVisible(true);
    }

}
