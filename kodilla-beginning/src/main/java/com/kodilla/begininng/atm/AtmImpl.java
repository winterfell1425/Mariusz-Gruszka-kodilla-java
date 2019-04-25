package com.kodilla.begininng.atm;

public class AtmImpl implements Atm{
    @Override
    public void cashDepositAtATM(int deposit) {
        System.out.println("You've made a deposit of $" + deposit + ".");
    }
    @Override
    public void cashWithdrawalFromATM(int withdrawal) {
        System.out.println("You've made a withdrawal of $" + withdrawal + ".");
    }
}
