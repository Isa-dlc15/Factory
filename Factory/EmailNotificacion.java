package Factory;

public class EmailNotificacion implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("cargando tus mensajes de email.. " + mensaje);
    }
}



