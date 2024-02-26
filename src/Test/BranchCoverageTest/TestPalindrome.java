package Test.BranchCoverageTest;

import Main.org.src.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPalindrome {

    @Test
    void IfItGetsToTheEndOfTheLoop(){
        Assertions.assertTrue(Palindrome.isPalindrome("karak"));
    }

    @Test
    void IfNotNullAndIInfJAndCharsInBothWaysDoNotMatch(){
        Assertions.assertFalse(Palindrome.isPalindrome("pop3"));
    }

    @Test
    void IfNotNullAndIInfJAndCharsInBothWaysMatch(){
        Assertions.assertFalse(Palindrome.isPalindrome("pop"));
    }

    @Test
    void IsPalindromeShouldThrowExeptionIfSIsNull(){
        Assertions.assertThrows(NullPointerException.class,()-> Palindrome.isPalindrome(null));
    }

}
