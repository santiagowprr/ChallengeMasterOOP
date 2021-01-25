package com.santiago;

public class DeluxeHamburger extends Hamburger{
    public DeluxeHamburger(){
        super("Deluxe Hamburger", "Deluxe", 15);
    }

    @Override
    public String addLettuce() {
        return "You've selected Deluxe Burger - you cannot add additions!";
    }

    @Override
    public String addTomato() {
        return "You've selected Deluxe Burger - you cannot add additions!";
    }

    @Override
    public String addCheese() {
        return "You've selected Deluxe Burger - you cannot add additions!";
    }

    @Override
    public String addOnion() {
        return "You've selected Deluxe Burger - you cannot add additions!";
    }

    @Override
    public String addJalapeno() {
        return "You've selected Deluxe Burger - you cannot add additions!";
    }


}
