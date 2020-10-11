package restaurant;

public class FoodItem {
    protected String foodName;
    protected double foodPrice;
    protected int extraSaucPrice;
    protected int extraFilPrice;
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
        return extraSaucPrice;
    }

    public int getExtraFilPrice(){
        return extraFilPrice;
    }

    public int getExtraTopPrice(){
        return extraTopPrice;
    }


     */

}