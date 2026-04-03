package com.devman.store;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
public class OrderService {
    //tight coupled
//        var paymentService = new StripePaymentService();
//        paymentService.processPayment(80);

        //coupling loosely with interface

//        public OrderService(PaymentService paymentService){
//            this.paymentService = paymentService;
//        }


        public PaymentService paymentService;

//        @Autowired
        public OrderService(){
            this.paymentService = paymentService;
        }


        public void placeOrder(){
            paymentService.processPayment(80);
        }

}
