package Offers;

import CreditCards.BronzeCreditCard;
import CreditCards.GoldCreditCard;
import CreditCards.SilverCreditCard;

public interface OfferVisitor {
    void visitBronzeCreditCard(BronzeCreditCard bronze);
    void visitSilverCreditCard(SilverCreditCard silver);
    void visitGoldCreditCard(GoldCreditCard gold);
}
