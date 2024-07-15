package Factory;

public class AppNotificacion implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("mensajes de la app " + mensaje);
    }
}
