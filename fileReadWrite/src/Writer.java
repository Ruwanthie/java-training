import java.io.BufferedWriter;
import java.io.FileWriter;

public class Writer {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("/home/user/Desktop/fileReadWrite/src/data/testout.txt");
        BufferedWriter buffer = new BufferedWriter(writer);

        for (int i=1;i<11;i++){
            buffer.write(""+i+"\n");
        }

        buffer.close();
        System.out.println("Success");
    }
}
