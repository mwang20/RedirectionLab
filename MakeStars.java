import java.util.*;

public class MakeStars{

  public static void main(String[] args){

    Scanner lines = new Scanner(System.in);

    while (lines.hasNextLine()){

      String currentLine = lines.nextLine();
      Scanner words = new Scanner(currentLine);

      System.out.println();

      while (words.hasNext()){

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
