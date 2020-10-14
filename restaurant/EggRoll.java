package restaurant;

public class EggRoll extends FoodItem {
    EggRoll()
    {
        super("Egg Roll", 3.50);
        this.extraFillPrice = 1.50;
        this.fillName = "Ground Pork";
        this.extraSaucePrice = 1.00;
        this.sauceName = "Sweet & Sour sauce";
        this.extraToppingPrice = 0.50;
        this.toppingName = "Shredded Cabbage";
    }
}
