package restaurant;

import java.util.Random;

public abstract class Customer{
    protected String name;
    public Customer() {

    }
    public String getName(){
        return name;
    }

    public Boolean canPurchaseRoll(String rollName)
    {
        Boolean x = false;
        if(rollName == "EggRoll") {
            if (Store.inventory.get("numEggRolls") > 0) {
                x = true;
            }
        }

        if(rollName =="SpringRoll"){
            if(Store.inventory.get("numSprRolls") > 0){
                x = true;
            }
        }
        if(rollName =="PastryRoll") {
            if(Store.inventory.get("numPastryRolls") > 0) {
                x = true;
            }
        }
        if(rollName =="SausageRoll"){
            if(Store.inventory.get("numSausageRolls") > 0) {
                x = true;
            }
        }
        if(rollName =="JellyRoll") {
            if(Store.inventory.get("numJellyRolls") > 0) {
                x = true;
            }
        }
        return x;
    }

    public abstract void purchaseRolls(int rollsWanted);

}
