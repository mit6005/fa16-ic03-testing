import java.math.BigInteger;

public class PowerMod {
    
    /**
     * Computes base^exponent (mod modulus).
     *
     * For example, if base = 2, exponent = 3, and modulus = 5,
     * this method computes 2^3 (mod 5) = 8 (mod 5) = 3.
     * 
     * @param base     base for exponentiation, requires base >= 0
     * @param exponent exponent for exponentiation, requires exponent >= 0
     * @param modulus  divisor for modulo operation, requires modulus > 0
     * @return base^exponent (mod modulus)
     */
    public static int powerMod(int base, int exponent, int modulus) {
        return powerModSlow(base, exponent, modulus);
    }
    
    private static int powerModSlow(int base, int exponent, int modulus) {
        BigInteger n = BigInteger.ONE;
        for (int i = 0; i < exponent; ++i) {
            n = n.multiply(BigInteger.valueOf(base));
        }
        n = n.mod(BigInteger.valueOf(modulus));
        // n is now guaranteed to be < modulus, so n definitely fits into an int
        return n.intValue();
    }

    private static int powerModFast(int base, int exponent, int modulus) {
        long result;
        if (exponent == 0) {
            result = 1;
        } else if (exponent == 1) {
            result = base;
        } else if (exponent % 2 == 0) { // exponent is even
            // successive-squaring trick: this makes the runtime O(log n)
            result = powerModFast(base, exponent/2, modulus);
            result = result*result;
        } else { // exponent is odd
            result = base * powerModFast(base, exponent-1, modulus);
        }
        return (int) (result % modulus);
    }
}
