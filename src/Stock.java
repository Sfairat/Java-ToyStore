import java.util.ArrayList;
import java.util.Scanner;

public class Stock {
    private final ArrayList<Toys> toys;
    private static ArrayList<Toys> prizeToys;

    public Stock() {
        toys = new ArrayList<>();
        prizeToys = new ArrayList<>();
    }

    public static ArrayList<Toys> getPrizeToys() {
        return prizeToys;
    }

    public void addToys(Toys toy) {
        toys.add(toy);
    }

    public void changeToyWeight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ID игрушки, у которой хотите поменять вес: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Введите новый вес игрушки: ");
        double weight = Double.parseDouble(sc.nextLine());

        for (Toys toy : toys) {
            if (toy.getId() == id) {
                toy.setWeight(weight);
            }
        }
    }

    public void lottery() {
        prizeToys.clear();

        for (Toys toy : toys) {
            double random = Math.random() * 100;
            if (random > toy.getWeight()) {
                prizeToys.add(toy);
            }
        }
    }
}
