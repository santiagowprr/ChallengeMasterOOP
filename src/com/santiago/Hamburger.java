package com.santiago;

public class Hamburger {

    private String name;
    private String breadType;
    private boolean hasMeat;
    private int additionsNumber;
    private int lettuceCount;
    private int tomatoCount;
    private int cheeseCount;
    private int onionCount;
    private int jalapenoCount;
    private int basePrice;

    public Hamburger(String name, String breadType, int basePrice) {
        this.name = name;
        this.breadType = breadType;
        this.hasMeat = true;
        this.additionsNumber = 0;
        this.lettuceCount = 0;
        this.tomatoCount = 0;
        this.cheeseCount = 0;
        this.onionCount = 0;
        this.jalapenoCount = 0;
        this.basePrice = basePrice;
    }

    public int getAdditionsNumber() {
        return this.additionsNumber;
    }

    public String addLettuce(){
        this.lettuceCount += 1;
        this.additionsNumber += 1;
        return "Lettuce added successfully!";
}

    public String addTomato(){
        this.tomatoCount += 1;
        this.additionsNumber += 1;
        return "Tomato added successfully!";
    }
    public String addCheese(){
        this.cheeseCount += 1;
        this.additionsNumber += 1;
        return "Cheese added successfully!";
    }
    public String addOnion(){
        this.onionCount += 1;
        this.additionsNumber += 1;
        return "Onion added successfully!";
    }
    public String addJalapeno(){
        this.jalapenoCount += 1;
        this.additionsNumber += 1;
        return "Jalapeno added successfully!";
    }
    
    public String grandTotal(){
        int jalapenoPrice = 1;
        int lettucePrice = 2;
        int tomatoPrice = 3;
        int cheesePrice = 4;
        int onionPrice = 5;
        int finalPrice = 0;
        int chipsAndDrinkPrice = 10;

        System.out.println("Your order:");
        System.out.println(this.name + " - " + this.basePrice + "$");

        if (additionsNumber>0){
            System.out.println("Additions:");
        }
        
        if (jalapenoCount > 0){
            int finalJalapenoPrice = jalapenoCount*jalapenoPrice;
            finalPrice += finalJalapenoPrice;
            System.out.println(jalapenoCount + " Jalapeno(s) - " + finalJalapenoPrice + "$.");
        }
        if (lettuceCount > 0){
            int finalLettucePrice = lettuceCount*lettucePrice;
            finalPrice += finalLettucePrice;
            System.out.println(lettuceCount + " piece(s) of lettuce - " + finalLettucePrice + "$.");
        }
        if (tomatoCount > 0){
            int finalTomatoPrice = tomatoCount*tomatoPrice;
            finalPrice += finalTomatoPrice;
            System.out.println(tomatoCount + " tomato(es) - " + finalTomatoPrice + "$.");
        }
        if (cheeseCount > 0){
            int finalCheesePrice = cheeseCount*cheesePrice;
            finalPrice += finalCheesePrice;
            System.out.println(cheeseCount + " piece(s) of cheese - " + finalCheesePrice + "$.");
        }
        if (onionCount > 0){
            int finalOnionPrice = onionCount*onionPrice;
            finalPrice += finalOnionPrice;
            System.out.println(onionCount + " onion(s) - " + finalOnionPrice+ "$.");
        }

            finalPrice += basePrice;
        System.out.println(getClass().getSimpleName());

        if (this instanceof DeluxeHamburger){
            System.out.println("Chips and Drinks: " + chipsAndDrinkPrice + "$");
            finalPrice += chipsAndDrinkPrice;
        }

        return "Final price: " + finalPrice + "$";
    }
}
