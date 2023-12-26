import CreditCards.BronzeCreditCard;
import CreditCards.CreditCard;
import CreditCards.GoldCreditCard;
import CreditCards.SilverCreditCard;
import Offers.GasOfferVisitor;
import Offers.HotelOfferVisitor;

/**
 *  ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
 *  :::::::::::::::::::::::::::::::::::::::::: V I S I T O R  P A T T E R ::::::::::::::::::::::::::::::::::::::::::
 *  ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
 *  Enforces single responsibility
 *  Applies Open Closed Principle
 *      New Offers (visitors) can be added for extensibility, and they will be totally decouple from the Credit cards.
 *  Uses Double dispatch
 *      a trick that allows using dynamic binding alongside with overloaded methods
 */
public class Runner {
    public static void main(String[] args) {
        HotelOfferVisitor visitor = new HotelOfferVisitor();
        GasOfferVisitor visitor1 = new GasOfferVisitor();

        CreditCard bronze = new BronzeCreditCard();
        CreditCard silver = new SilverCreditCard();
        CreditCard gold = new GoldCreditCard();

        bronze.accept(visitor);
        silver.accept(visitor);
        gold.accept(visitor);

        bronze.accept(visitor1);
        silver.accept(visitor1);
        gold.accept(visitor1);



    }
}
