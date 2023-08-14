package Sweets;

import java.math.BigDecimal;
//Ирис
public class Toffee extends Sweets.Sweet {
    // Покрытие (например, шоколадное, ореховое).
    private String coating;

    public Toffee(String name, double weight, BigDecimal cost, String coating) {
        super(name, weight, cost);
        this.coating = coating;
    }

    @Override
    public String toString(){
        return "Торт, " + super.toString() + ", покрытие: " + coating;
    }
}
