import java.io.*;
import java.util.Scanner;

public class Inputtoend {
    public static void main(String[] args) {
        try(FileWriter writer = new
                FileWriter("C://Users/mattb/OneDrive/Рабочий стол/hi.txt", true)) {
            // запись всей строки
            Scanner sc = new Scanner(System.in);
            String line = "";
            line = sc.next();
            while (!line.equals("END")){

                writer.write(line);
                writer.append('\n');
                line = sc.next();
            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
