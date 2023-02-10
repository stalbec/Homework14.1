public class Pasta extends Food {
    private double price;
    private String kindOfSous;

    public Pasta(double price, String kindOfSous) {

        this.price = price;
        this.kindOfSous = kindOfSous;
    }

    public void cooked() {
        System.out.println("The pasta start cook");
    }

    public void service() {
        System.out.println("Pasta cooked and waiter bring the food");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getKindOfSous() {
        return kindOfSous;
    }
public Pasta(){

}
    public void setKindOfSous(String kindOfSous) {
        this.kindOfSous = kindOfSous;
    }

    @Override
    public String toString() {
        return "Pasta  " +
                "price:       " + price +"\n"+
                "kindOfSous:  " + kindOfSous +
                '}';
    }
}

