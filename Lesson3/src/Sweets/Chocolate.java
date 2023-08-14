package Sweets;

import Sweets.Sweet;

import java.math.BigDecimal;
//шоколад
public class Chocolate extends Sweets.Sweet {
    //тип какао бобов например, Criollo, Forastero, Trinitario
    private String cocoaBeanType;


    public Chocolate(String name, double weight, BigDecimal cost, String cocoaBeanType) {
        super(name, weight, cost);
        this.cocoaBeanType = cocoaBeanType;
    }

    @Override
    public String toString(){
        return "Шоколад, " + super.toString() + ", тип какао бобов: " + cocoaBeanType;
    }
}