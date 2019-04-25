package com.kodilla.begininng.atm;

public interface Atm {
    public void cashDepositAtATM(int deposit);

    public void cashWithdrawalFromATM(int withdrawal);

    public default void isConnectedWithBank() {

        System.out.println("This ATM is connected with the Bank.");
    }
    static String operationIsOver() {
        return "Your operation on this ATM is over.";
    }
}