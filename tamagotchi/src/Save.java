import java.io.FileWriter;
import java.io.IOException;

public class Save {


    public void save(String saveData) throws IOException {
        FileWriter nFile = new FileWriter("save.txt");
        nFile.write(saveData);
        nFile.close();
    }
}
