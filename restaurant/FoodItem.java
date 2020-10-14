package restaurant;

public abstract class FoodItem {

    protected String rollName; protected double rollPrice;
    protected String sauceName; protected double extraSaucePrice; protected int sauceQuantity;
    protected String fillName; protected double extraFillPrice; protected int fillQuantity;
    protected String toppingName; protected double extraToppingPrice; protected int toppingQuantity;

    protected double totalPrice;

    public FoodItem(String rName, double rollP){
        this.rollName = rName;
        this.rollPrice = rollP;
        this.totalPrice = rollP;
    }

    public String getName()
    {
        return rollName;
    }
    public double getFoodPrice(){
        return rollPrice;
    }
    public String getSauceName() { return sauceName; }
    public double getSaucePrice() { return extraSaucePrice; }
    public int getSauceQuantity() { return sauceQuantity; }
    public String getFillName() { return fillName; }
    public double getFillPrice() { return extraFillPrice; }
    public int getFillQuantity() { return fillQuantity; }
    public String getToppingName() { return toppingName; }
    public double getExtraToppingPrice() { return extraToppingPrice; }
    public int getToppingQuantity() { return toppingQuantity; }

    public double getTotalPriceSingleRoll(){
        return rollPrice + (sauceQuantity*extraSaucePrice) + (toppingQuantity*extraToppingPrice) + (fillQuantity*extraFillPrice);
    }




}