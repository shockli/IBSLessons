package Sweets;

import java.math.BigDecimal;

public abstract class Sweet {
    private String name; // название
    private Double weight; // вес
    private BigDecimal cost; //цена

    public Sweet(String name, double weight, BigDecimal cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public String toString(){
        return "вес " + this.getWeight() + " кг" + ", стоимость " + this.getCost() +  " руб";
    }
}
