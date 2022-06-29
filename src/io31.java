import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class io31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pathFile = scanner.nextLine();
        File file = new File(pathFile);
        System.out.println(file.getName());
        if (!file.exists()){
            System.err.println("file dosent exist");
            System.exit(0);
        }
        File fileResult = new File("result.txt");
        try {
           file.createNewFile();
            } catch (IOException e) {
            e.printStackTrace();    }
        Writer writer = null;
        try {
            writer = new FileWriter(fileResult);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if(file.isDirectory()){
                writer.write("d" + "\n");
            }else writer.write("-" + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean read = file.canRead();
        boolean write = file.canWrite();
        boolean open = file.canExecute();
        try {
            if(read && write && open){
                writer.write("rwx"+ "\n");
            }
            if(!read && write && open){
                writer.write("-wx"+ "\n");
            }
            if(read && !write && open){
                writer.write("r-x"+ "\n");
            }
            if(read && write && !open){
                writer.write("rw-"+ "\n");
            }
            if(!read && !write && open){
                writer.write("--x"+ "\n");
            }
            if(read && !write && !open){
                writer.write("r--"+ "\n");
            }
            if(!read && write && !open){
                writer.write("r-x"+ "\n");
            }
            if(!read && !write && !open){
                writer.write("---"+ "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.write(file.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
