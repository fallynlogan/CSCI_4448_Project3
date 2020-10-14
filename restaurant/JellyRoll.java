package restaurant;

public class JellyRoll extends FoodItem {
    JellyRoll()
    {
        super("Jelly Roll", 2.75);
        this.extraFillPrice = 0.25;
        this.fillName = "Apricot Jelly";
        this.extraSaucePrice = 1.00;
        this.sauceName = "Cranberry sauce";
        this.extraToppingPrice = 0.50;
        this.toppingName = "Powdered Sugar";
    }
    
}
