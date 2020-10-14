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
        rollOrder = new FoodItem[rollsWanted];

        int index = 0;

        int extraSauce, extraFill, extraTop, extraSauce2, extraFill2, extraTop2;

        if(!isCompleteOrder()){
            System.out.println("Sorry " + this.getName() + "! The order can not be fulfilled!");
            System.out.println(this.getName() + " exits the store.");
            this.rollsBought = 0;
        }
        else if(isCompleteOrder()){
            if(canPurchaseRoll("Spring Roll",2))
            {
                extraSauce = rand.nextInt(4); extraSauce2 = rand.nextInt(4);
                extraFill  = rand.nextInt(2); extraFill2 = rand.nextInt(2);
                extraTop  = rand.nextInt(3); extraTop2 = rand.nextInt(3);
                rollOrder[index] = new SpringRoll();
                rollOrder[index+1] = new SpringRoll();
                System.out.println(this.getName() +  " purchased a Spring Roll with " + extraSauce + " extra " + rollOrder[index].getSauceName() + ", " + extraFill + " extra " + rollOrder[index].getFillName() +
                        " filling, and " + extraTop + " extra " + rollOrder[index].getToppingName() + " topping.");
                System.out.println(this.getName() +  " purchased a Spring Roll with " + extraSauce2 + " extra " + rollOrder[index+1].getSauceName() + ", " + extraFill2 + " extra " + rollOrder[index+1].getFillName() +
                        " filling, and " + extraTop2 + " extra " + rollOrder[index+1].getToppingName() + " topping.");
                index = index+2;
                int currRolls = Store.inventory.get("numSprRolls");
                Store.inventory.put("numSprRolls",currRolls-2);
                if(currRolls-2==0){
                    System.out.println("ATTENTION! Spring Rolls are now currently unavailable. Sorry for the inconvenience!");
                }
            }
            if(canPurchaseRoll("Egg Roll",2))
            {
                extraSauce = rand.nextInt(4); extraSauce2 = rand.nextInt(4);
                extraFill  = rand.nextInt(2); extraFill2 = rand.nextInt(2);
                extraTop  = rand.nextInt(3); extraTop2 = rand.nextInt(3);
                rollOrder[index] = new EggRoll();
                rollOrder[index+1] = new EggRoll();
                System.out.println(this.getName() +  " purchased an Egg Roll with " + extraSauce + " extra " + rollOrder[index].getSauceName() + ", " + extraFill + " extra " + rollOrder[index].getFillName() +
                        " filling, and " + extraTop + " extra " + rollOrder[index].getToppingName() + " topping.");
                System.out.println(this.getName() +  " purchased an Egg Roll with " + extraSauce2 + " extra " + rollOrder[index+1].getSauceName() + ", " + extraFill2 + " extra " + rollOrder[index+1].getFillName() +
                        " filling, and " + extraTop2 + " extra " + rollOrder[index+1].getToppingName() + " topping.");
                index = index+2;
                int currRolls = Store.inventory.get("numEggRolls");
                Store.inventory.put("numEggRolls",currRolls-2);
                if(currRolls-2==0){
                    System.out.println("ATTENTION! Egg Rolls are now currently unavailable. Sorry for the inconvenience!");
                }
            }
            if(canPurchaseRoll("Pastry Roll", 2))
            {
                extraSauce = rand.nextInt(4); extraSauce2 = rand.nextInt(4);
                extraFill  = rand.nextInt(2); extraFill2 = rand.nextInt(2);
                extraTop  = rand.nextInt(3); extraTop2 = rand.nextInt(3);
                rollOrder[index] = new PastryRoll();
                rollOrder[index+1] = new PastryRoll();
                System.out.println(this.getName() +  " purchased a Pastry Roll with " + extraSauce + " extra " + rollOrder[index].getSauceName() + ", " + extraFill + " extra " + rollOrder[index].getFillName() +
                        " filling, and " + extraTop + " extra " + rollOrder[index].getToppingName() + " topping.");
                System.out.println(this.getName() +  " purchased a Pastry Roll with " + extraSauce2 + " extra " + rollOrder[index+1].getSauceName() + ", " + extraFill2 + " extra " + rollOrder[index+1].getFillName() +
                        " filling, and " + extraTop2 + " extra " + rollOrder[index+1].getToppingName() + " topping.");
                index = index+2;
                int currRolls = Store.inventory.get("numPastryRolls");
                Store.inventory.put("numPastryRolls",currRolls-2);
                if(currRolls-2==0){
                    System.out.println("ATTENTION! Pastry Rolls are now currently unavailable. Sorry for the inconvenience!");
                }
            }
            if(canPurchaseRoll("Sausage Roll",2))
            {
                extraSauce = rand.nextInt(4); extraSauce2 = rand.nextInt(4);
                extraFill  = rand.nextInt(2); extraFill2 = rand.nextInt(2);
                extraTop  = rand.nextInt(3); extraTop2 = rand.nextInt(3);
                rollOrder[index] = new SausageRoll();
                rollOrder[index+1] = new SausageRoll();
                System.out.println(this.getName() +  " purchased a Sausage Roll with " + extraSauce + " extra " + rollOrder[index].getSauceName() + ", " + extraFill + " extra " + rollOrder[index].getFillName() +
                        " filling, and " + extraTop + " extra " + rollOrder[index].getToppingName() + " topping.");
                System.out.println(this.getName() +  " purchased a Sausage Roll with " + extraSauce2 + " extra " + rollOrder[index+1].getSauceName() + ", " + extraFill2 + " extra " + rollOrder[index+1].getFillName() +
                        " filling, and " + extraTop2 + " extra " + rollOrder[index+1].getToppingName() + " topping.");
                index = index+2;
                int currRolls = Store.inventory.get("numSausageRolls");
                Store.inventory.put("numSausageRolls",currRolls-2);
                if(currRolls-2==0){
                    System.out.println("ATTENTION! Sausage Rolls are now currently unavailable. Sorry for the inconvenience!");
                }
            }
            if(canPurchaseRoll("Jelly Roll",2))
            {
                extraSauce = rand.nextInt(4); extraSauce2 = rand.nextInt(4);
                extraFill  = rand.nextInt(2); extraFill2 = rand.nextInt(2);
                extraTop  = rand.nextInt(3); extraTop2 = rand.nextInt(3);
                rollOrder[index] = new JellyRoll();
                rollOrder[index+1] = new JellyRoll();
                System.out.println(this.getName() +  " purchased a Jelly Roll with " + extraSauce + " extra " + rollOrder[index].getSauceName() + ", " + extraFill + " extra " + rollOrder[index].getFillName() +
                        " filling, and " + extraTop + " extra " + rollOrder[index].getToppingName() + " topping.");
                System.out.println(this.getName() +  " purchased a Jelly Roll with " + extraSauce2 + " extra " + rollOrder[index+1].getSauceName() + ", " + extraFill2 + " extra " + rollOrder[index+1].getFillName() +
                        " filling, and " + extraTop2 + " extra " + rollOrder[index+1].getToppingName() + " topping.");
                index = index+2;
                int currRolls = Store.inventory.get("numJellyRolls");
                Store.inventory.put("numJellyRolls",currRolls-2);
                if(currRolls-2==0){
                    System.out.println("ATTENTION! Jelly Rolls are now currently unavailable. Sorry for the inconvenience!");
                }
            }
        }
        this.rollsBought = 10;
    }
}
