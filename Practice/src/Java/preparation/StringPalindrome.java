package Java.preparation;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "Radar";
        str = str.toLowerCase();
        int i = 0;
        int j = str.length()-1;
        boolean isPalindrome = true;

        while(i<j){
            char c1 = str.charAt(i);
            char c2 = str.charAt(j);

            if(c1 == c2){
                i++;
                j--;
            } else {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
        
    }
}
