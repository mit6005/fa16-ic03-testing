import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PowerModTest {
    
    //
    // Testing strategy:
    //
    // Partition the function's inputs into:
    // base is 0, 1, >1
    // exponent is 0, 1, >1
    // modulus is 1, >1
    // base<modulus, base=modulus, base>modulus
    
    // This test covers base=0, exp=0
    @Test
    public void test0To0thPower() {
        assertEquals(1, PowerMod.powerMod(0, 0, 5));
    }
    
    // This test covers base=0
    @Test
    public void testBase0() {
        assertEquals(0, PowerMod.powerMod(0, 2, 7));
    }
    
    // This test covers base=1
    @Test
    public void testBase1() {
        assertEquals(1, PowerMod.powerMod(1, 8, 3));
    }
    
    // This test covers exp=0
    @Test
    public void test0thPower() {
        assertEquals(1, PowerMod.powerMod(3, 0, 4));
    }
    
    // This test covers exp=1
    @Test
    public void test1stPower() {
        assertEquals(3, PowerMod.powerMod(28, 1, 5));
    }
    
    // This test covers modulus=1
    @Test
    public void testModulus1() {
        assertEquals(0, PowerMod.powerMod(2, 4, 1));
    }
    
    // This test covers base>1, exp>1, base<modulus
    @Test
    public void testNthPowerLargeModulus() {
        assertEquals(4, PowerMod.powerMod(3, 4, 7));
    }
    
    // This test covers base>1, exp>1, base=modulus
    @Test
    public void testNthPowerBaseEqualsModulus() {
        assertEquals(0, PowerMod.powerMod(7, 4, 7));
    }
    
    // This test covers base>1, exp>1, base>modulus
    @Test
    public void testNthPowerSmallModulus() {
        assertEquals(4, PowerMod.powerMod(12, 2, 5));
    }
    
}
