package restaurant;


import java.util.Random;

public class CateringCustomer extends Customer {
    CateringCustomer(String n){
        this.name = n;
    }

    public Boolean isSoldOut(FoodItem rollName) {
        Boolean x = false;
        if(rollName.getName()=="Spring Roll"){
            if(Store.inventory.get("numSprRolls")==0){ x = true; }
        }
        if(rollName.getName()=="Egg Roll"){
            if(Store.inventory.get("numEggRolls")==0){ x = true; }
        }
        if(rollName.getName()=="Pastry Roll") {
            if (Store.inventory.get("numPastryRolls") == 0) { x = true; }
        }
        if(rollName.getName()=="Sausage Roll"){
            if(Store.inventory.get("numSausageRolls")==0){ x = true; }
        }
        if(rollName.getName()=="Jelly Roll"){
            if(Store.inventory.get("numJellyRolls")==0){ x = true; }
        }
        return x;
    }

    private int[] possibleRolls(){
        int[] arr = new int[5];
        if(canPurchaseRoll("SpringRoll",5)){
            arr[0] = 5;
        }
        if(!canPurchaseRoll("SpringRoll",5)){
            arr[0] = Store.inventory.get("numSprRolls");
        }
        if(canPurchaseRoll("EggRoll",5)){
            arr[1] = 5;
        }
        if(!canPurchaseRoll("EggRoll",5)){
            arr[1] = Store.inventory.get("numEggRolls");
        }
        if(canPurchaseRoll("PastryRoll",5)){
            arr[2] = 5;
        }
        if(!canPurchaseRoll("PastryRoll",5)){
            arr[2] = Store.inventory.get("numPastryRolls");
        }
        if(canPurchaseRoll("SausageRoll",5)){
            arr[3] = 5;
        }
        if(!canPurchaseRoll("SausageRoll",5)){
            arr[3] = Store.inventory.get("numSausageRolls");
        }
        if(canPurchaseRoll("JellyRoll",5)){
            arr[4] = 5;
        }
        if(!canPurchaseRoll("JellyRoll",5)){
            arr[4] = Store.inventory.get("numJellyRolls");
        }
        return arr;
    }

