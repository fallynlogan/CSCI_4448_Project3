package restaurant;

import java.util.*; 

public class Store {
    public Customer[] customers;
    public static HashMap<String, Integer> inventory;
    

    public Store(int numDays)
    {
        Random rand = new Random();

        System.out.println("Welcome to Molly's Mouthwatering Rolls! The simulation is about to begin.\n\n");
        inventory = new HashMap<String, Integer>();
        inventory.put("numSprRolls", 30);
        inventory.put("numEggRolls", 30);
        inventory.put("numPastryRolls",30);
        inventory.put("numSausageRolls", 30);
        inventory.put("numJellyRolls", 30);

        Menu ourMenu = new Menu();

        int rollsWanted = 0;

        for(int i=1 ; i<=numDays ; i++)
        {
            System.out.println("Today is Day " + i + ".");
            customers = CustomerFactory.createDailyCustomers();

            if(inventory.get("numSprRolls")<=0){
                inventory.put("numSprRolls",30);
            }
            if(inventory.get("numEggRolls")<=0){
                inventory.put("numEggRolls",30);
            }
            if(inventory.get("numPastryRolls")<=0){
                inventory.put("numPastryRolls",30);
            }
            if(inventory.get("numSausageRolls")<=0){
                inventory.put("numSausageRolls",30);
            }
            if(inventory.get("numJellyRolls")<=0){
                inventory.put("numJellyRolls",30);
            }


            System.out.println("The number of spring rolls at the beginning of Day " + i + " is " + inventory.get("numSprRolls") + ".");
            System.out.println("The number of egg rolls at the beginning of Day " + i + " is " + inventory.get("numEggRolls") + ".");
            System.out.println("The number of pastry rolls at the beginning of Day " + i + " is " + inventory.get("numPastryRolls") + ".");
            System.out.println("The number of sausage rolls at the beginning of Day " + i + " is " + inventory.get("numSausageRolls") + ".");
            System.out.println("The number of jelly rolls at the beginning of Day " + i + " is " + inventory.get("numJellyRolls") + ".");
            System.out.println("\n====================================================================================================\n");

            for(int j=0;j<customers.length;j++)
            {
                System.out.println(customers[j].getName() + " the " + customers[j].getClass().getSimpleName() + " has arrived at the store!");
                String sname = customers[j].getClass().getSimpleName();
                if(sname.equals("CasualCustomer"))
                {
                    rollsWanted = rand.nextInt(2)+1;
                }
                else if(sname.equals("BusinessCustomer")){
                    rollsWanted = 10;
                }
                else if(sname.equals("CateringCustomer"))
                {
                    rollsWanted = 15;
                }
                customers[j].purchaseRolls(rollsWanted);
                System.out.println("\n====================================================================================================\n"); //100 characters long to help see individual purchases clearer
            }

        }

    }
    

}