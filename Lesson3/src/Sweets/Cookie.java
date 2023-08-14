package Sweets;

import Sweets.Sweet;

import java.math.BigDecimal;
//печенье
public class Cookie extends Sweets.Sweet {
    //Тип муки (например, пшеничная, овсяная, амарантовая).
    private String flourType;

    public Cookie(String name, double weight, BigDecimal cost, String flourType) {
        super(name, weight, cost);
        this.flourType = flourType;
    }

    @Override
    public String toString(){
        return "Печенье, " + super.toString() + ", тип муки: " + flourType;
    }
}
