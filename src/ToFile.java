import java.io.FileWriter;
import java.io.IOException;

public class ToFile {
    public static void writeToFile() throws IOException {
        FileWriter fw = new FileWriter("Prizes.txt", true);
        for (Toys toy : Stock.getPrizeToys()) {
            fw.append(toy.getName()).append("\n");
            toy.setQuantity(toy.getQuantity() - 1);
        }
        fw.append("\n");
        fw.append("---- Новый день ----\n");
        fw.close();
    }
}

