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

    public Boolean isSoldOut(String rollName) {
        Boolean x = false;
        if(rollName=="SpringRoll"){
            if(Store.inventory.get("numSprRolls")==0){ x = true; }
        }
        if(rollName=="EggRoll"){
            if(Store.inventory.get("numEggRolls")==0){ x = true; }
        }
        if(rollName=="PastryRoll") {
            if (Store.inventory.get("numPastryRolls") == 0) { x = true; }
        }
        if(rollName=="SausageRoll"){
            if(Store.inventory.get("numSausageRolls")==0){ x = true; }
        }
        if(rollName=="JellyRoll"){
            if(Store.inventory.get("numJellyRolls")==0){ x = true; }
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
