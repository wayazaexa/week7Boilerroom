package org.example.Services;

import org.example.Models.Receipt;

public record ReceiptPrinter(Receipt receipt, NotificationService notificationService) {

    public void print() {
        System.out.println(receipt);
        System.out.println();
        notificationService.sendMessage(receipt.customer().email(), "You've made a purchase! See included receipt for details.");
    }
}
