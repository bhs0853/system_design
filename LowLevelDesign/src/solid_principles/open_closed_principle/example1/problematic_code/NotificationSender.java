package solid_principles.open_closed_principle.example1.problematic_code;

import java.util.List;

public class NotificationSender {

    public void sendNotifications(List<NotificationType> notificationTypes) {
        for(NotificationType type : notificationTypes) {
            if(type == NotificationType.SMS) {
                type.sendSMSNotification();;
            } else if(type == NotificationType.WHATSAPP) {
                type.sendWhatsappNotification();
            } else if(type == NotificationType.EMAIL) {
                type.sendEmailNotification();
            }
        }
    }
}
