package Java.preparation;

public class ReverseEachWordSentence {
    public static void main(String[] args) {
        String str = "My name is Sandip";
        String[] arr = str.split(" ");
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                char ch = arr[i].charAt(j);
                result += ch;
            }
            result += " ";
        }
        System.out.println(result);
    }
}
