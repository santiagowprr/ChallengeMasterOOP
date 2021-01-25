package com.santiago;

public class BaseBurger extends Hamburger{


    public BaseBurger(String breadType, int baseBurgerPrice) {
        super("Base Burger", breadType, 15);
    }

    int maxAdditions = 4;
    @Override
    public String addLettuce() {
        if (getAdditionsNumber() < maxAdditions){
            return super.addLettuce();
        }
        return "Too many additions already!";
    }

    @Override
    public String addTomato() {
        if (getAdditionsNumber() < maxAdditions){
            return super.addTomato();
        }
        return "Too many additions already!";
    }

    @Override
    public String addCheese() {
        if (getAdditionsNumber() < maxAdditions){
            return super.addCheese();
        }
        return "Too many additions already!";
    }

    @Override
    public String addOnion() {
        if (getAdditionsNumber() < maxAdditions){
            return super.addOnion();
        }
        return "Too many additions already!";
    }

    @Override
    public String addJalapeno() {
        if (getAdditionsNumber() < maxAdditions){
            return super.addJalapeno();
        }
        return "Too many additions already!";
    }
}
