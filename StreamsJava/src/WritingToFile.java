import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {
  /**
   * This is Main.
   */
  public static void main(String[] args) {

    String[] array = new String[]{"Stamat", "Lili", "Geri"};

    try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Java\\Java Fundamentals - Lab\\StreamsJava/write.txt"))) {
      for (int i = 0; i < array.length; i++) {
        String s = array[i];

        writer.write(s + "\r\n");
        System.out.println();
      }
    } catch (IOException ex) {
      System.out.println("The file is missing.");
    }
  }
}
