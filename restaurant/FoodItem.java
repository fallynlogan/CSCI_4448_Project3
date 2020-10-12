package restaurant;

public abstract class FoodItem {
    protected String foodName;
    protected double foodPrice;
    protected double extraSaucePrice;
    protected double extraFillPrice;
    protected double extraTopPrice;

    public FoodItem(String rName, double rollPrice){
        this.foodName = rName;
        this.foodPrice = rollPrice;
    }

    public String getName()
    {
        return foodName;
    }

    public double getFoodPrice(){
        return foodPrice;
    }



}