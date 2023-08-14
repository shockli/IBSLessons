package Sweets;

import Sweets.Sweet;

import java.math.BigDecimal;
//Зефир
public class Marshmallow extends Sweets.Sweet {
    //Сопротивление обжариванию
    private String toastingResistance;

    public Marshmallow(String name, double weight, BigDecimal cost, String toastingResistance) {
        super(name, weight, cost);
        this.toastingResistance = toastingResistance;
    }

    @Override
    public String toString(){
        return "Зефир, " + super.toString() + ", сопротивление обжариванию: " + toastingResistance;
    }
}
