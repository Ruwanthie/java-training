import java.io.*;

public class Writer {
    //try with resource - write file (auto closable)
    private static final String FILENAME = "/home/user/Desktop/tryWithResource/src/data/testout.txt";

    public static void main(String[] args) {

        try(BufferedWriter buffer = new BufferedWriter(new FileWriter(FILENAME))) {

            for (int i=1;i<11;i++){
                buffer.write(""+i+"\n");
            }

            System.out.println("Success");
            // Process the input and produce the output

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
