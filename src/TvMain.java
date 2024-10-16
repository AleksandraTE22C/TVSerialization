import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TvMain {
    private ArrayList<TvSeries> shows = new ArrayList<>();

    public TvMain() {
        createShowData();
        write2file();

    }
    public void createShowData() {

    }

    public void write2file() {
        try {
            FileOutputStream fileOut = new FileOutputStream("./TVShows.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            for (TvSeries show : shows) {
                objectOut.writeObject(show);
            }
            fileOut.close();
            objectOut.close();
        } catch (IOException e) {
            System.out.println("Could not write to file");
        }
    }

    public void readFromFile() {

    }
}
