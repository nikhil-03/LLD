package org.example.PaymentTypes;

import org.example.PaymentFlow;
import org.example.User;

public class CreditCardPayment extends PaymentFlow {
    User user;
    public CreditCardPayment(User user){
        this.user=user;
    }
    @Override
    public void validateAmount(int debitAmount) {
       if(user.getAmount()>=debitAmount){
           System.out.println("OK, debit the amount");
       }
       else {
           System.out.println("Sorry, debit amount not possible");
       }
    }

    @Override
    public void DebitAmount(int debitAmount) {
        System.out.println("Debit");
    }

    @Override
    public void addTaxAmount() {
        System.out.println("Add tax 10%");
    }

    @Override
    public void creditAmount(int debitAmount) {
        System.out.println("Credit Amt");
    }
}
