 import java.io.*;
 import java.util.*;

 class collections22 {
     {
         System.out.println("Enter the path to the file to be read from");
         Scanner scanner1 = new Scanner(System.in);
         File file1 = new File(scanner1.nextLine());
         FileReader fr = null;
         try {
             fr = new FileReader(file1);
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }
         {
             System.out.println("Enter the path to the file where we will write");
             Scanner scanner2 = new Scanner(System.in);
             File file2 = new File(scanner2.nextLine());
             PrintWriter pw = null;
             try {
                 pw = new PrintWriter(file2, "UTF-8");
             } catch (FileNotFoundException e) {
                 e.printStackTrace();
             } catch (UnsupportedEncodingException e) {
                 e.printStackTrace();
             }
             Scanner sc = new Scanner(fr);
             Set<String> hashSet = new HashSet<>();
             while (sc.hasNext()) {
                 String a = sc.nextLine();
                 hashSet.add(a);
             }
             fr.close();
             Object[] objects = hashSet.toArray();
             String[] array = new String[objects.length];
             for (int i = 0; i < objects.length; i++) {
                 array[i] = (String) objects[i];
                 pw.println(array[i]);
             }
             pw.close();

         }
     }
 }
