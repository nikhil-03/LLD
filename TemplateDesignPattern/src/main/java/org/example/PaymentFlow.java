package org.example;

public abstract class PaymentFlow {
    public abstract void validateAmount(int debitAmount);
    public abstract void DebitAmount(int debitAmount);
    public abstract void addTaxAmount();
    public abstract void creditAmount(int debitAmount);

    public void processPayment(){
        validateAmount(100);
        DebitAmount(100);
        addTaxAmount();
        creditAmount(100);
    }

}
