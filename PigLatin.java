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

  public static String pigLatin(String s){
    
    String[] digraphs = new String[]{"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    String translation = "";
    boolean digraphStart = false;
    
    for (int i = 0; i < digraphs.length; i++){
      if (s.substring(0, 2) == digraphs[i]){
        digraphStart = true;
      }
    }
    
    if (s.charAt(0) == 'a'||s.charAt(0) =='e'||s.charAt(0) =='i'||s.charAt(0) =='o'||s.charAt(0) =='u'){
      for (int i = 0; i < s.length(); i++){
        translation += s.charAt(i);
      }
      translation += "hay";
    }
    
    else if (digraphStart){
      for (int i = 2; i < s.length(); i++){
        translation += s.charAt(i);
      }
      translation += s.substring(0, 2);
      translation += "ay";
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
  
  public static String pigLatinBeast(String s){
    
    String[] digraphs = new String[]{"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    String translation = "";
    boolean digraphStart = false;
    boolean nonCharEnd = false;
    String end = "" + s.charAt(s.length() - 1);
    
    for (int i = 0; i < digraphs.length; i++){
      if (s.substring(0, 2) == digraphs[i]){
        digraphStart = true;
      }
    }
    
    if (!Character.isLetter(s.charAt(0))){
      return s;
    }
    
    if (!Character.isLetter(s.charAt(s.length() - 1))){
      nonCharEnd = true;
    }
    
    if (s.charAt(0) == 'a'||s.charAt(0) =='e'||s.charAt(0) =='i'||s.charAt(0) =='o'||s.charAt(0) =='u'){
      for (int i = 0; i < s.length(); i++){
        translation += s.charAt(i);
      }
      translation += "hay";
    }
    
    else if (digraphStart){
      for (int i = 2; i < s.length(); i++){
        translation += s.charAt(i);
      }
      translation += s.substring(0, 2);
      translation += "ay";
    }
    
    else {
      for (int i = 1; i < s.length(); i++){
        translation += s.charAt(i);
      }
      translation += s.charAt(0);
      translation += "ay";
    }
    
    if (nonCharEnd){
      translation += end;
    }
    
    return translation;
  }    

}