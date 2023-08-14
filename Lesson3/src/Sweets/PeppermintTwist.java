package Sweets;

import Sweets.Sweet;

import java.math.BigDecimal;
//Мятные палочки
public class PeppermintTwist extends Sweets.Sweet {
    //Интенсивность мятного вкуса
    private String intensityOfMintFlavor;

    public PeppermintTwist(String name, double weight, BigDecimal cost, String intensityOfMintFlavor) {
        super(name, weight, cost);
        this.intensityOfMintFlavor = intensityOfMintFlavor;
    }

    @Override
    public String toString(){
        return "Мятные палочки, " + super.toString() + ", интенсивность мятного вкуса: " + intensityOfMintFlavor;
    }
}
