
public class Vowels {
    
    /**
     * @param letters a string of lowercase English letters
     * @return the set of vowels found in letters
     */
    public static String getVowelsIn(String letters) {
        final String VOWELS = "aeiou";
        String vowelsFound = "";
        
        for (int i = 0; i < VOWELS.length(); ++i) {
            char vowel = VOWELS.charAt(i);
            if (letters.indexOf(vowel) != -1) {
                vowelsFound += vowel;
            }
        }
        return vowelsFound;
    }
}
