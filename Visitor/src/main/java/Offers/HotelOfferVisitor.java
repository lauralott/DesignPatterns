package Offers;

import CreditCards.BronzeCreditCard;
import CreditCards.GoldCreditCard;
import CreditCards.SilverCreditCard;

public class HotelOfferVisitor implements OfferVisitor {
    @Override
    public void visitBronzeCreditCard(BronzeCreditCard bronze) {
        printMessage(bronze.getName());
    }

    @Override
    public void visitSilverCreditCard(SilverCreditCard silver) {
        printMessage(silver.getName());
    }

    @Override
    public void visitGoldCreditCard(GoldCreditCard gold) {
        printMessage(gold.getName());
    }

    private void printMessage(String cardType) {
        System.out.println(String.format( "We are computing the cashback for a %s card buying hotel",cardType));
    }
}
