package Test.LineCoverageTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Main.org.src.Palindrome;
public class TestPalindrome {

    @Test
    void IsPalindromeShouldReturnTrueIfSIsPalindrome(){
        Assertions.assertTrue(Palindrome.isPalindrome("karak"));
    }

    @Test
    void IsPalindromeShouldReturnFalseIfSIsNotPalindrome(){
        Assertions.assertFalse(Palindrome.isPalindrome("pop3"));
    }

    @Test
    void IsPalindromeShouldThrowExeptionIfSIsNull(){
        Assertions.assertThrows(NullPointerException.class,()-> Palindrome.isPalindrome(null));
    }

}
