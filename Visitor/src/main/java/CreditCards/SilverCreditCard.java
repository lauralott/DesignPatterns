package CreditCards;

import Offers.OfferVisitor;

public class SilverCreditCard implements CreditCard {

    @Override
    public String getName() {
        return "Silver";
    }

    @Override
    public void accept(OfferVisitor offer) {
        offer.visitSilverCreditCard(this);
    }
}
