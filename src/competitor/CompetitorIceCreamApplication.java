package competitor;//      Create the competitor package and inside of it the competitor.CompetitorIceCreamApplication class and write the following
// instructions in its main method:
//      Create both a shop.ConeIceCream and a shop.CupIceCream and check whether you can use the getFlavor or getTopping methods.
// It doesn’t work because the competitor.CompetitorIceCreamApplication is in a different package and it also does not extend from
// shop.IceCream, therefore the protected methods are not accessible.
import iceCreamShopApplication.ConeIceCream;
import iceCreamShopApplication.CupIceCream;
import iceCreamShopApplication.IceCream;

public class CompetitorIceCreamApplication {
    public static void main(String[] args) {
        IceCream cone = new ConeIceCream("Peach", "Nuts");
//        cone.getFlavor();
//        cone.getTopping();
//        it does not work.
        IceCream cup = new CupIceCream("Mango", "Pistachio");
//        cup.getFlavor();
//        cup.getTopping();
//        it doesn't work
    }
}
