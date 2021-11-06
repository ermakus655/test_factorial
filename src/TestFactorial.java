import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFactorial {
    @Test
    public void test_factorial(){
    assertEquals(Factorial.getFactorial(5),120);
    }
}
