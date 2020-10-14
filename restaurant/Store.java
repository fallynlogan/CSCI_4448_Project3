package restaurant;

import java.util.*; 

public class Store {
    public Customer[] customers;
    public static HashMap<String, Integer> inventory;
    private Integer rollStartCount = 2;
    

    public Store(int numDays)
    {
        Random rand = new Random();

        System.out.println("---------- Welcome to Molly's Mouthwatering Rolls! The simulation is about to begin... ----------\n\n");
        inventory = new HashMap<String, Integer>();
        inventory.put("numSprRolls", rollStartCount);
        inventory.put("numEggRolls", rollStartCount);
        inventory.put("numPastryRolls",rollStartCount);
        inventory.put("numSausageRolls", rollStartCount);
        inventory.put("numJellyRolls", rollStartCount);

        Menu ourMenu = new Menu();
        /*MyUnitTests unitTests = new MyUnitTests();
        unitTests.eggRollCountTest();
        unitTests.eggRollPriceTest();
        unitTests.pastryRollCountTest();
        unitTests.pastryRollPriceTest();
        unitTests.jellyRollCountTest();
        unitTests.jellyRollPriceTest();
        unitTests.sausageRollCountTest();
        unitTests.sausageRollPriceTest();
        unitTests.springRollCountTest();
        unitTests.springRollPriceTest();*/

        int rollsWanted = 0;

        for(int i=1 ; i<=numDays ; i++)
        {
            System.out.println("Today is Day " + i + ".");
            customers = CustomerFactory.createDailyCustomers();

            if(inventory.get("numSprRolls")==0){
                inventory.put("numSprRolls",rollStartCount);
            }
            if(inventory.get("numEggRolls")==0){
                inventory.put("numEggRolls",rollStartCount);
            }
            if(inventory.get("numPastryRolls")==0){
                inventory.put("numPastryRolls",rollStartCount);
            }
            if(inventory.get("numSausageRolls")==0){
                inventory.put("numSausageRolls",rollStartCount);
            }
            if(inventory.get("numJellyRolls")==0){
                inventory.put("numJellyRolls",rollStartCount);
            }


            System.out.println("Spring Roll Stock: " + inventory.get("numSprRolls"));
            System.out.println("Egg Roll Stock: " + inventory.get("numEggRolls"));
            System.out.println("Pastry Roll Stock: " + inventory.get("numPastryRolls"));
            System.out.println("Sausage Roll Stock: " + inventory.get("numSausageRolls"));
            System.out.println("Jelly Roll Stock: " + inventory.get("numJellyRolls"));
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
                System.out.println(customers[j].getName() + " wants to buy " + rollsWanted + " roll(s).");
                customers[j].purchaseRolls(rollsWanted);
                customers[j].printReceipt();
                if(customers[j].checkInventorySoldOut()){
                    System.out.println("\n====================================================================================================\n");
                    break;
                }
                System.out.println("\n====================================================================================================\n"); //100 characters long to help see individual purchases clearer
            }
            System.out.println("\nInventory at the end of Day " + i + ".");
            System.out.println("Spring Roll Stock: " + inventory.get("numSprRolls"));
            System.out.println("Egg Roll Stock: " + inventory.get("numEggRolls"));
            System.out.println("Pastry Roll Stock: " + inventory.get("numPastryRolls"));
            System.out.println("Sausage Roll Stock: " + inventory.get("numSausageRolls"));
            System.out.println("Jelly Roll Stock: " + inventory.get("numJellyRolls"));
            System.out.println("\n====================================================================================================\n");
        }
    }

    public void startStore(){

    }

}