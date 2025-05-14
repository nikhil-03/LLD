package org.example;

public abstract class CashWithdrawProcessor {
    protected CashWithdrawProcessor nextcashWithdrawProcessor;
    protected ATMMachine atmMachine;

    public CashWithdrawProcessor(CashWithdrawProcessor nextcashWithdrawProcessor, ATMMachine atmMachine) {
        this.nextcashWithdrawProcessor = nextcashWithdrawProcessor;
        this.atmMachine = atmMachine;
    }

    public void withdraw(ATMMachine atmMachine, int amount) {
        if (nextcashWithdrawProcessor != null) {
            nextcashWithdrawProcessor.withdraw(atmMachine, amount);
        }
    }
}
