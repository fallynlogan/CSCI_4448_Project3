package restaurant;

public class SpringRoll extends FoodItem {
    
    SpringRoll()
    {
        super("Spring Roll", 3.50);
        this.extraFillPrice = 2.00;
        this.fillName = "Ground Pork";
        this.extraSaucePrice = 1.00;
        this.sauceName = "Peanut sauce";
        this.extraToppingPrice = 0.50;
        this.toppingName = "Shredded Carrots";
    }
    
}
