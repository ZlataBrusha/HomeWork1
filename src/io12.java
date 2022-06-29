import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class io12 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Enter the path to the file to be read from");
        Scanner scanner1= new Scanner(System.in);
        File file = new File(scanner1.nextLine());
        Scanner scanner = new Scanner(file);
        ArrayList <String> strings = new ArrayList<>();
        while (scanner.hasNextLine()){
            strings.add(scanner.nextLine());
        }
        Object [] output = strings.toArray();
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}

