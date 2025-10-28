package org.example.Services;

public class NotificationService implements MessageSender {
    @Override
    public void sendMessage(String to, String message) {
        System.out.println("Message to: " + to + "\nMessage: " + message);
    }
}
