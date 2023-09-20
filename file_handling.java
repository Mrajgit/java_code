import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_handling {
    public static void main(String[] args) {
        File myFile = new File("file_handling.txt");
        try{
//            myFile.createNewFile();  //create a new file file_handling.txt
//            System.out.println("file created successfully");
//            FileWriter fileWriter = new FileWriter("file_handling.txt");
//            fileWriter.write("hello new file!.....");
//            fileWriter.close();

            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
//        catch(IOException e)
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
