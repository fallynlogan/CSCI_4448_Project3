package restaurant;


import java.util.Random;

public class CateringCustomer extends Customer {
    CateringCustomer(String n){
        this.name = n;
    }

    public void purchaseRolls(int rollsWanted)
    {
        Random rand = new Random();

        int extraSauce = rand.nextInt(4);
        int extraFill = rand.nextInt(2);
        int extraTop = rand.nextInt(3);



    }

}
