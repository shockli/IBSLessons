package Sweets;

import Sweets.Sweet;

import java.math.BigDecimal;
//Сахарная вата
public class CottonCandy extends Sweets.Sweet {
    // Аромат (например, клубника, виноград, ваниль).
    private String scent;
    public CottonCandy(String name, double weight, BigDecimal cost, String scent) {
        super(name, weight, cost);
        this.scent = scent;
    }

    @Override
    public String toString(){
        return "Сахарная вата, " + super.toString() + ", с ароматом: " + scent;
    }
}
