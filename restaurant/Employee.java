package restaurant;

import java.text.DecimalFormat;

public abstract class Employee {
    protected double dailySpringSales, dailyEggSales, dailyPastrySales, dailySausageSales, dailyJellySales;
    protected int dailyTotalSpringOrders, dailyTotalEggOrders, dailyTotalPastryOrders, dailyTotalSausageOrders, dailyTotalJellyOrders;

    protected double dailyCasualSales, dailyBusinessSales, dailyCateringSales;
    protected int casualRollOutages,businessRollOutages, cateringRollOutages;
    protected double dailyTotalSales;

    boolean earlyClosure;

    protected double allSpringSales, allEggSales, allPastrySales, allSausageSales, allJellySales;
    protected double lifetimeTotalSales;

    public static Customer currCust;

    Employee(){
        dailySpringSales = 0; dailyEggSales = 0; dailyPastrySales = 0; dailySausageSales = 0; dailyJellySales = 0;
        dailyTotalSpringOrders = 0; dailyTotalEggOrders = 0; dailyTotalPastryOrders = 0; dailyTotalSausageOrders = 0; dailyTotalJellyOrders = 0;
        allSpringSales = 0; allEggSales = 0; allPastrySales = 0; allSausageSales = 0; allJellySales = 0;
        dailyCasualSales = 0; dailyBusinessSales = 0; dailyCateringSales = 0;
        casualRollOutages = 0; businessRollOutages = 0; cateringRollOutages = 0;
        dailyTotalSales = 0;
    }

    public void printReceipt(){

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);

        currCust.totalSpent = 0.0;
        if(currCust.rollOrder.length>0){
            System.out.println(currCust.getName() + "'s Purchase:");
            for(int i=0 ; i<currCust.rollOrder.length ; i++){
                System.out.println("1 " + currCust.rollOrder[i].getName() + "  @  $" + df.format(currCust.rollOrder[i].getFoodPrice()));
                if(currCust.rollOrder[i].getFillQuantity()>0){
                    System.out.println(currCust.rollOrder[i].getFillQuantity() + " " + currCust.rollOrder[i].getFillName() + "  @  $" + df.format(currCust.rollOrder[i].getFillPrice()));
                }
                if(currCust.rollOrder[i].getSauceQuantity()>0){
                    System.out.println(currCust.rollOrder[i].getSauceQuantity() + " " + currCust.rollOrder[i].getSauceName() + "  @  $" + df.format(currCust.rollOrder[i].getSaucePrice()));
                }
                if(currCust.rollOrder[i].getToppingQuantity()>0){
                    System.out.println(currCust.rollOrder[i].getToppingQuantity() + " " + currCust.rollOrder[i].getToppingName() + "  @  $" + df.format(currCust.rollOrder[i].getExtraToppingPrice()));
                }
                currCust.totalSpent += currCust.rollOrder[i].getTotalPriceSingleRoll();
            }
            System.out.println("Total = $" + df.format(currCust.totalSpent));
        }
    }

    public void printDailyReport(int dayNum){
        System.out.println("---------- DAILY REPORT FOR DAY " + dayNum + " ----------");

        System.out.println("Leftover Spring Rolls: " + Store.inventory.get("numSprRolls"));
        System.out.println("Total Revenue for Spring Rolls: " + dailySpringSales);
        System.out.println("Total Spring Roll Orders: " + dailyTotalSpringOrders);

        System.out.println("Leftover Egg Rolls: " + Store.inventory.get("numEggRolls"));
        System.out.println("Total Revenue for Egg Rolls: " + dailyEggSales);
        System.out.println("Total Egg Roll Orders: " + dailyTotalEggOrders);

        System.out.println("Leftover Pastry Rolls: " + Store.inventory.get("numPastryRolls"));
        System.out.println("Total Revenue for Pastry Rolls: " + dailyPastrySales);
        System.out.println("Total Pastry Roll Orders: " + dailyTotalPastryOrders);

        System.out.println("Leftover Sausage Rolls: " + Store.inventory.get("numSausageRolls"));
        System.out.println("Total Revenue for Sausage Rolls: " + dailySausageSales);
        System.out.println("Total Sausage Roll Orders: " + dailyTotalSausageOrders);

        System.out.println("Leftover Jelly Rolls: " + Store.inventory.get("numJellyRolls"));
        System.out.println("Total Revenue for Jelly Rolls: " + dailyJellySales);
        System.out.println("Total Jelly Roll Orders: " + dailyTotalJellyOrders);

        System.out.println("Total Revenue for Casual Customers: " + dailyCasualSales);
        System.out.println("Total Revenue for Business Customers: " + dailyBusinessSales);
        System.out.println("Total Revenue for Catering Customers: " + dailyCateringSales);
        System.out.println("Total Revenue for All Customers: " + (dailyCasualSales + dailyBusinessSales + dailyCateringSales));

        System.out.println("Total Casual Orders Affected by Roll Outages: " + casualRollOutages);
        System.out.println("Total Business Orders Affected by Roll Outages: " + businessRollOutages);
        System.out.println("Total Catering Orders Affected by Roll Outages: " + cateringRollOutages);

        String yn;
        if(earlyClosure){ yn = "Yes"; }
        else{ yn = "No";  }
        System.out.println("Inventory Sold Out: " + yn);

        System.out.println("\n====================================================================================================\n");
    }

    public abstract void update();
}
