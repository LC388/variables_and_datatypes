package com.techelevator;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        int transAmount = getBalance() - amountToWithdraw;
        int serviceCharge = 2;
        if (transAmount <= 0) {
            return getBalance();
        }
        if (transAmount < 150 && transAmount > 0) {
            super.withdraw(amountToWithdraw);
                super.withdraw(serviceCharge);
                return getBalance();
            } if (transAmount > 150){
            super.withdraw(amountToWithdraw);
        }
        return getBalance();
    }
}
