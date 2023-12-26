package CreditCards;

import Offers.OfferVisitor;

public class BronzeCreditCard implements CreditCard{
    @Override
    public String getName() {
        return "Bronze";
    }

    @Override
    public void accept(OfferVisitor offer) {
        offer.visitBronzeCreditCard(this);
    }
}
