package restaurant;


import java.util.Random;

public class BusinessCustomer extends Customer {
    BusinessCustomer(String n){
        this.name = n;
    }

    public void purchaseRolls(int rollsWanted)
    {
        Random rand = new Random();

        FoodItem[] rolls = new FoodItem[rollsWanted];
        int rollType = 0;
        int index = 0;

        while(index<rollsWanted)
        {
            rollType = rand.nextInt(5) + 1;
            if(rollType==1)
            {
                //Spring Roll
                if(canPurchaseRoll("SpringRoll")){
                    rolls[index] = new SpringRoll();
                    index++;
                    int currRolls = Store.inventory.get("numSprRolls");
                    Store.inventory.put("numSprRolls",currRolls-1);
                }
            }
            else if(rollType==2)
            {
                //Egg Roll
                if(canPurchaseRoll("EggRoll")){
                    rolls[index] = new EggRoll();
                    index++;
                }
            }
            else if(rollType==3)
            {
                //Pastry Roll
                if(canPurchaseRoll("PastryRoll")){
                    rolls[index] = new PastryRoll();
                    index++;
                }
            }
            else if(rollType==4)
            {
                //Sausage Roll
                if(canPurchaseRoll("SausageRoll")){
                    rolls[index] = new SausageRoll();
                    index++;
                }
            }
            else if(rollType==5)
            {
                //Jelly Roll
                if(canPurchaseRoll("JellyRoll")){
                    rolls[index] = new JellyRoll();
                    index++;
                }
            }
        }

        int extraSauce = rand.nextInt(4);
        int extraFill = rand.nextInt(2);
        int extraTop = rand.nextInt(3);

    }
}
