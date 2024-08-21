package solid_principles.open_closed_principle.example1.better_code;

import java.util.*;

public class Main {
    public static void main(String[] args){
        NotificationType sms = new SMSNotification();
        NotificationType email = new EmailNotification();
        NotificationType pushNotification = new PushNotification();
        NotificationType whatsappNotification = new WhatsappNotification();
        NotificationSender sender = new NotificationSender();
        List<NotificationType> types = new ArrayList<>();
        types.add(sms);
        types.add(email);
        types.add(whatsappNotification);
        types.add(pushNotification);
        sender.sendNotifications(types);
    }
}
