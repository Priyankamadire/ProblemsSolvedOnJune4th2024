/*
Longest Word
Have the function LongestWord(sen) take the sen parameter being passed and return the longest word in the string. If there are two or more words that are the same length, return the first word from the string with that length. Ignore punctuation and assume sen will not be empty. Words may also contain numbers, for example "Hello world123 567"
Examples
Input: "fun&!! time"
Output: time
Input: "I love dogs"
Output: love
Tags
string manipulation searching 
*/
import java.util.*; 
import java.io.*;
class LongestWord{

  public static String LongestWord(String sen) {
     String word [] = sen.split(" ");
     String ans = "";
     for(String k:word){
       String temp = k.replaceAll("[^A-Za-z0-9]","");
     if(temp.length()>ans.length()){
       ans = temp;
     }
     }
     return ans;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }

}
