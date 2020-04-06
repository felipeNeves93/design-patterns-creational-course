package com.designpatterns.creational.abstractfactory;

public class AbstractFactoryDemo {

    public static void main(String... args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);

        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);

        CreditCard creditCard2 = abstractFactory.getCreditCard(CardType.GOLD);

        System.out.println(creditCard2.getClass());
    }
}
