
public class Main {
    public static void main(String[] args) {
            Mushroom mushroom = new Mushroom(new ExtraCheese(new VegDelight()));
            System.out.println(mushroom.cost());
    }
}