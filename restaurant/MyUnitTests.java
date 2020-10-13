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

    public void sausageRollPrice()
    {
       SausageRoll sausageRoll = new SausageRoll();
       Double price = sausageRoll.getFoodPrice();
       assertEquals(4.25, price);

    }

    public void jellyRollPrice()
    {
        JellyRoll jellyRoll = new JellyRoll();
        Double price = jellyRoll.getFoodPrice();
        assertEquals(2.75, price);

    }

    public void springRollPrice()
    {
        SpringRoll springRoll = new SpringRoll();
        Double price = springRoll.getFoodPrice();
        assertEquals(3.50, price);
    }

    public void eggRollCount()
    {
        int count = Store.inventory.get("numEggRolls");
        assertEquals(count, 30);
    }

    public void pastryRollCount()
    {
        int count = Store.inventory.get("numPastryRolls");
        assertEquals(count, 30);
    }

    public void sausageRollCount()
    {
        int count = Store.inventory.get("numSausageRolls");
        assertEquals(count, 30);
    }

    public void jellyRollCount()
    {
        int count = Store.inventory.get("numJellyRolls");
        assertEquals(count, 30);
    }

    public void springRollCount()
    {
        int count = Store.inventory.get("numSprRolls");
        assertEquals(count, 30);
    }
    
}
