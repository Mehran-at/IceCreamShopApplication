package iceCreamShopApplication;

//      Create the shop.IceCreamApplication class and write the following instructions in its main method:
//------------------------------------------------------------------
// The Chocolate ice-cream with Oreo is licked
// The Vanilla ice-cream with Cookies is eaten with a spoon
//------------------------------------------------------------------
public class IceCreamApplication {
    public static void main(String[] args) {
//      Create a shop.ConeIceCream as an shop.IceCream, name it cone and display the eat message.
        ConeIceCream cone = new ConeIceCream("vanilla ", "choclate");
        System.out.println(cone.eat());
//      Create a shop.CupIceCream as an shop.IceCream, name it cup and display the eat message.
        CupIceCream cup = new CupIceCream("Strawberry", "Cream");
        System.out.println(cup.eat());
//
    }
}
//      Create the shop.IceCreamTest class that tests that the shop.ConeIceCream and the shop.CupIceCream return the right messages.
//      Create the competitor package and inside of it the competitor.CompetitorIceCreamApplication class and write the following
// instructions in its main method:
//      Create both a shop.ConeIceCream and a shop.CupIceCream and check whether you can use the getFlavor or getTopping methods.
// It doesn’t work because the competitor.CompetitorIceCreamApplication is in a different package and it also does not extend from
// shop.IceCream, therefore the protected methods are not accessible.
//------------------------------------------------------------------------------
//The Chocolate ice-cream with Oreo is licked                                  -
//The Vanilla ice-cream with Cookies is eaten with a spoon                     -
//-------------------------------------------------------------------------------