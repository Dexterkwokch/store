package com.example.store;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;

    public OrderService() {}


    // DI-constructor injection: paymentService is created outside OrderService and inject into it
// //Tells spring: use constructor to create this class, and inject required Bean into it
    public OrderService(PaymentService paymentService){
        // public OrderService(@Qualifier("paypal")PaymentService paymentService)

        this.paymentService = paymentService;
    }

    @PostConstruct// run this method auto. when OrderService Bean is created and injected
    public void init(){
        System.out.println("Order Service PostConstruct");
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
