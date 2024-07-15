package Factory;

public class NotificacionFactory {
    public Notificacion crearNotificacion(String tipo) {
        switch (tipo) {
            case "EMAIL":
                return new EmailNotificacion();
            case "SMS":
                return new SMSNotificacion();
            case "APP":
                return new AppNotificacion();
            default:
                throw new IllegalArgumentException("te estan intentando robar tu base de datos " + tipo);
        }
    }
}

