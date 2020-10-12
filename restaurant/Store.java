package restaurant;

import java.util.*; 

public class Store {
    public Customer[] customers;
    public static HashMap<String, Integer> inventory;
    

    public Store(int numDays)
    {
        Random rand = new Random();

        System.out.println("Welcome to Molly's Mouthwatering Rolls! The simulation is about to begin.");
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
            System.out.println("The number of spring rolls at the beginning of Day " + i + " is " + inventory.get("numSprRolls") + ".");
            System.out.println("The number of egg rolls at the beginning of Day " + i + " is " + inventory.get("numEggRolls") + ".");
            System.out.println("The number of pastry rolls at the beginning of Day " + i + " is " + inventory.get("numPastryRolls") + ".");
            System.out.println("The number of sausage rolls at the beginning of Day " + i + " is " + inventory.get("numSausageRolls") + ".");
            System.out.println("The number of jelly rolls at the beginning of Day " + i + " is " + inventory.get("numJellyRolls") + ".");

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
            }

        }

    }
    

}