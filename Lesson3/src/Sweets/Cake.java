package Sweets;//import Sweets.Sweet;

import java.math.BigDecimal;
//торт
public class Cake extends Sweet {
    //количество калорий на 100гр.
    private Integer calories;
    public Cake(String name, double weight, BigDecimal cost, Integer calories) {
        super(name, weight, cost);
        this.calories = calories;
    }

    @Override
    public String toString(){
        return "Торт, " + super.toString() + ",  калорийность " + calories + " ккал/100гр";
    }
}
