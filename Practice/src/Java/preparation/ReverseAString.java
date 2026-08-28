package Java.preparation;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "Hello";
        for(int i=s.length() - 1; i>=0; i--){
            char ch = s.charAt(i);
            System.out.print(ch);
        }
    }
}