    public void purchaseRolls(int rollsWanted)
    {
        Random rand = new Random();

        int extraSauce, extraFill, extraTop;
        FoodItem rollType1, rollType2, rollType3;        //Determining 3 random unique roll types by shuffling array of all roll types and picking first 3 in the array
        int[] prolls = possibleRolls();     //Order: SpringRolls, EggRolls, PastryRolls, SausageRolls, JellyRolls
        int possibleSpringRolls, possibleEggRolls, possiblePastryRolls, possibleSausageRolls, possibleJellyRolls;
        possibleSpringRolls = prolls[0]; possibleEggRolls = prolls[1]; possiblePastryRolls = prolls[2]; possibleSausageRolls = prolls[3]; possibleJellyRolls = prolls[4];
        int totalRollsAvailable = possibleSpringRolls + possibleEggRolls + possiblePastryRolls + possibleSausageRolls + possibleJellyRolls;

        rollOrder = new FoodItem[totalRollsAvailable];

        FoodItem[] types = new FoodItem[5];
        types[0] = new SpringRoll(); types[1] = new EggRoll(); types[2] = new PastryRoll(); types[3] = new SausageRoll(); types[4] = new JellyRoll();
        for(int i=0 ; i<types.length ; i++){
            int randomIndexToSwap = rand.nextInt(types.length);
            FoodItem temp = types[randomIndexToSwap];
            types[randomIndexToSwap] = types[i];
            types[i] = temp;
        }
        rollType1 = types[0]; rollType2 = types[1]; rollType3 = types[2];

        Boolean three = false; Boolean four = false;
        int currRolls;

        if(isSoldOut(rollType1)){
            System.out.println("Sorry " + this.getName() + " " + rollType1.getName() + "s are currently unavailable!");
            if(canPurchaseRoll(types[3].getName(),1)){
                System.out.println(this.getName() + " swaps out " + rollType1.getName() + "s for " + types[3].getName() + "s.");
                rollType1 = types[3];
                three = true;
            }
            else if(canPurchaseRoll(types[4].getName(),1)){
                System.out.println(this.getName() + " swaps out " + rollType1.getName() + "s for " + types[4].getName() + "s.");
                rollType1 = types[4];
                four = true;
            }
        }
        if(isSoldOut(rollType2)){
            System.out.println("Sorry " + this.getName() + " " + rollType2.getName() + "s are currently unavailable!");
            if(canPurchaseRoll(types[3].getName(),1) && !three){
                System.out.println(this.getName() + " swaps out " + rollType2.getName() + "s for " + types[3].getName() + "s.");
                rollType2 = types[3];
                three = true;
            }
            else if(canPurchaseRoll(types[4].getName(),1) && !four){
                System.out.println(this.getName() + " swaps out " + rollType2.getName() + "s for " + types[4].getName() + "s.");
                rollType2 = types[4];
                four = true;
            }
        }
        if(isSoldOut(rollType3)){
            System.out.println("Sorry " + this.getName() + " " + rollType3.getName() + "s are currently unavailable!");
            if(canPurchaseRoll(types[3].getName(),1) && !three){
                System.out.println(this.getName() + " swaps out " + rollType3.getName() + "s for " + types[3].getName() + "s.");
                rollType3 = types[3];
            }
            else if(canPurchaseRoll(types[4].getName(),1) && !four){
                System.out.println(this.getName() + " swaps out " + rollType3.getName() + "s for " + types[4].getName() + "s.");
                rollType3 = types[4];
            }
        }

        int index = 0;

        if(rollType1.getName()=="Spring Roll" || rollType2.getName() == "Spring Roll" || rollType3.getName()=="Spring Roll")
        {

            for(int i=0 ; i<possibleSpringRolls ; i++)
            {
                extraSauce = rand.nextInt(4); extraFill = rand.nextInt(2); extraTop = rand.nextInt(3);
                rollOrder[index] = new SpringRoll();
                System.out.println(this.getName() +  " purchased a Spring Roll with " + extraSauce + " extra " + rollOrder[index].getSauceName() + ", " + extraFill + " extra " + rollOrder[index].getFillName() +
                        " filling, and " + extraTop + " extra " + rollOrder[index].getToppingName() + " topping.");
                index++;
                currRolls = Store.inventory.get("numSprRolls");
                Store.inventory.put("numSprRolls",currRolls-1);
            }
            if(Store.inventory.get("numSprRolls")==0 && possibleSpringRolls>0){
                System.out.println("ATTENTION! Spring Rolls are now currently unavailable. Sorry for the inconvenience!");
            }
        }
        if(rollType1.getName()=="Egg Roll" || rollType2.getName() == "Egg Roll" || rollType3.getName()=="Egg Roll")
        {
            for(int i=0 ; i<possibleEggRolls ; i++)
            {
                extraSauce = rand.nextInt(4); extraFill = rand.nextInt(2); extraTop = rand.nextInt(3);
                rollOrder[index] = new EggRoll();
                System.out.println(this.getName() +  " purchased an Egg Roll with " + extraSauce + " extra " + rollOrder[index].getSauceName() + ", " + extraFill + " extra " + rollOrder[index].getFillName() +
                        " filling, and " + extraTop + " extra " + rollOrder[index].getToppingName() + " topping.");
                index++;
                currRolls = Store.inventory.get("numEggRolls");
                Store.inventory.put("numEggRolls",currRolls-1);
            }
            if(Store.inventory.get("numEggRolls")==0 && possibleEggRolls>0){
                System.out.println("ATTENTION! Egg Rolls are now currently unavailable. Sorry for the inconvenience!");
            }
        }
        if(rollType1.getName()=="Pastry Roll" || rollType2.getName() == "Pastry Roll" || rollType3.getName()=="Pastry Roll")
        {
            for(int i=0 ; i<possiblePastryRolls ; i++)
            {
                extraSauce = rand.nextInt(4); extraFill = rand.nextInt(2); extraTop = rand.nextInt(3);
                this.rollOrder[index] = new PastryRoll();
                System.out.println(this.getName() +  " purchased a Pastry Roll with " + extraSauce + " extra " + rollOrder[index].getSauceName() + ", " + extraFill + " extra " + rollOrder[index].getFillName() +
                        " filling, and " + extraTop + " extra " + rollOrder[index].getToppingName() + " topping.");
                index++;
                currRolls = Store.inventory.get("numPastryRolls");
                Store.inventory.put("numPastryRolls",currRolls-1);
            }
            if(Store.inventory.get("numPastryRolls")==0 && possiblePastryRolls>0){
                System.out.println("ATTENTION! Pastry Rolls are now currently unavailable. Sorry for the inconvenience!");
            }
        }
        if(rollType1.getName()=="Sausage Roll" || rollType2.getName() == "Sausage Roll" || rollType3.getName()=="Sausage Roll")
        {
            for(int i=0 ; i<possibleSausageRolls ; i++)
            {
                extraSauce = rand.nextInt(4); extraFill = rand.nextInt(2); extraTop = rand.nextInt(3);
                this.rollOrder[index] = new SausageRoll();
                System.out.println(this.getName() +  " purchased a Sausage Roll with " + extraSauce + " extra " + rollOrder[index].getSauceName() + ", " + extraFill + " extra " + rollOrder[index].getFillName() +
                        " filling, and " + extraTop + " extra " + rollOrder[index].getToppingName() + " topping.");
                index++;
                currRolls = Store.inventory.get("numSausageRolls");
                Store.inventory.put("numSausageRolls",currRolls-1);
            }
            if(Store.inventory.get("numSausageRolls")==0 && possibleSausageRolls>0){
                System.out.println("ATTENTION! Sausage Rolls are now currently unavailable. Sorry for the inconvenience!");
            }
        }
        if(rollType1.getName()=="Jelly Roll" || rollType2.getName() == "Jelly Roll" || rollType3.getName()=="Jelly Roll")
        {
            for(int i=0 ; i<possibleJellyRolls ; i++)
            {
                extraSauce = rand.nextInt(4); extraFill = rand.nextInt(2); extraTop = rand.nextInt(3);
                rollOrder[index] = new JellyRoll();
                System.out.println(this.getName() +  " purchased a Jelly Roll with " + extraSauce + " extra " + rollOrder[index].getSauceName() + ", " + extraFill + " extra " + rollOrder[index].getFillName() +
                        " filling, and " + extraTop + " extra " + rollOrder[index].getToppingName() + " topping.");
                index++;
                currRolls = Store.inventory.get("numJellyRolls");
                Store.inventory.put("numJellyRolls",currRolls-1);
            }
            if(Store.inventory.get("numJellyRolls")==0 && possibleJellyRolls>0){
                System.out.println("ATTENTION! Jelly Rolls are now currently unavailable. Sorry for the inconvenience!");
            }
        }
        this.rollsBought = index;
    }
}
