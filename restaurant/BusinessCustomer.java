package restaurant;

import java.util.Random;

public class BusinessCustomer extends Customer {
    BusinessCustomer(String n){
        this.name = n;
    }

    private Boolean isCompleteOrder(){
        Boolean x = true;

        if(Store.inventory.get("numSprRolls") < 2) { x = false; }
        if(Store.inventory.get("numEggRolls") < 2) { x = false; }
        if(Store.inventory.get("numPastryRolls") < 2) { x = false; }
        if(Store.inventory.get("numSausageRolls") < 2) { x = false; }
        if(Store.inventory.get("numJellyRolls") < 2) { x = false; }

        return x;
    }

    public void purchaseRolls(int rollsWanted)
    {
        Random rand = new Random();

        FoodItem[] allRolls = new FoodItem[rollsWanted];
        int index = 0;

        int extraSauce, extraFill, extraTop, extraSauce2, extraFill2, extraTop2;

        if(!isCompleteOrder()){
            System.out.println("Sorry " + this.getName() + "! The order can not be fulfilled!");
            System.out.println(this.getName() + " exits the store.");
        }
        else if(isCompleteOrder()){
            if(canPurchaseRoll("SpringRoll",2))
            {
                extraSauce = rand.nextInt(4); extraSauce2 = rand.nextInt(4);
                extraFill  = rand.nextInt(2); extraFill2 = rand.nextInt(2);
                extraTop  = rand.nextInt(3); extraTop2 = rand.nextInt(3);
                allRolls[index] = new SpringRoll();
                allRolls[index+1] = new SpringRoll();
                index = index+2;
                int currRolls = Store.inventory.get("numSprRolls");
                Store.inventory.put("numSprRolls",currRolls-2);
                System.out.println(this.getName() + " purchased a Spring Roll with " + extraSauce + " extra sauces, " + extraFill + " extra fillings, and " + extraTop + " extra toppings.");
                System.out.println(this.getName() + " purchased a Spring Roll with " + extraSauce2 + " extra sauces, " + extraFill2 + " extra fillings, and " + extraTop2 + " extra toppings.");
                if(currRolls-2==0){
                    System.out.println("ATTENTION! Spring Rolls are now currently unavailable. Sorry for the inconvenience!");
                }
            }
            if(canPurchaseRoll("EggRoll",2))
            {
                extraSauce = rand.nextInt(4); extraSauce2 = rand.nextInt(4);
                extraFill  = rand.nextInt(2); extraFill2 = rand.nextInt(2);
                extraTop  = rand.nextInt(3); extraTop2 = rand.nextInt(3);
                allRolls[index] = new EggRoll();
                allRolls[index+1] = new EggRoll();
                index = index+2;
                int currRolls = Store.inventory.get("numEggRolls");
                Store.inventory.put("numEggRolls",currRolls-2);
                System.out.println(this.getName() + " purchased an Egg Roll with " + extraSauce + " extra sauces, " + extraFill + " extra fillings, and " + extraTop + " extra toppings.");
                System.out.println(this.getName() + " purchased an Egg Roll with " + extraSauce2 + " extra sauces, " + extraFill2 + " extra fillings, and " + extraTop2 + " extra toppings.");
                if(currRolls-2==0){
                    System.out.println("ATTENTION! Egg Rolls are now currently unavailable. Sorry for the inconvenience!");
                }
            }
            if(canPurchaseRoll("PastryRoll", 2))
            {
                extraSauce = rand.nextInt(4); extraSauce2 = rand.nextInt(4);
                extraFill  = rand.nextInt(2); extraFill2 = rand.nextInt(2);
                extraTop  = rand.nextInt(3); extraTop2 = rand.nextInt(3);
                allRolls[index] = new PastryRoll();
                allRolls[index+1] = new PastryRoll();
                index = index+2;
                int currRolls = Store.inventory.get("numPastryRolls");
                Store.inventory.put("numPastryRolls",currRolls-2);
                System.out.println(this.getName() + " purchased a Pastry Roll with " + extraSauce + " extra sauces, " + extraFill + " extra fillings, and " + extraTop + " extra toppings.");
                System.out.println(this.getName() + " purchased a Pastry Roll with " + extraSauce2 + " extra sauces, " + extraFill2 + " extra fillings, and " + extraTop2 + " extra toppings.");
                if(currRolls-2==0){
                    System.out.println("ATTENTION! Pastry Rolls are now currently unavailable. Sorry for the inconvenience!");
                }
            }
            if(canPurchaseRoll("SausageRoll",2))
            {
                extraSauce = rand.nextInt(4); extraSauce2 = rand.nextInt(4);
                extraFill  = rand.nextInt(2); extraFill2 = rand.nextInt(2);
                extraTop  = rand.nextInt(3); extraTop2 = rand.nextInt(3);
                allRolls[index] = new SausageRoll();
                allRolls[index+1] = new SausageRoll();
                index = index+2;
                int currRolls = Store.inventory.get("numSausageRolls");
                Store.inventory.put("numSausageRolls",currRolls-2);
                System.out.println(this.getName() + " purchased a Sausage Roll with " + extraSauce + " extra sauces, " + extraFill + " extra fillings, and " + extraTop + " extra toppings.");
                System.out.println(this.getName() + " purchased a Sausage Roll with " + extraSauce2 + " extra sauces, " + extraFill2 + " extra fillings, and " + extraTop2 + " extra toppings.");
                if(currRolls-2==0){
                    System.out.println("ATTENTION! Sausage Rolls are now currently unavailable. Sorry for the inconvenience!");
                }
            }
            if(canPurchaseRoll("JellyRoll",2))
            {
                extraSauce = rand.nextInt(4); extraSauce2 = rand.nextInt(4);
                extraFill  = rand.nextInt(2); extraFill2 = rand.nextInt(2);
                extraTop  = rand.nextInt(3); extraTop2 = rand.nextInt(3);
                allRolls[index] = new JellyRoll();
                allRolls[index+1] = new JellyRoll();
                index = index+2;
                int currRolls = Store.inventory.get("numJellyRolls");
                Store.inventory.put("numJellyRolls",currRolls-2);
                System.out.println(this.getName() + " purchased a Jelly Roll with " + extraSauce + " extra sauces, " + extraFill + " extra fillings, and " + extraTop + " extra toppings.");
                System.out.println(this.getName() + " purchased a Jelly Roll with " + extraSauce2 + " extra sauces, " + extraFill2 + " extra fillings, and " + extraTop2 + " extra toppings.");
                if(currRolls-2==0){
                    System.out.println("ATTENTION! Jelly Rolls are now currently unavailable. Sorry for the inconvenience!");
                }
            }
        }




    }
}
