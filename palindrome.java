
// Given string palindrome or not using for loop
class palindrome{
   
    public static boolean isPalindrome(String str)
    {
      
        String rev = "";

        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        String str = "aba";

        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        System.out.println(A);
    }
}

// Given string palindrome or not using if else statement
public class PalindromeString    
{    
    public static void main(String[] args) {    
        String string = "aba";    
        boolean flag = true;        
        string = string.toLowerCase();    
              
        for(int i = 0; i < string.length()/2; i++){    
            if(string.charAt(i) != string.charAt(string.length()-i-1)){    
                flag = false;    
                break;    
            }    
        }    
        if(flag)    
            System.out.println("Given string is palindrome");    
        else    
            System.out.println("Given string is not a palindrome");    
    }    
}    

