import java.io.*;

public class Writer {
    public static void main(String[] args) {


        try {

            FileWriter writer = new FileWriter("/home/user/Desktop/tryWithResource/src/data/testout.txt");
            BufferedWriter buffer = new BufferedWriter(writer);

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
