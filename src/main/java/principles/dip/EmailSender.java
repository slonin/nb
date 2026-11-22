package principles.dip;

class EmailSender implements Sendable {
    public void send(String message) {
        System.out.println("Отправка email: " + message);
    }
}