package com.designpatterns.creational.abstractfactory;

// Abstract Product
public class CreditCard {

    protected int cardNumberLength;

    protected int cscNumber;

    public int getCardNumberLength() {
        return this.cardNumberLength;
    }

    public void setCardNumberLenght(int cardNumberLenght) {
        this.cardNumberLength = cardNumberLenght;
    }

    public int getCscNumber() {
        return this.cscNumber;
    }

    public void setCscNumber(int cscNumber) {
        this.cscNumber = cscNumber;
    }
}
