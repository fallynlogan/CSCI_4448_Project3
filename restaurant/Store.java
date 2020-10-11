package restaurant;

public class Store {

    int numSpring;
    int numEgg;
    int numPastry;
    int numSausage;
    int numJelly;

    public Store(int numDays)
    {
        System.out.println("Welcome to Molly's Mouthwatering Rolls! The simulation is about to begin.");

        numSpring = 30;
        numEgg = 30;
        numPastry = 30;
        numSausage = 30;
        numJelly = 30;

        Menu ourMenu = new Menu();

        for(int i=1 ; i<=numDays ; i++)
        {
            System.out.println("Today is Day " + i + ".");
        }

    }
    

}