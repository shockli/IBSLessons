package Sweets;

import Sweets.Sweet;

import java.math.BigDecimal;
//леденец на палочке
public class Lollipop extends Sweets.Sweet {
    //размер
    private String productionCountry;
    public Lollipop(String name, double weight, BigDecimal cost, String productionCountry) {
        super(name, weight, cost);
        this.productionCountry = productionCountry;
    }

    @Override
    public String toString(){
        return "Леденец на палочке, " + super.toString() + ", страна производства: " + productionCountry;
    }
}
