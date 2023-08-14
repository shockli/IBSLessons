import Sweets.*;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class GiftMaker {

    public static void launch() {
        ArrayList<Sweet> sweets = new ArrayList();


        sweets.add(new Cake("Торт", 0.1, new BigDecimal("65"), 1500));
        sweets.add(new Candy("Леденцы", 0.2, new BigDecimal("225"), "aруктовые"));
        sweets.add(new Chocolate("Шоколад", 1.2, new BigDecimal("215"), "Forastero"));
        sweets.add(new Cookie("Печенье", 0.4, new BigDecimal("240"), "овсяная"));
        sweets.add(new CottonCandy("Сахарная вата", 0.12, new BigDecimal("145"), "клубника"));
        sweets.add(new Gummy("Мармелад", 0.3, new BigDecimal("300"), "в форме мишек"));
        sweets.add(new JellyBeans("Желе бобы", 0.2, new BigDecimal("270"), "красный"));
        sweets.add(new Lollipop("Sweets.Lollipop", 0.2, new BigDecimal("70"), "USA"));
        sweets.add(new Marshmallow("Зефир", 0.07, new BigDecimal("85"), "средняя"));
        sweets.add(new PeppermintTwist("Мятные палочки", 0.12, new BigDecimal("2602"), "сильная"));
        sweets.add(new Toffee("Ирис", 0.12, new BigDecimal("2602"), "ореховое"));


        //Найти общий вес подарка, общую стоимость подарка
        DecimalFormat df = new DecimalFormat("#.##");
        String totalWeight = df.format(getTotalWeight(sweets));

        System.out.println("Общий вес подарка: " + totalWeight + " кг.");
        System.out.println("Общая стоимость подарка: " + getTotalCost(sweets) + " руб.");

        System.out.println("\nСостав подарка:");
        for(Object sweet : sweets){
            System.out.println(sweet.toString());
        }
    }

    public static BigDecimal getTotalCost(ArrayList<Sweet> sweets){
        BigDecimal totalCost = new BigDecimal(0);
        for (Sweet sweet : sweets){
            totalCost = totalCost.add(sweet.getCost());
        }
        return totalCost;
    }

    public static Double getTotalWeight(ArrayList<Sweet> sweets){
        Double totalWeight = 0.0;
        for (Sweet sweet : sweets){
            totalWeight += sweet.getWeight();
        }
        return totalWeight;
    }
}
