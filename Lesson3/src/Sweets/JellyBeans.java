package Sweets;

import Sweets.Sweet;

import java.awt.*;
import java.math.BigDecimal;
//Желе бобы
public class JellyBeans extends Sweets.Sweet {
    //цвет
    private String color;
    public JellyBeans(String name, double weight, BigDecimal cost, String color) {
        super(name, weight, cost);
        this.color = color;
    }

    @Override
    public String toString(){
        return "Желе бобы, " + super.toString() + ", цвет: " + color;
    }
}
