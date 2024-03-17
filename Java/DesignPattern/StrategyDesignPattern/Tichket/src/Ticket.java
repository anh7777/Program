public class Ticket {
    private static PromoteStrategy promoteStrategy;
    //private PromoteStrategy PromoteStrategy;
    private double price;
    private String name;


    public static void PromoteStrategy setPromoteStrategy(PromoteStrategy value) {
        this.promoteStrategy = value;
    }

    public static PromoteStrategy getPromoteStrategy() {
        return promoteStrategy;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ticket (PromoteStrategy promoteStrategy){

    }
}
