package org.example;

public class OneHundredCashWithdrawProcessor extends CashWithdrawProcessor
{
    public OneHundredCashWithdrawProcessor(CashWithdrawProcessor nextcashWithdrawProcessor, ATMMachine atmMachine) {
        super(nextcashWithdrawProcessor, atmMachine);
    }

    public void withdraw(ATMMachine atmMachine, int remAmt) {
        int count = atmMachine.noOf100;
        int leftBalance=remAmt;
        if(remAmt>=100 && count>0)
        {
            int req = remAmt/100;
            if(count>=req){
                leftBalance=leftBalance-(req*100);
                atmMachine.setNoOf100(count-req);
            }
            else{
                leftBalance=leftBalance-(count*100);
                atmMachine.setNoOf100(0);
            }
        }
        if(leftBalance>0){
            super.withdraw(atmMachine,leftBalance);
        }
    }
}
