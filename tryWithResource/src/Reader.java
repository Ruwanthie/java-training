import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    //try with resource - read file (auto closable)
    private static final String FILENAME = "/home/user/Desktop/tryWithResource/src/data/test.txt";

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

            String strCurrentLine;

            while ((strCurrentLine = br.readLine()) != null) {
                System.out.println(strCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
