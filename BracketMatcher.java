/*Bracket Matcher
Have the function BracketMatcher(str) take the str parameter being passed and return 1 if the brackets are correctly matched and each one is accounted for. Otherwise return 0. For example: if str is "(hello (world))", then the output should be 1, but if str is "((hello (world))" the the output should be 0 because the brackets do not correctly match up. Only "(" and ")" will be used as brackets. If str contains no brackets return 1.
Examples
Input: "(coder)(byte))"
Output: 0
Input: "(c(oder)) b(yte)"
Output: 1
Tags
searchingstackrecursionfreevideo
*/
import java.util.*; 
import java.io.*;

class BracketMatcher  {

  public static String BracketMatcher(String str) {
    // code goes here 
    int cntopen = 0;
    int cntclose = 0;
    int n = str.length();
    for(int i=0;i<n;i++){
       char c = str.charAt(i);
       if(c=='('){
         cntopen++;
       }
       else if(c==')'){
         cntclose++;
       }
       if(cntopen<cntclose){
         return "0";
       }
    } 
    return cntopen==cntclose?"1":"0";
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(BracketMatcher(s.nextLine())); 
  }

}
