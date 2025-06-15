package com.pushker.learnjava.oops;


interface PaymentValidator{
//    boolean validatePayment(Payment payment);
    static boolean isValidateCreditCard(String cardnumber){
        return cardnumber.length()==16;
    }

    boolean validatePayment(String payment);
}

class PayPalValidator implements PaymentValidator{
    @Override
    public boolean validatePayment(String payment){
        return PaymentValidator.isValidateCreditCard(payment)==true;
    }
}

public class StaticMethodsInterface {
    public static void main(String[] args) {

    }
}
