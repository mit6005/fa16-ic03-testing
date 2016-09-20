import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class VowelsTest {
    
    //
    // Testing strategy:
    //
    // 
    // Partition for vowelsIn(letters) -> result:
    //
    // letters.length: 0, 1, >1
    // result.length: 0, 1, >1
    // letters contains repeated vowels or doesn't
    //

    // covers letters.length=0, result.length=0, no repeated vowels
    @Test
    public void empty() {
        // JUnit wants arguments in the order (expected, actual), so read the following line like this:
        //     "" should be the result of getVowelsIn("")
        assertEquals("", Vowels.getVowelsIn(""));
    }

    // covers letters.length=1, result.length=0, no repeated vowels
    @Test
    public void oneConsonant() {
        assertEquals("", Vowels.getVowelsIn("c"));
    }

    // covers letters.length=1, result.length=1, no repeated vowels
    @Test
    public void oneVowel() {
        assertEquals("a", Vowels.getVowelsIn("a"));
    }

    // covers letters.length>1, result.length=0, no repeated vowels
    @Test
    public void severalConsonants() {
        assertEquals("", Vowels.getVowelsIn("dkfghj"));
    }

    // covers letters.length>1, result.length=1, no repeated vowels
    @Test
    public void oneVowelAndConsonants() {
        assertEquals("o", Vowels.getVowelsIn("bot"));
    }

    // covers letters.length>1, result.length>1, no repeated vowels
    @Test
    public void severalVowels() {
        assertEquals("ei", Vowels.getVowelsIn("file")); // danger!
    }

    // covers letters.length>1, result.length=1, repeated vowels
    @Test
    public void oneRepeatedVowel() {
        assertEquals("e", Vowels.getVowelsIn("tree"));
    }

    // covers letters.length>1, result.length>1, repeated vowels
    @Test
    public void severalRepeatedVowels() {
        assertEquals("oe", Vowels.getVowelsIn("bookkeeper")); // danger!
    }

}
