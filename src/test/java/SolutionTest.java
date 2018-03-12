import org.junit.Test;

/**
 * This class is coded for testing.
 * @author KunPeng
 *         2018/1/5.
 */

public class SolutionTest {

    @Test
    public void test001TwoSum(){

    }

    @Test
    public void test007ReverseInteger(){
        int num1 = 1234567891;
        int num2 = 1534236469;
//        int num3 = 9646324351;

        $_007_reverse_integer.Solution solution = new $_007_reverse_integer.Solution();
        System.out.println(solution.reverse(num2));
    }

    @Test
    public void test009PalindromeNumber(){

        int num = -141;

        $009_palindrome_number.Solution solution = new $009_palindrome_number.Solution();
        System.out.println(solution.isPalindrome(num));


    }

}
