package Sweets;

import Sweets.Sweet;

import java.math.BigDecimal;
//леденцы
public class Candy extends Sweets.Sweet {
//Вкусовые добавки (например, фруктовые, мятные, шоколадные).
private String flavorAdditives;

    private String CocoaBeanType;
    public Candy(String name, double weight, BigDecimal cost, String flavorAdditives) {
        super(name, weight, cost);
        this.flavorAdditives = flavorAdditives;
    }

    @Override
    public String toString(){
        return "Леденцы, " + super.toString() + ",  вкусовые добавки: " + flavorAdditives;
    }
}
