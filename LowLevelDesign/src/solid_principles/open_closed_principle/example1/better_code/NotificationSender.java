package solid_principles.open_closed_principle.example1.better_code;

import java.util.List;

public class NotificationSender {
    public void sendNotifications(List<NotificationType> notificationTypeList){
        for(NotificationType type : notificationTypeList){
            type.sendNotification();
        }
    }
}
