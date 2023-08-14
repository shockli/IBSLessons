package Sweets;

import Sweets.Sweet;

import java.math.BigDecimal;
//Мармелад
public class Gummy extends Sweets.Sweet {
    //Форма (например, медведи, червяки, кольца).
    private String shape;
    public Gummy(String name, double weight, BigDecimal cost, String shape) {
        super(name, weight, cost);
        this.shape = shape;
    }

    @Override
    public String toString(){
        return "Марм, " + super.toString() + ", в форме " + shape;
    }
}
