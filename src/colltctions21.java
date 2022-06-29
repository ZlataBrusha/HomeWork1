import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;



 class collections21 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Enter the path to the file to be read from");
        Scanner scanner1 = new Scanner(System.in);
        String name1 = scanner1.nextLine();
        FileReader reader = new FileReader(name1);
        Scanner scan = new Scanner(reader);
        TreeSet<String> set = new TreeSet<>();
        while (scan.hasNext()) {
            set.add(scan.nextLine());
        }
        Object[] objects = set.toArray();
        String[] strings = new String[objects.length];
        for (int i = 0; i < objects.length; i++) {
            strings[i] = (String) objects[i];
        }

        int[] array1 = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            array1[i] = strings[i].length();
        }
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            for (int k = 0; k < strings.length; k++) {
                if (strings[k].length() == array1[i]) {
                    System.out.println(strings[k]);
                }
            }
        }
    }

}
