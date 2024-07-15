package Factory;


public class RegularNotificacionFactory implements NotificacionAbstractFactory {
    @Override
    public Notificacion crearEmailNotificacion() {
        return new EmailNotificacion();

    }

    @Override
    public Notificacion crearSMSNotificacion() {
        return new SMSNotificacion();

    }

    @Override
    public Notificacion crearAppNotificacion() {
        return new AppNotificacion();

    }
}

