public class Food {
    private String name;
    private Pasta pasta;

    public Food(String name, Pasta pasta) {
        this.name = name;
        this.pasta = pasta;
    }

    public Food() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pasta getPasta() {
        return pasta;
    }

    public void setPasta(Pasta pasta) {
        this.pasta = pasta;
    }

    public void delicious(){
        System.out.println("The pasta is delicious");
    }

    @Override
    public String toString() {
        return "Food" +
                "name:    " + name + "\n" +
                "pasta:   " + pasta +
                '}';
    }
}



