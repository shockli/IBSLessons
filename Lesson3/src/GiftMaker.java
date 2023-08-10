import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class GiftMaker {

    public static void launch() {
        ArrayList<Sweet> sweets = new ArrayList();

        sweets.add(new Sweet("1", "Chocolate Bar", 0.1, new BigDecimal(65)));
        sweets.add(new Sweet("2", "Gummy Bears", 0.2, new BigDecimal(225)));
        sweets.add(new Sweet("3", "Caramel Candy", 1.2, new BigDecimal(215)));
        sweets.add(new Sweet("4", "Fruit Lollipop", 0.4, new BigDecimal(240)));
        sweets.add(new Sweet("5", "Marshmallow", 0.12, new BigDecimal(145)));
        sweets.add(new Sweet("6", "Peppermint Twist", 0.3, new BigDecimal(300)));
        sweets.add(new Sweet("7", "Toffee Bar", 0.2, new BigDecimal(270)));
        sweets.add(new Sweet("8", "Jelly Beans", 0.2, new BigDecimal(70)));
        sweets.add(new Sweet("9", "Honeycomb", 0.07, new BigDecimal(85)));
        sweets.add(new Sweet("10", "Fudge Square", 0.12, new BigDecimal(2602)));

        //Найти общий вес подарка, общую стоимость подарка
        DecimalFormat df = new DecimalFormat("#.##");
        String totalWeight = df.format(getTotalWeight(sweets));

        System.out.println("Общий вес подарка: " + totalWeight + " кг.");
        System.out.println("Общая стоимость подарка: " + getTotalCost(sweets) + " руб.");

        System.out.println("\nСостав подарка:");
        for(Sweet sweet : sweets){
            System.out.println(sweet.getName() + " - " + sweet.getWeight() + " кг.");
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
