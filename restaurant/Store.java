package restaurant;

public class Store {

    public int numSpring;
    public int numEgg;
    public int numPastry;
    public int numSausage;
    public int numJelly;

    public Store(int numDays)
    {
        System.out.println("Welcome to Molly's Mouthwatering Rolls! The simulation is about to begin.");

        numSpring = 30;
        numEgg = 30;
        numPastry = 30;
        numSausage = 30;
        numJelly = 30;

        Menu ourMenu = new Menu();
        CustomerFactory cf = new CustomerFactory();

        for(int i=1 ; i<=numDays ; i++)
        {
            System.out.println("Today is Day " + i + ".");
            Customer[] customers = cf.createDailyCustomers();
            for(int j=0;j<customers.length;j++)
            {
                System.out.println(customers[j].getName() + " has arrived at the store!");
            }

        }

    }
    

}