package iceCreamShopApplication;

//      Create the shop.ConeIceCream class that extends the shop.IceCream abstract class.
public class ConeIceCream extends IceCream{
//       Implement the eat method with the help of Intellij.
//      Return a sentence that fulfills the following format: “The <flavor> ice-cream with <topping> is licked”.
    public ConeIceCream(String flavor, String topping) {
        super(flavor, topping);
    }

    @Override
    protected String eat() {
        return "The " + getFlavor() + " ice-cream with " + getTopping() + " is licked.";
    }
    //      Note that you have no way to access the flavor and topping attributes. This is because they are private. Not
// even classes that extend from it can have access to them. Implement the constructor with the help of Intellij. The
// reason why you’re compelled to implement it is because the shop.IceCream abstract class requires those values and because
// they are requested via the constructor, then all its children classes have to provide a constructor to be able to
// facilitate them.

//      You can complete now the eat method from the shop.ConeIceCream class. You can use the getFlavor and getTopping methods
// inside the shop.ConeIceCream class because it extends from shop.IceCream class. Classes that are in the same package can use
// those methods as well, even if they don’t extend from it. Other classes that don’t extend from it and are organized
// in a different package have no access to them.
}
