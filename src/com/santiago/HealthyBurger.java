package com.santiago;

public class HealthyBurger extends Hamburger{
    public HealthyBurger(){
        super("HealthyBurger", "Brown Rye", 17);
    }
    int maxAdditions = 6;
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
