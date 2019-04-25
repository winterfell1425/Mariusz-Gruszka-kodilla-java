package com.kodilla.begininng.atm;

public class Application {
    public static void main (String[] args) {

        int deposit = 400;
        int withdrawal = 250;

        AtmImpl atm1 = new AtmImpl();
        atm1.isConnectedWithBank();
        atm1.cashDepositAtATM(deposit);
        atm1.cashWithdrawalFromATM(withdrawal);
        System.out.println(Atm.operationIsOver());
    }
}