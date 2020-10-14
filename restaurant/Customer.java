package restaurant;

import java.text.DecimalFormat;
import java.util.Random;

public abstract class Customer{
    protected String name;
    public static FoodItem[] rollOrder;
    public int rollsBought;
    double totalSpent;

    public Customer() {
        rollsBought = 0;
        totalSpent = 0.0;
    }
    public String getName(){
        return name;
    }

    public double calculateTotalOrderPrice(){
        double total = 0.0;
        rollsBought = 0;
        for(int i=0 ; i<rollsBought ; i++){
            total = total + rollOrder[i].getTotalPriceSingleRoll();
        }
        return total;
    }




    public Boolean canPurchaseRoll(String rollName, int numRolls)
    {
        Boolean x = false;
        if(rollName == "Egg Roll") {
            if (Store.inventory.get("numEggRolls")-numRolls >= 0) {
                x = true;
            }
        }

        if(rollName =="Spring Roll"){
            if(Store.inventory.get("numSprRolls")-numRolls >= 0){
                x = true;
            }
        }
        if(rollName =="Pastry Roll") {
            if(Store.inventory.get("numPastryRolls")-numRolls >= 0) {
                x = true;
            }
        }
        if(rollName =="Sausage Roll"){
            if(Store.inventory.get("numSausageRolls")-numRolls >= 0) {
                x = true;
            }
        }
        if(rollName =="Jelly Roll") {
            if(Store.inventory.get("numJellyRolls")-numRolls >= 0) {
                x = true;
            }
        }
        return x;
    }


    public Boolean checkInventorySoldOut()
    {
        int springRoll, eggRoll, pastryRoll, sausageRoll, jellyRoll;
        springRoll = Store.inventory.get("numSprRolls");
        eggRoll = Store.inventory.get("numEggRolls");
        pastryRoll = Store.inventory.get("numPastryRolls");
        sausageRoll = Store.inventory.get("numSausageRolls");
        jellyRoll = Store.inventory.get("numJellyRolls");
        if(springRoll==0 && eggRoll==0 && pastryRoll==0 && sausageRoll==0 && jellyRoll==0){
            System.out.println("THE STORE IS CURRENTLY SOLD OUT OF ROLLS AND IS CLOSING! See you tomorrow!");
            return true;
        }
        else{
            return false;
        }
    }

    public abstract void purchaseRolls(int rollsWanted);

}
