package ru.otus.oop.atm;

import ru.otus.oop.atm.dictionary.Denomination;
import ru.otus.oop.atm.impl.AutomatedTellerMachine;
import ru.otus.oop.atm.interfaces.ATM;

public class Application {
    public static void main(String[] args) {
        ATM atm = new AutomatedTellerMachine();
        atm.depositMoney(Denomination.HUNDRED,100);
        atm.accountState().printState();
        atm.withdraw(100);
        atm.depositMoney(Denomination.FIFTY, 50);
        atm.accountState().printState();
        atm.saveState();
        System.out.println(atm.accountState().availableAmount());
        try {
            atm.withdraw(10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        atm.accountState().printState();
    }
}
