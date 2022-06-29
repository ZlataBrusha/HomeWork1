
import java.io.*;
import java.util.Scanner;


class i011 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the path to the file to be read from");
        Scanner scanner1= new Scanner(System.in);
        FileReader reader = new FileReader(scanner1.nextLine());
        Scanner scan = new Scanner(reader);
        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
        reader.close();

    }
}