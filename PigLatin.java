import java.util.*;

public class PigLatin{

  public static void main(String[] args){

  }

  public static String pigLatinSimple(String s){
    
    String translation = "";
    
    if (s.charAt(0) == 'a'||s.charAt(0) =='e'||s.charAt(0) =='i'||s.charAt(0) =='o'||s.charAt(0) =='u'){
      for (int i = 0; i < s.length(); i++){
        translation += s.charAt(i);
      }
      translation += "hay";
    }
    
    else {
      for (int i = 1; i < s.length(); i++){
        translation += s.charAt(i);
      }
      translation += s.charAt(0);
      translation += "ay";
    }
    return translation;
  }

}