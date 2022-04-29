import java.util.HashMap;

public class StringCompression {
    public static void main(String[] args) {
        String test1 = "abcde";
        String test2 = "aabcccccaaa";
        String test3 = "aaabbcccddd";
        compressString(test1);
        compressString(test2);
        compressString(test3);
    }

    public static void compressString(String input) {
        StringBuilder output = new StringBuilder();
        int count = 1, i = 1;
        char current = input.charAt(0);

        while (i < input.length() - 1) {
            for (int j = i + 1; j < input.length(); j++) {
                if (current == input.charAt(j)) {
                    count++;
                }
            }
            output.append(current).append(count);
            i = i + count - 1;
        }

        System.out.println(output);
    }

    /*
    Implement a method to perform basic string compression using the counts of repeated characters.
    For example, the string aabcccccaaa would become a2blc5a3. If the "compressed" string would not
    become smaller than the original string, your method should return the original string. You can
    assume the string has only uppercase and lowercase letters (a - z)
     */
}
