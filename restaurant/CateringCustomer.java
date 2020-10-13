package restaurant;


import java.util.Random;

public class CateringCustomer extends Customer {
    CateringCustomer(String n){
        this.name = n;
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
        String rollType1, rollType2, rollType3;        //Determining 3 random unique roll types by shuffling array of all roll types and picking first 3 in the array
        String[] types = {"SpringRoll","EggRoll","PastryRoll","SausageRoll","JellyRoll"};
        int[] prolls = possibleRolls();     //Order: SpringRolls, EggRolls, PastryRolls, SausageRolls, JellyRolls
        int possibleSpringRolls, possibleEggRolls, possiblePastryRolls, possibleSausageRolls, possibleJellyRolls;
        possibleSpringRolls = prolls[0]; possibleEggRolls = prolls[1]; possiblePastryRolls = prolls[2]; possibleSausageRolls = prolls[3]; possibleJellyRolls = prolls[4];
        int totalRollsAvailable = possibleSpringRolls + possibleEggRolls + possiblePastryRolls + possibleSausageRolls + possibleJellyRolls;

        FoodItem[] allRolls = new FoodItem[totalRollsAvailable];

        for(int i=0 ; i<types.length ; i++){
            int randomIndexToSwap = rand.nextInt(types.length);
            String temp = types[randomIndexToSwap];
            types[randomIndexToSwap] = types[i];
            types[i] = temp;
        }
        rollType1 = types[0]; rollType2 = types[1]; rollType3 = types[2];

        int index = 0;

        if(rollType1=="SpringRoll" || rollType2 == "SpringRoll" || rollType3=="SpringRoll")
        {

            for(int i=index ; i<index+possibleSpringRolls ; i++)
            {
                extraSauce = rand.nextInt(4); extraFill = rand.nextInt(2); extraTop = rand.nextInt(3);
                allRolls[i] = new SpringRoll();
                System.out.println(this.getName() + " purchased a Spring Roll with " + extraSauce + " extra sauces, " + extraFill + " extra fillings, and " + extraTop + " extra toppings.");
                int currRolls = Store.inventory.get("numSprRolls");
                Store.inventory.put("numSprRolls",currRolls-1);
            }
            index += possibleSpringRolls;
            if(possibleSpringRolls < 5){
                System.out.println("ATTENTION! Spring Rolls are now currently unavailable. Sorry for the inconvenience!");
            }
        }
        if(rollType1=="EggRoll" || rollType2 == "EggRoll" || rollType3=="EggRoll")
        {
            for(int i=index ; i<index+possibleEggRolls ; i++)
            {
                extraSauce = rand.nextInt(4); extraFill = rand.nextInt(2); extraTop = rand.nextInt(3);
                allRolls[i] = new EggRoll();
                System.out.println(this.getName() + " purchased an Egg Roll with " + extraSauce + " extra sauces, " + extraFill + " extra fillings, and " + extraTop + " extra toppings.");
                int currRolls = Store.inventory.get("numEggRolls");
                Store.inventory.put("numEggRolls",currRolls-1);
            }
            index += possibleEggRolls;
            if(possibleEggRolls < 5){
                System.out.println("ATTENTION! Egg Rolls are now currently unavailable. Sorry for the inconvenience!");
            }
        }
        if(rollType1=="PastryRoll" || rollType2 == "PastryRoll" || rollType3=="PastryRoll")
        {
            for(int i=index ; i<index+possiblePastryRolls ; i++)
            {
                extraSauce = rand.nextInt(4); extraFill = rand.nextInt(2); extraTop = rand.nextInt(3);
                allRolls[i] = new PastryRoll();
                System.out.println(this.getName() + " purchased a Pastry Roll with " + extraSauce + " extra sauces, " + extraFill + " extra fillings, and " + extraTop + " extra toppings.");
                int currRolls = Store.inventory.get("numPastryRolls");
                Store.inventory.put("numPastryRolls",currRolls-1);
            }
            index += possiblePastryRolls;
            if(possiblePastryRolls < 5){
                System.out.println("ATTENTION! Pastry Rolls are now currently unavailable. Sorry for the inconvenience!");
            }
        }
        if(rollType1=="SausageRoll" || rollType2 == "SausageRoll" || rollType3=="SausageRoll")
        {
            for(int i=index ; i<index+possibleSausageRolls ; i++)
            {
                extraSauce = rand.nextInt(4); extraFill = rand.nextInt(2); extraTop = rand.nextInt(3);
                allRolls[i] = new SausageRoll();
                System.out.println(this.getName() + " purchased a Sausage Roll with " + extraSauce + " extra sauces, " + extraFill + " extra fillings, and " + extraTop + " extra toppings.");
                int currRolls = Store.inventory.get("numSausageRolls");
                Store.inventory.put("numSausageRolls",currRolls-1);
            }
            index += possibleSausageRolls;
            if(possibleSausageRolls < 5){
                System.out.println("ATTENTION! Sausage Rolls are now currently unavailable. Sorry for the inconvenience!");
            }
        }
        if(rollType1=="JellyRoll" || rollType2 == "JellyRoll" || rollType3=="JellyRoll")
        {
            for(int i=index ; i<index+possibleJellyRolls ; i++)
            {
                extraSauce = rand.nextInt(4); extraFill = rand.nextInt(2); extraTop = rand.nextInt(3);
                allRolls[i] = new JellyRoll();
                System.out.println(this.getName() + " purchased a Jelly Roll with " + extraSauce + " extra sauces, " + extraFill + " extra fillings, and " + extraTop + " extra toppings.");
                int currRolls = Store.inventory.get("numJellyRolls");
                Store.inventory.put("numJellyRolls",currRolls-1);
            }
            index += possibleJellyRolls;
            if(possibleJellyRolls < 5){
                System.out.println("ATTENTION! Jelly Rolls are now currently unavailable. Sorry for the inconvenience!");
            }
        }
    }
}
