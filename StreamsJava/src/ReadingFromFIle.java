import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFIle {
  /**
   * This is Main.
   */
  public static void main(String[] args) {

    try (BufferedReader reader = new BufferedReader(new FileReader("D:\\Java\\Java Fundamentals - Lab\\StreamsJava/text.txt"))) {

      String s;

      while ((s = reader.readLine()) != null) {
        System.out.println(s);
      }
    } catch (IOException ex) {
      System.out.println("The file is missing.");
    }
  }
}
