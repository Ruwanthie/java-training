import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    private static final String FILENAME = "/home/user/Desktop/fileReadWrite/src/data/test.txt";

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(FILENAME));

        String strCurrentLine;

        while ((strCurrentLine = br.readLine()) != null) {
            System.out.println(strCurrentLine);
        }

        br.close();
    }
}
