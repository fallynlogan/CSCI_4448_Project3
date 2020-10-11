package restaurant;

public class FoodItem {
    protected String foodName;
    protected int foodPrice;
    protected int extraSaucPrice;
    protected int extraFilPrice;
    protected int extraTopPrice;

    public FoodItem(String rName, int rollPrice, int xSaucPr, int xFilPr, int xTopPr){
        this.foodName = rName;
        this.foodPrice = rollPrice;
        //not sure if necessary
        this.extraSaucPrice = xSaucPr;
        this.extraFilPrice = xFilPr;
        this.extraTopPrice = xTopPr;
    }

    /*

    public int getFoodPrice(){
        return foodPrice;
    }

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