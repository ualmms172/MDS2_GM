package gallardoMartinez;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import interfaz.Administrador;
import interfaz.Comentar;
import interfaz.ComentariosUsuarioRegistrado_item;
import interfaz.Comentariospropios;
import interfaz.Comentariospropios_item;
import interfaz.ListaComentariosAdministrador;
import interfaz.ListaComentariosAdministrador_item;
import interfaz.ListaComentariosGeneral_item;
import interfaz.ListaComentariosUsuarioNoRegistrado_item;
import interfaz.ListaContenido;
import interfaz.ListaContenido_item;
import interfaz.ListaHashtagsAdministrador_item;
import interfaz.ListaHashtagsFamososAdministrador;
import interfaz.ListaHashtagsFamososAdministrador_item;
import interfaz.ListaHashtagsGeneral;
import interfaz.ListaHashtagsGeneral_item;
import interfaz.ListaHashtagsUsuarioNoRegistrado_item;
import interfaz.ListaHashtagsgeneralAdministrador_item;
import interfaz.ListaMencionesRecibidas;
import interfaz.ListaMencionesRecibidas_item;
import interfaz.ListaNuevosSeguidores;
import interfaz.ListaNuevosSeguidores_item;
import interfaz.ListaRetweetsNotificados;
import interfaz.ListaRetweetsNotificados_item;
import interfaz.ListaTweetsAdmin;
import interfaz.ListaTweetsAdmin_item;
import interfaz.ListaUsuariosAdministrador;
import interfaz.ListaUsuariosAdministrador_item;
import interfaz.ListaUsuariosFamosos;
import interfaz.ListaUsuariosFamososAdministrador;
import interfaz.ListaUsuariosFamososAdministrador_item;
import interfaz.ListaUsuariosFamosos_item;
import interfaz.ListaUsuariosUsuarionoRegistrado;
import interfaz.ListaUsuariosUsuarionoRegistrado_item;
import interfaz.ListahashtagfamososUsuarioRegistrado;
import interfaz.ListahashtagfamososUsuarioRegistrado_item;
import interfaz.ListahashtagsUsuarioRegistrado_item;
import interfaz.ListahashtagsfamososUsuarioNoRegistrado_item;
import interfaz.ListahashtagsgeneralUsuarioNoRegistrado_item;
import interfaz.ListahashtagsgeneralUsuarioRegistrado_item;
import interfaz.Listatweets;
import interfaz.ListausuariosUsuarioRegistrado;
import interfaz.ListausuariosUsuarioRegistrado_item;
import interfaz.ListausuariosfamososUsuarioRegistrado;
import interfaz.ListausuariosfamososUsuarioRegistrado_item;
import interfaz.Logueado;
import interfaz.UsuarioNoRegistrado;
import interfaz.UsuarioRegistrado;
import interfaz.VerHashtagAdministrador;
import interfaz.VerPerfilAdministrador;
import interfaz.VerTweetAdministrador;
import interfaz.Verlistacompletahashtags;
import interfaz.VerperfilUsuarioNoRegistrado;
import interfaz.Verperfilbloqueado;
import interfaz.Verperfilnobloqueado;
import interfaz.Verperfilpropio;
import interfaz.VertweetUsuarioNoRegistrado;
import interfaz.Vertweetajeno;
import interfaz.Vertweetpropio;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and use @Route
 * annotation to announce it in a URL as a Spring managed bean.
 * <p>
 * A new instance of this class is created for every new user and every browser
 * tab/window.
 * <p>
 * The main view contains a text field for getting the user name and a button
 * that shows a greeting message in a notification.
 */
@Route
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {

    /**
     * Construct  a new Vaadin view.
     * <p>
     * Build the initial UI state for the user accessing the application.
     *
     * @param service
     *            The message service. Automatically injected Spring managed
     *            bean.
     */
    public MainView(@Autowired GreetService service) {

  
   
    }

}