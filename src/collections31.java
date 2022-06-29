import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Scanner;

public class collections31 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the path to the file to be read from");
        Scanner scanner1 = new Scanner(System.in);
        File file1 = new File(scanner1.nextLine());
        System.out.println("Enter the path to the file where we will write");
        Scanner scanner2 = new Scanner(System.in);
        File file2 = new File(scanner2.nextLine());
        FileReader reader = new FileReader(file1);
        PrintWriter writer = new PrintWriter(file2,"UTF-8");
        Scanner scanner = new Scanner(reader);
        ArrayList<String> arrayList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            arrayList.add(scanner.nextLine().toLowerCase(Locale.ROOT).trim());
        }
        Object[] objects = arrayList.toArray();
        String[] strings = new String[objects.length];
        for (int i = 0; i < objects.length; i++) {
            strings[i] = (String) objects[i];
        }
        int[] amount = new int[strings.length]; // number of repetitions for each word
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (int i = 0; i < strings.length; i++) {
            amount[i] = 0;
            for (int k = 0; k < strings.length; k++)
                if (strings[i].equals(strings[k])) {
                    amount[i] += 1;
                } else continue;
            String e = strings[i] + " " + amount[i];
            set.add(e);
        }
        Object[] objects2 = set.toArray();
        String[] strings2 = new String[objects.length];

        for (int p = 0; p < objects2.length; p++) {
            strings2[p] = (String) objects2[p];
            //System.out.println(strings2[p]);
            writer.println(strings2[p]);
        }
        reader.close();
        writer.close();

    }
}