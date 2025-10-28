package org.example.Services;

import org.example.Models.Customer;
import org.example.Models.Receipt;

public record ReceiptPrinter(Receipt receipt, Customer customer, NotificationService notificationService) {

    public void print() {
        System.out.println(receipt.toString(customer.discountPolicy()));
        System.out.println();
        notificationService.sendMessage(customer.email(), "You've made a purchase! See included receipt for details.");
    }
}
