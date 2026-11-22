package principles.dip;

public class NotificationService {
    private Sendable sendable;

    public NotificationService(Sendable sendable) {
        this.sendable = sendable;
    }

    public void sendNotification(String message) {
        sendable.send(message);
    }
}
