package org.example;

public class ThousandCashWithdrawProcessor extends CashWithdrawProcessor{
    public ThousandCashWithdrawProcessor(CashWithdrawProcessor nextcashWithdrawProcessor, ATMMachine atmMachine) {
        super(nextcashWithdrawProcessor, atmMachine);
    }

    public void withdraw(ATMMachine atmMachine, int remAmt) {
         int count = atmMachine.noOf1000;
         int leftBalance=remAmt;
         if(remAmt>=1000 && count>0)
         {
             int req = remAmt/1000;
             if(count>=req){
                 leftBalance=leftBalance-(req*1000);
                 atmMachine.setNoOf1000(count-req);
             }
             else{
                 leftBalance=leftBalance-(count*1000);
                 atmMachine.setNoOf1000(0);
             }
         }
         if(leftBalance>0){
             super.withdraw(atmMachine,leftBalance);
         }
    }
}
