package restaurant;

import junit.framework.*;

public class MyUnitTests {

    @Tests

    public void eggRollPriceTest()
    {
        EggRoll eggRoll = new EggRoll();
        Double price = eggRoll.getFoodPrice();
        assertEquals(3.50, price);
    }

    public void pastryRollPriceTest()
    {
        PastryRoll pastryRoll = new PastryRoll();
        Double price = pastryRoll.getFoodPrice();
        assertEquals(3.00, price);

    }

    public void sausageRollPriceTest()
    {
       SausageRoll sausageRoll = new SausageRoll();
       Double price = sausageRoll.getFoodPrice();
       assertEquals(4.25, price);

    }

    public void jellyRollPriceTest()
    {
        JellyRoll jellyRoll = new JellyRoll();
        Double price = jellyRoll.getFoodPrice();
        assertEquals(2.75, price);

    }

    public void springRollPriceTest()
    {
        SpringRoll springRoll = new SpringRoll();
        Double price = springRoll.getFoodPrice();
        assertEquals(3.50, price);
    }

    public void eggRollCountTest()
    {
        int count = Store.inventory.get("numEggRolls");
        assertEquals(count, 30);
    }

    public void pastryRollCountTest()
    {
        int count = Store.inventory.get("numPastryRolls");
        assertEquals(count, 30);
    }

    public void sausageRollCountTest()
    {
        int count = Store.inventory.get("numSausageRolls");
        assertEquals(count, 30);
    }

    public void jellyRollCountTest()
    {
        int count = Store.inventory.get("numJellyRolls");
        assertEquals(count, 30);
    }

    public void springRollCountTest()
    {
        int count = Store.inventory.get("numSprRolls");
        assertEquals(count, 30);
    }
    
}
