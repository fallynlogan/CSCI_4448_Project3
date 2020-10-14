package restaurant;

public class Bookkeeper extends Employee {
    public Bookkeeper(){

    }

    @Override
    public void update(){
        for(int i=0 ; i<currCust.rollOrder.length ; i++){
            FoodItem curr_roll = currCust.rollOrder[i];
            switch(curr_roll.getName()){
                case "Spring Roll":
                    System.out.println(currCust.getName() +  " purchased a Spring Roll with " + curr_roll.getSauceQuantity() + " extra " + curr_roll.getSauceName() + ", " + curr_roll.getFillQuantity() + " extra " + curr_roll.getFillName() +
                            " filling, and " + curr_roll.getToppingQuantity() + " extra " + curr_roll.getToppingName() + " topping.");
                    this.dailySpringSales += curr_roll.getTotalPriceSingleRoll();
                    break;
                case "Egg Roll":
                    System.out.println(currCust.getName() +  " purchased an Egg Roll with " + curr_roll.getSauceQuantity() + " extra " + curr_roll.getSauceName() + ", " + curr_roll.getFillQuantity() + " extra " + curr_roll.getFillName() +
                            " filling, and " + curr_roll.getToppingQuantity() + " extra " + curr_roll.getToppingName() + " topping.");
                    this.dailyEggSales += curr_roll.getTotalPriceSingleRoll();
                    break;
                case "Pastry Roll":
                    System.out.println(currCust.getName() +  " purchased a Pastry Roll with " + curr_roll.getSauceQuantity() + " extra " + curr_roll.getSauceName() + ", " + curr_roll.getFillQuantity() + " extra " + curr_roll.getFillName() +
                            " filling, and " + curr_roll.getToppingQuantity() + " extra " + curr_roll.getToppingName() + " topping.");
                    this.dailyPastrySales += curr_roll.getTotalPriceSingleRoll();
                    break;
                case "Sausage Roll":
                    System.out.println(currCust.getName() +  " purchased a Sausage Roll with " + curr_roll.getSauceQuantity() + " extra " + curr_roll.getSauceName() + ", " + curr_roll.getFillQuantity() + " extra " + curr_roll.getFillName() +
                            " filling, and " + curr_roll.getToppingQuantity() + " extra " + curr_roll.getToppingName() + " topping.");
                    this.dailySausageSales += curr_roll.getTotalPriceSingleRoll();
                    break;
                case "Jelly Roll":
                    System.out.println(currCust.getName() +  " purchased a Jelly Roll with " + curr_roll.getSauceQuantity() + " extra " + curr_roll.getSauceName() + ", " + curr_roll.getFillQuantity() + " extra " + curr_roll.getFillName() +
                            " filling, and " + curr_roll.getToppingQuantity() + " extra " + curr_roll.getToppingName() + " topping.");
                    this.dailyJellySales += curr_roll.getTotalPriceSingleRoll();
                    break;
            }
        }

    }
}
