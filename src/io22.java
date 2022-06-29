 import java.io.*;
        import java.util.Scanner;

public class io22 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the path to the file to be read from");
        Scanner scanner1 = new Scanner(System.in);
        String name1 = scanner1.nextLine();
        System.out.println("Enter the path to the file, in which we will write ");
        Scanner scanner2 = new Scanner(System.in);
        String name2 = scanner2.nextLine();
        FileReader reader = new FileReader(name1);
        LineNumberReader lineNumberReader = new LineNumberReader(reader);
        Scanner scanner3 = new Scanner(reader);
        PrintWriter writer = new PrintWriter(name2, "UTF-8");
        int n = 0;
        while (lineNumberReader.readLine()!=null) {
            n += 1;
        }
        reader.close();
        writer.println(n);
        writer.close();
    }
}