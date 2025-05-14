package org.example;

public class FiveHundredCashWithdrawProcessor extends CashWithdrawProcessor{
    public FiveHundredCashWithdrawProcessor(CashWithdrawProcessor nextcashWithdrawProcessor, ATMMachine atmMachine) {
        super(nextcashWithdrawProcessor, atmMachine);
    }

    public void withdraw(ATMMachine atmMachine, int remAmt) {
        int count = atmMachine.noOf500;
        int leftBalance=remAmt;
        if(remAmt>=500 && count>0)
        {
            int req = remAmt/500;
            if(count>=req){
                leftBalance=leftBalance-(req*500);
                atmMachine.setNoOf500(count-req);
            }
            else{
                leftBalance=leftBalance-(count*500);
                atmMachine.setNoOf500(0);
            }
        }
        if(leftBalance>0){
            super.withdraw(atmMachine,leftBalance);
        }
    }

}
