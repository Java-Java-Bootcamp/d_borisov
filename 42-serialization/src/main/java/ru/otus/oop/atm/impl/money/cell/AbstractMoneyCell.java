package ru.otus.oop.atm.impl.money.cell;

import ru.otus.oop.atm.exception.MoneyCellException;
import ru.otus.oop.atm.interfaces.MoneyCell;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public abstract class AbstractMoneyCell implements MoneyCell, Serializable {
    private int maxNumber;
    private int banknotesNumber;

    public AbstractMoneyCell(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    @Override
    public void putMoney(int amount) throws Exception {
        if (canPut(amount)) {
            banknotesNumber += amount;
        } else {
            throw new MoneyCellException(String.format("Cell with denomination %s is full", cellDenomination()));
        }
    }

    @Override
    public boolean canPut(int amount) {
        return maxNumber - banknotesNumber >= amount;
    }

    @Override
    public void getMoney(int amount) throws Exception {
        if (canGet(amount)) {
            banknotesNumber -= amount;
        } else {
            throw new MoneyCellException("No enough money");
        }
    }

    @Override
    public boolean canGet(int amount) {
        return banknotesNumber >= amount;
    }

    @Override
    public void saveState() {
        try (var os = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("state.bin")))) {
            os.writeObject(this);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    // TODO сохранить состояние ячейки
}
