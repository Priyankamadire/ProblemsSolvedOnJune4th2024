/*

Questions Marks
Have the function QuestionsMarks(str) take the str string parameter, which will contain single digit numbers, letters, and question marks, and check if there are exactly 3 question marks between every pair of two numbers that add up to 10. If so, then your program should return the string true, otherwise it should return the string false. If there aren't any two numbers that add up to 10 in the string, then your program should return false as well.

For example: if str is "arrb6???4xxbl5???eee5" then your program should return true because there are exactly 3 question marks between 6 and 4, and 3 question marks between 5 and 5 at the end of the string.
Examples
Input: "aa6?9"
Output: false
Input: "acc?7??sss?3rr1??????5"
Output: true
Tags
string manipulationsearchinghash tablefreecache
 */ 
import java.util.*; 
import java.io.*;

class Main {
  


  public static String QuestionsMarks(String str) {
    // code goes here  
   boolean flag = false;
    int n = str.length();
    for(int i=0;i<n;i++){
      char c = str.charAt(i);
      if(Character.isDigit(c)){
        int a = Character.getNumericValue(c);
        for(int j=i+1;j<n;j++){
           char d = str.charAt(j);
           if(Character.isDigit(d)){
        int b = Character.getNumericValue(d);
        if(a+b==10){
          flag=true;
          int cnt = countQuestionMark(i+1,j-1,str);
          if(cnt!=3){
            flag=false;
          }
          break;
        }
        }

      }
    }
    }
    return flag?"true":"false";
  }
  public static int countQuestionMark(int a,int b,String s){
    int cnt =0;
    for(int i=a;i<=b;i++){
      if(s.charAt(i)=='?'){
        cnt++;
      }
    }
    return cnt;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(QuestionsMarks(s.nextLine())); 
  }

}
