package model;

import model.constants.Discount;
import model.constants.Colour;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }
    public String getColour(){
        return colour;
    }
    @Override
    public double getDiscount(){
        if(Colour.red.equals(colour)){
            return Discount.AppleRedDiscount;
        }else {
            return 0.0;
        }
    }
}

