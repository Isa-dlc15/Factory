package Factory;


public class SMSNotificacion implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("cargando envio de mensajes... " + mensaje);
    }
}
