public class Main {
    public static void main(String[] args) {
    Pasta pasta = new Pasta(250,"Cream souse");
    Food food = new Food("Carbonara",pasta );
    System.out.println(food);

    food.delicious();
    pasta.cooked();
    pasta.service();
    }
}