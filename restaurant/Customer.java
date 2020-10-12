package restaurant;

import java.util.Random;

public abstract class Customer{
    protected String name;
    public Customer() {

    }
    public String getName(){
        return name;
    }

    public Boolean canPurchaseRoll(String rollName, int numRolls)
    {
        Boolean x = false;
        if(rollName == "EggRoll") {
            if (Store.inventory.get("numEggRolls")-numRolls >= 0) {
                x = true;
            }
        }

        if(rollName =="SpringRoll"){
            if(Store.inventory.get("numSprRolls")-numRolls >= 0){
                x = true;
            }
        }
        if(rollName =="PastryRoll") {
            if(Store.inventory.get("numPastryRolls")-numRolls >= 0) {
                x = true;
            }
        }
        if(rollName =="SausageRoll"){
            if(Store.inventory.get("numSausageRolls")-numRolls >= 0) {
                x = true;
            }
        }
        if(rollName =="JellyRoll") {
            if(Store.inventory.get("numJellyRolls")-numRolls >= 0) {
                x = true;
            }
        }
        return x;
    }

    public abstract void purchaseRolls(int rollsWanted);

}
