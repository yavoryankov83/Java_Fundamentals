import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindStringWithRegex {
  /**
   * This is Main method.
   */
  public static void main(String[] args) {

    String text = "Hello, my number in Sofiq is +359 894 11 22 33, "
        + "but in Munich my number is +49 89 975-99222";

    Pattern pattern = Pattern.compile("\\+\\d{1,3}([ -]*([0-9]+))+");

    Matcher matcher = pattern.matcher(text);

    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
