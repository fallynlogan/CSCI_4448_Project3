package restaurant;

public class PastryRoll extends FoodItem {
    PastryRoll()
    {
        super("Pastry Roll", 3.00);
        this.extraFillPrice = 0.25;
        this.fillName = "Raspberry Jam";
        this.extraSaucePrice = 0.50;
        this.sauceName = "Dark Chocolate sauce";
        this.extraToppingPrice = 0.25;
        this.toppingName = "Powdered Sugar";
    }
    
}
