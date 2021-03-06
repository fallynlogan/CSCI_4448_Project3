package restaurant;


import java.util.Random;

public class CasualCustomer extends Customer {
    CasualCustomer(String n){
        this.name = n;
    }

    public void purchaseRolls(int rollsWanted)
    {
        Random rand = new Random();

        rollOrder = new FoodItem[rollsWanted];
        rollsBought = 0;

        int rollType = 0;
        int index = 0;

        while(rollsBought<rollsWanted)
        {
            rollType = rand.nextInt(5) + 1;
            int extraSauce = rand.nextInt(4);
            int extraFill = rand.nextInt(2);
            int extraTop = rand.nextInt(3);

            if(rollType==1)
            {
                //Spring Roll
                System.out.println(this.getName() + " wants a Spring Roll.");
                if(canPurchaseRoll("Spring Roll",1)){
                    rollOrder[index] = new SpringRoll();
                    System.out.println(this.getName() +  " purchased a Spring Roll with " + extraSauce + " extra " + rollOrder[index].getSauceName() + ", " + extraFill + " extra " + rollOrder[index].getFillName() +
                            " filling, and " + extraTop + " extra " + rollOrder[index].getToppingName() + " topping.");
                    index++;
                    int currRolls = Store.inventory.get("numSprRolls");
                    Store.inventory.put("numSprRolls",currRolls-1);
                    if(Store.inventory.get("numSprRolls")==0){
                        System.out.println("ATTENTION! Spring Rolls are now currently unavailable. Sorry for the inconvenience!");
                    }
                    rollsBought++;
                }
                else{
                    System.out.println("Spring Rolls are currently SOLD OUT! Sorry " + this.getName() + "!");
                }
            }
            else if(rollType==2)
            {
                //Egg Roll
                System.out.println(this.getName() + " wants an Egg Roll.");
                if(canPurchaseRoll("Egg Roll",1)){
                    rollOrder[index] = new EggRoll();
                    System.out.println(this.getName() +  " purchased an Egg Roll with " + extraSauce + " extra " + rollOrder[index].getSauceName() + ", " + extraFill + " extra " + rollOrder[index].getFillName() +
                            " filling, and " + extraTop + " extra " + rollOrder[index].getToppingName() + " topping.");
                    index++;
                    int currRolls = Store.inventory.get("numEggRolls");
                    Store.inventory.put("numEggRolls",currRolls-1);
                    if(Store.inventory.get("numEggRolls")==0){
                        System.out.println("ATTENTION! Egg Rolls are now currently unavailable. Sorry for the inconvenience!");
                    }
                    rollsBought++;
                }
                else{
                    System.out.println("Egg Rolls are currently SOLD OUT! Sorry " + this.getName() + "!");
                }
            }
            else if(rollType==3)
            {
                //Pastry Roll
                System.out.println(this.getName() + " wants a Pastry Roll.");
                if(canPurchaseRoll("Pastry Roll",1)){
                    rollOrder[index] = new PastryRoll();
                    System.out.println(this.getName() +  " purchased a Pastry Roll with " + extraSauce + " extra " + rollOrder[index].getSauceName() + ", " + extraFill + " extra " + rollOrder[index].getFillName() +
                            " filling, and " + extraTop + " extra " + rollOrder[index].getToppingName() + " topping.");
                    index++;
                    int currRolls = Store.inventory.get("numPastryRolls");
                    Store.inventory.put("numPastryRolls",currRolls-1);
                    if(Store.inventory.get("numPastryRolls")==0){
                        System.out.println("ATTENTION! Pastry Rolls are now currently unavailable. Sorry for the inconvenience!");
                    }
                    rollsBought++;
                }
                else{
                    System.out.println("Pastry Rolls are currently SOLD OUT! Sorry " + this.getName() + "!");
                }
            }
            else if(rollType==4)
            {
                //Sausage Roll
                System.out.println(this.getName() + " wants a Sausage Roll.");
                if(canPurchaseRoll("Sausage Roll",1)){
                    rollOrder[index] = new SausageRoll();
                    System.out.println(this.getName() +  " purchased a Sausage Roll with " + extraSauce + " extra " + rollOrder[index].getSauceName() + ", " + extraFill + " extra " + rollOrder[index].getFillName() +
                            " filling, and " + extraTop + " extra " + rollOrder[index].getToppingName() + " topping.");
                    index++;
                    int currRolls = Store.inventory.get("numSausageRolls");
                    Store.inventory.put("numSausageRolls",currRolls-1);
                    if(Store.inventory.get("numSausageRolls")==0){
                        System.out.println("ATTENTION! Sausage Rolls are now currently unavailable. Sorry for the inconvenience!");
                    }
                    rollsBought++;
                }
                else{
                    System.out.println("Sausage Rolls are currently SOLD OUT! Sorry " + getName() + "!");
                }
            }
            else if(rollType==5)
            {
                //Jelly Roll
                System.out.println(getName() + " wants a Jelly Roll.");
                if(canPurchaseRoll("Jelly Roll",1)){
                    rollOrder[index] = new JellyRoll();
                    System.out.println(this.getName() +  " purchased a Jelly Roll with " + extraSauce + " extra " + rollOrder[index].getSauceName() + ", " + extraFill + " extra " + rollOrder[index].getFillName() +
                            " filling, and " + extraTop + " extra " + rollOrder[index].getToppingName() + " topping.");
                    index++;
                    int currRolls = Store.inventory.get("numJellyRolls");
                    Store.inventory.put("numJellyRolls",currRolls-1);
                    if(Store.inventory.get("numJellyRolls")==0){
                        System.out.println("ATTENTION! Jelly Rolls are now currently unavailable. Sorry for the inconvenience!");
                    }
                    rollsBought++;
                }
                else{
                    System.out.println("Jelly Rolls are currently SOLD OUT! Sorry " + this.getName() + "!");
                }
            }
        }
    }
}
