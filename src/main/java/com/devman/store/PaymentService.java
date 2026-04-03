package com.devman.store;

public interface PaymentService {
    void processPayment(double amount);

    //have two implementations - Stripe & PayPal
    //and these implementations must have the method processPayment
}
