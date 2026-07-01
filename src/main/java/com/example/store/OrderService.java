package com.example.store;

public class OrderService {
    private PaymentService paymentService;

    public OrderService() {}

    // DI-constructor injection: paymentService is created outside OrderService and inject into it
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    // DI-setter injection, NOT recommended,
    // since PaymentService is required dependency, so better if use constructor injection
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.processPayment(10);
    }
}
