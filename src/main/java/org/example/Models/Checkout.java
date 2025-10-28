package org.example.Models;

import org.example.Services.NotificationService;
import org.example.Services.ReceiptPrinter;

public class Checkout {

    public void checkout(Cart cart, Customer customer) {
        ReceiptPrinter printer = new ReceiptPrinter(new Receipt(cart, customer), new NotificationService());
        printer.print();
    }
}
