import java.util.*;

public class MakeStars{

  public static void main(String[] args){

    boolean linePrinting = true;
    Scanner lines = new Scanner(System.in);

    while (linePrinting){

      String currentLine = lines.nextLine();
      Scanner words = new Scanner(currentLine);
      boolean wordPrinting = true;

      System.out.println();

      while (wordPrinting){

        String currentWord = words.next();
        String stars = "";

        for (int i = 0; i < currentWord.length(); i++){
          stars += "*";
        }

        System.out.print(stars + " ");
      }
    }

  }

}
