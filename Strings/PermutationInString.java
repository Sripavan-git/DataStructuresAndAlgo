package Strings;
import java.util.Arrays;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean bool = checkInclusion(s1, s2);
        System.out.println(bool);
    }

    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        int windowSize = s1.length();
        // Initialize two frequency arrays to store the frequencies of two strings
        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];

        for(int i =0;i<s1.length();i++){
            // Store the frequency of characters in two strings initially of s1 length;
            s1Freq[s1.charAt(i) - 'a']++;
            s2Freq[s2.charAt(i) - 'a']++;
        }
        // Check if the initial size of s1 is equal or not
        if(Arrays.equals(s1Freq, s2Freq)) return true;

        // Form a window of size s1.length() and move the window in s2 and find if there is any substring where in which
        // the frequencies are same of the s1 if they are return true.
        for(int i = windowSize;i<s2.length();i++){
            int newChar = s2.charAt(i);
            int oldChar = s2.charAt(i - windowSize);

            s2Freq[newChar - 'a']++;
            s2Freq[oldChar - 'a']--;

            if(Arrays.equals(s1Freq, s2Freq)) return true;
        }
        return false;
    }
}
