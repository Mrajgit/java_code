import java.io.FileWriter;
import java.io.IOException;

public class multiplication_file {
    public static void main(String[] args) {
        int i = 18;
        String table = "";
        for (int j = 0; j < 10; j++) {
            table +=i + " * "+(j+1) +" = "+ i*(j+1);
            table +="\n";
        }
        try{
            FileWriter fileWriter = new FileWriter("multiplication_file.txt");
            fileWriter.write(table);
            fileWriter.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
