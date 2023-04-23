import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Stock stock = new Stock();

        Toys toy1 = new Toys(1, "Машинка", 20, 25);
        Toys toy2 = new Toys(2, "Плюшевый мишка", 10, 70);
        Toys toy3 = new Toys(3, "Набор солдатиков", 15, 60);
        Toys toy4 = new Toys(4, "Игрушечный танк", 10, 50);
        Toys toy5 = new Toys(5, "Игрушечный самолет", 10, 35);
        Toys toy6 = new Toys(6, "Кукла", 20, 50);
        Toys toy7 = new Toys(7, "Робот", 20, 30);
        Toys toy8 = new Toys(8, "Лопатка", 30, 40);
        Toys toy9 = new Toys(9, "Мячик", 30, 60);

        stock.addToys(toy1);
        stock.addToys(toy2);
        stock.addToys(toy3);
        stock.addToys(toy4);
        stock.addToys(toy5);
        stock.addToys(toy6);
        stock.addToys(toy7);
        stock.addToys(toy8);
        stock.addToys(toy9);

        stock.lottery();
        ToFile.writeToFile();

        stock.changeToyWeight();
        stock.lottery();
        ToFile.writeToFile();
    }
}