package CreditCards;

import Offers.OfferVisitor;

public class GoldCreditCard implements CreditCard {
    @Override
    public String getName() {
        return "Gold";
    }

    @Override
    public void accept(OfferVisitor offer) {
        offer.visitGoldCreditCard(this);

    }
}
