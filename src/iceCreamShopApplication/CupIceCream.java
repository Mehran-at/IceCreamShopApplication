package iceCreamShopApplication;

//      Create the shop.CupIceCream class that extends the shop.IceCream abstract class.
public class CupIceCream extends IceCream {
//      Implement the eat method with the help of Intellij.
//      Return a sentence that fulfills the following format: “The <flavor> ice-cream with <topping> is eaten with a
// spoon”.
    @Override
    protected String eat() {
        return "The " + getFlavor()+ " ice-cream with "+ getTopping() + " is eaten with a spoon";
    }
//      Implement the constructor with the help of Intellij.
    public CupIceCream(String flavor, String topping) {
        super(flavor, topping);
    }
//      The reason why you’re compelled to implement it is because the shop.IceCream abstract class requires those values and
// because they are requested via the constructor, then all its children classes have to provide a constructor to be
// able to facilitate them.
}
