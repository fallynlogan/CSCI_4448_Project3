package restaurant;

import java.util.*; 

public class Store {
    public Customer[] customers;
    public HashMap<String, ArrayList<FoodItem>> inventory;
    

    public Store(int numDays)
    {
        System.out.println("Welcome to Molly's Mouthwatering Rolls! The simulation is about to begin.");
        inventory = new HashMap<String, ArrayList<FoodItem>>();
        inventory.put("numSprRolls", new ArrayList<FoodItem>());
        inventory.put("numEggRolls", new ArrayList<FoodItem>());
        inventory.put("numPastryRolls",new ArrayList<FoodItem>());
        inventory.put("numSausageRolls", new ArrayList<FoodItem>());
        inventory.put("numJellyRolls", new ArrayList<FoodItem>());

        Menu ourMenu = new Menu();

        for(int i=1 ; i<=numDays ; i++)
        {
            System.out.println("Today is Day " + i + ".");
            customers = CustomerFactory.createDailyCustomers();

            for(int j=0;j<customers.length;j++)
            {
                System.out.println(customers[j].getName() + " the " + customers[j].getClass().getSimpleName() + " has arrived at the store!");
                System.out.println("The number of spring rolls at the beginning of Day " + i + " is " + inventory.get("numSprRolls").size());
                System.out.println("The number of egg rolls at the beginning of Day " + i + " is " + inventory.get("numEggRolls").size());
                System.out.println("The number of pastry rolls at the beginning of Day " + i + " is " + inventory.get("numPastryRolls").size());
                System.out.println("The number of sausage rolls at the beginning of Day " + i + " is " + inventory.get("numSausageRolls").size());
                System.out.println("The number of jelly rolls at the beginning of Day " + i + " is " + inventory.get("numJellyRolls").size());
            }

        }

    }
    

}