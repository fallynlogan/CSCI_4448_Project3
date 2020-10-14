package restaurant;

public class SausageRoll extends FoodItem {

    SausageRoll()
    {
        super("Sausage Roll", 4.25);
        this.extraFillPrice = 2.00;
        this.fillName = "Italian Sausage";
        this.extraSaucePrice = 1.00;
        this.sauceName = "Marinara sauce";
        this.extraToppingPrice = 1.50;
        this.toppingName = "Mozzarella Cheese";
    }
    
}
