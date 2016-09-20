import static org.junit.Assert.*;

import org.junit.Test;

public class IntSetTest {
    
    //
    // Testing strategy:
    //
    // Partition for this.intersect(that) -> result:
    //
    //   this.size: 0, 1, >1
    //   that.size: 0, 1, >1
    //   result.size: 0, 1, >1
    //   this = that, this subset-of that, this superset-of that, none of the above
    //
    
    // This test covers this.size=1, that.size=1, result.size=0
    @Test
    public void resultIsEmptySet() {
        // this={5}, that={8}, result={}
    }
    
    // TODO: add test cases to cover the rest of the partitions, following the example above:
    //    - each test case should be an @Test method
    //    - comment before method says which partitions the test case covers
    //    - comment inside method is the test case, with actual values for this, that, result
    // You don't need to do a full Cartesian product, just cover every part.
}
