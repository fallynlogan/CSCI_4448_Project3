package restaurant;


import java.util.Random;

public class CasualCustomer extends Customer {
    CasualCustomer(String n){
        this.name = n;
    }

    public void purchaseRolls(int rollsWanted)
    {
        Random rand = new Random();

        FoodItem[] rolls = new FoodItem[rollsWanted];
        int rollType = 0;
        int index = 0;
        int soldOutFlag = 0;

        while(index<rollsWanted)
        {
            rollType = rand.nextInt(5) + 1;
            int extraSauce = rand.nextInt(4);
            int extraFill = rand.nextInt(2);
            int extraTop = rand.nextInt(3);

            if(rollType==1 && soldOutFlag<5)
            {
                //Spring Roll
                System.out.println(this.getName() + " wants a Spring Roll.");
                if(canPurchaseRoll("SpringRoll",1)){
                    rolls[index] = new SpringRoll();
                    index++;
                    System.out.println(this.getName() +  " purchased a Spring Roll with " + extraSauce + " extra sauces, " + extraFill + " extra fillings, and " + extraTop + " extra toppings.");
                    int currRolls = Store.inventory.get("numSprRolls");
                    Store.inventory.put("numSprRolls",currRolls-1);
                    if(Store.inventory.get("numSprRolls")==0){
                        System.out.println("ATTENTION! Spring Rolls are now currently unavailable. Sorry for the inconvenience!");
                    }
                }
                else{
                    System.out.println("Spring Rolls are currently SOLD OUT! Sorry " + this.getName() + "!");
                    soldOutFlag++;
                }
            }
            if(rollType==2 && soldOutFlag<5)
            {
                //Egg Roll
                System.out.println(this.getName() + " wants an Egg Roll.");
                if(canPurchaseRoll("EggRoll",1)){
                    rolls[index] = new EggRoll();
                    index++;
                    System.out.println(this.getName() + " purchased an Egg Roll with " + extraSauce + " extra sauce, " + extraFill + " extra filling, and " + extraTop + " extra toppings.");
                    int currRolls = Store.inventory.get("numEggRolls");
                    Store.inventory.put("numEggRolls",currRolls-1);
                    if(Store.inventory.get("numEggRolls")==0){
                        System.out.println("ATTENTION! Egg Rolls are now currently unavailable. Sorry for the inconvenience!");
                    }
                }
                else{
                    System.out.println("Egg Rolls are currently SOLD OUT! Sorry " + this.getName() + "!");
                    soldOutFlag++;
                }
            }
            if(rollType==3 && soldOutFlag<5)
            {
                //Pastry Roll
                System.out.println(this.getName() + " wants a Pastry Roll.");
                if(canPurchaseRoll("PastryRoll",1)){
                    rolls[index] = new PastryRoll();
                    index++;
                    System.out.println(this.getName() + " purchased a Pastry Roll with " + extraSauce + " extra sauce, " + extraFill + " extra filling, and " + extraTop + " extra toppings.");
                    int currRolls = Store.inventory.get("numPastryRolls");
                    Store.inventory.put("numPastryRolls",currRolls-1);
                    if(Store.inventory.get("numPastryRolls")==0){
                        System.out.println("ATTENTION! Pastry Rolls are now currently unavailable. Sorry for the inconvenience!");
                    }
                }
                else{
                    System.out.println("Pastry Rolls are currently SOLD OUT! Sorry " + this.getName() + "!");
                    soldOutFlag++;
                }
            }
            if(rollType==4 && soldOutFlag<5)
            {
                //Sausage Roll
                System.out.println(this.getName() + " wants a Sausage Roll.");
                if(canPurchaseRoll("SausageRoll",1)){
                    rolls[index] = new SausageRoll();
                    index++;
                    System.out.println(this.getName() + " purchased a Sausage Roll with " + extraSauce + " extra sauce, " + extraFill + " extra filling, and " + extraTop + " extra toppings.");
                    int currRolls = Store.inventory.get("numSausageRolls");
                    Store.inventory.put("numSausageRolls",currRolls-1);
                    if(Store.inventory.get("numSausageRolls")==0){
                        System.out.println("ATTENTION! Sausage Rolls are now currently unavailable. Sorry for the inconvenience!");
                    }
                }
                else{
                    System.out.println("Sausage Rolls are currently SOLD OUT! Sorry " + this.getName() + "!");
                    soldOutFlag++;
                }
            }
            if(rollType==5 && soldOutFlag<5)
            {
                //Jelly Roll
                System.out.println(this.getName() + " wants a Jelly Roll.");
                if(canPurchaseRoll("JellyRoll",1)){
                    rolls[index] = new JellyRoll();
                    index++;
                    System.out.println(this.getName() + " purchased a Jelly Roll with " + extraSauce + " extra sauce, " + extraFill + " extra filling, and " + extraTop + " extra toppings.");
                    int currRolls = Store.inventory.get("numJellyRolls");
                    Store.inventory.put("numJellyRolls",currRolls-1);
                    if(Store.inventory.get("numJellyRolls")==0){
                        System.out.println("ATTENTION! Jelly Rolls are now currently unavailable. Sorry for the inconvenience!");
                    }
                }
                else{
                    System.out.println("Jelly Rolls are currently SOLD OUT! Sorry " + this.getName() + "!");
                    soldOutFlag++;
                }
            }
            if(soldOutFlag==5){
                break;
            }
        }

    }

}
