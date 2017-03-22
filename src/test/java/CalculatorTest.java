import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertEquals;


public class CalculatorTest {

    @BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
    }

    @Test(groups = {"functest"})
    public void testAddPass() {
        // assertEquals(String message, long expected, long actual)
        assertEquals("error in add()",  3, Calculator.add(1, 2));
        assertEquals("error in add()", -3, Calculator.add(-1, -2));
        assertEquals("error in add()",  9, Calculator.add(9, 0));
    }

    @Test(groups = {"functest"})
    public void testAddFail() {
        // assertNotEquals(String message, long expected, long actual)
        assertNotEquals(0, Calculator.add(1, 2), "error in add()");
    }

    @Test(groups = {"functest"})
    public void testSubPass() {
        // assertEquals(String message, long expected, long actual)
        assertEquals("error in sub()",  3, Calculator.sub(5, 2));
        assertEquals("error in sub()", -3, Calculator.sub(-5, -2));
        assertEquals("error in sub()",  9, Calculator.sub(9, 0));
    }

    @Test(groups = {"functest"})
    public void testSubFail() {
        // assertNotEquals(String message, long expected, long actual)
        assertNotEquals(0, Calculator.sub(2, 1), "error in sub()");
    }

    @Test(groups = {"functest"})
    public void testMulPass() {
        // assertEquals(String message, long expected, long actual)
        assertEquals("error in mul()",  6, Calculator.mul(3, 2));
        assertEquals("error in mul()", 6, Calculator.mul(-3, -2));
        assertEquals("error in mul()", -6, Calculator.mul(-3, 2));
        assertEquals("error in mul()",  0, Calculator.mul(9, 0));
    }

    @Test(groups = {"functest"})
    public void testMulFail() {
        // assertNotEquals(String message, long expected, long actual)
        assertNotEquals(0, Calculator.mul(2, 1), "error in mul()");
    }

    @Test(groups = {"functest"})
    public void testDivIntPass() {
        // assertEquals(String message, long expected, long actual)
        assertEquals("error in divInt()",  3, Calculator.divInt(6, 2));
        assertEquals("error in divInt()", 3, Calculator.divInt(-6, -2));
        assertEquals("error in divInt()", -3, Calculator.divInt(-6, 2));
        try{
            assertEquals("error in divInt()", Calculator.divInt(6, 0));
            Assert.fail( "Should have thrown an exception" );
        }
        catch (Exception e){
            String expectedMessage = "Cannot divide by 0!";
            Assert.assertEquals(expectedMessage, e.getMessage());
        }
    }

    @Test(groups = {"functest"})
    public void testDivIntFail() {
        // assertNotEquals(String message, long expected, long actual)
        assertNotEquals(0, Calculator.divInt(2, 1), "error in divInt()");
    }

    @Test(groups = {"functest"})
    public void testDivRealPass() {
        // assertEquals(String message, long expected, long actual)
        assertEquals("error in divReal()",  2.5, Calculator.divReal(5, 2));
        assertEquals("error in divReal()", 2.5, Calculator.divReal(-5, -2));
        assertEquals("error in divReal()", -2.5, Calculator.divReal(-5, 2));
        try{
            assertEquals("error in divReal()", Calculator.divReal(5, 0));
            Assert.fail( "Should have thrown an exception" );
        }
        catch (Exception e){
            String expectedMessage = "Cannot divide by 0!";
            Assert.assertEquals(expectedMessage, e.getMessage());
        }
    }

    @Test(groups = {"functest"})
    public void testDivRealFail() {
        // assertNotEquals(String message, long expected, long actual)
        assertNotEquals(0, Calculator.divReal(3, 1), "error in divReal()");
    }
}
