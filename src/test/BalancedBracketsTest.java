package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void oneBracketWithStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[test]"));
    }
    @Test
    public void noStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void curlyBracesreturnsTrue() {
        assertTrue((BalancedBrackets.hasBalancedBrackets("{}")));
    }

    @Test
    public void wordNoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("word"));
    }

    @Test
    public void mismatchedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{{]"));
    }

    @Test
    public void oneLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void oneRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void stringAndOneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch["));
    }

    @Test
    public void reversedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }


}
