package com.pushker.learnjava.oops;

interface PaymentProcessor{
//    void processPayment(Payment payment)
    default void validatePaymentProcess(String payment){
        if(payment.length()>0){
            System.out.println("Payment Validated!");
        }
    }

    boolean validatePayment(String payment);
}

class StripeProcessor implements PaymentProcessor{
    @Override
    public void validatePaymentProcess(String payment){
      //can override can use default one as well
    }

    @Override
    public boolean validatePayment(String payment) {
        return false;
    }
}


public class DefaultMethodInterface {
    public static void main(String[] args) {

    }
}
