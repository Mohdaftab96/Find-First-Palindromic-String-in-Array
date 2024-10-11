
// Given Array String is : "abc", "car", "ada", "racecar", "cool"
// First Palindroming String is : ada

// Given Array String is : "abc", "car", "add", "racecarf", "cool"
// First Palindroming String is : no Palindrom String is present in the Given Array Palindrom

// Given Array String is : "notapalindrome","racecar"
// First Palindroming String is : racecar


import java.util.List;
import java.util.Arrays;


public class Find_First_Palindromic_String_in_Array_Using_ArrayList {

      public static boolean isPalindrom(String s){

            int left = 0;
            int right = s.length()-1;
            
            while(left < right){
                  if(s.charAt(left) != s.charAt(right)){
                        return false;
                  }
                  left++;
                  right--;
            }
            return true;
      }


      public static String findFirstPalindromic(List<String> words){
            for(String word : words){
                  if(isPalindrom(word)){
                        return word;
                  }
            }
            return "no Palindrom String is present in the Given Array Palindrom";
      }


      public static void main(String[] args){
            List<String> words = Arrays.asList("abc", "car", "add", "racecarf", "cool");

            // findFirstPalindromic(words);
            System.out.println("First Palindroming String is : " + findFirstPalindromic(words));

      }
}
