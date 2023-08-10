import java.math.BigDecimal;

public class Sweet {

    private String guid; // уникальный параметр
    private String name; // название
    private Double weight; // вес
    private BigDecimal cost; //цена

    public Sweet(String guid, String name, Double weight, BigDecimal cost) {
        this.guid = guid;
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}
