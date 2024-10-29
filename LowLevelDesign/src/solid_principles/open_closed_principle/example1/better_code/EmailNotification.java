package solid_principles.open_closed_principle.example1.better_code;

public class EmailNotification implements NotificationType{
    @Override
    public void sendNotification() {
        System.out.println("sending Email Notification");
    }
}
