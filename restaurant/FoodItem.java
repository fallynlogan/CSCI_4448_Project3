package restaurant;

public abstract class FoodItem {
    protected String foodName;
    protected double foodPrice;
    protected int extraSaucePrice;
    protected int extraFillPrice;
    protected int extraTopPrice;

    public FoodItem(String rName, double rollPrice){
        this.foodName = rName;
        this.foodPrice = rollPrice;
    }

    

    public double getFoodPrice(){
        return foodPrice;
    }
    /*
    public String getName(){
        return this.foodName;
    }

    public int getExtraSaucPrice(){
        return extraSaucePrice;
    }

    public int getExtraFilPrice(){
        return extraFillPrice;
    }

    public int getExtraTopPrice(){
        return extraTopPrice;
    }


     */

}