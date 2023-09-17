import static org.junit.Assert.*;

import org.junit.Test;

public class BalancedBracketsTest {
    String balancedParens = "(1)";
    String tooManyOpenParens = "((1";
    String tooManyOpenParens1 = "(1)(";
    String tooManyClosedParens = "(1))";
    String startClosedParens = ")(";
    String emptyString = "";
    String balancedAngleBrackets = "<<>>";
    String balancedComboBrackets = "<({})>";
    String mismatchedBrackets = "<({)}>";

    @Test
    public void testBalancedBrackets_balancedParens() {
        assertTrue(BalancedBrackets.balancedBrackets("(1)"));
    }

    @Test
    public void testBalancedBrackets_tooManyOpenParens() {
        assertFalse(BalancedBrackets.balancedBrackets("({1)"));
    }

    @Test
    public void testBalancedBrackets_tooManyClosedParens() {
        assertFalse(BalancedBrackets.balancedBrackets("({1})>"));
    }

    @Test
    public void testBalancedBrackets_startWithClosedParens() {
        assertFalse(BalancedBrackets.balancedBrackets(")("));
    }

    @Test
    public void testBalancedBrackets_emptyString() {
        assertTrue(BalancedBrackets.balancedBrackets(""));
    }

    @Test
    public void testBalancedBrackets_balancedComboBrackets() {
        assertTrue(BalancedBrackets.balancedBrackets("<({})>"));
    }

    @Test
    public void testBalancedBrackets_mismatchedBrackets() {
        assertTrue(BalancedBrackets.balancedBrackets("<({)}>"));
    }

}