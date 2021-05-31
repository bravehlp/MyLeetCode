import org.junit.Test;

/**
 * This class is coded for testing.
 *
 * @author KunPeng
 * 2018/1/5.
 */

public class SolutionTest {

    @Test
    public void test001TwoSum() {

    }

    @Test
    public void test007ReverseInteger() {
        int num1 = 1234567891;
        int num2 = 1534236469;
//        int num3 = 9646324351;

        $_007_reverse_integer.Solution solution = new $_007_reverse_integer.Solution();
        System.out.println(solution.reverse(num2));
    }

    @Test
    public void test009PalindromeNumber() {

        int num = -141;

        $_009_palindrome_number.Solution solution = new $_009_palindrome_number.Solution();
        System.out.println(solution.isPalindrome(num));


    }

    @Test
    public void test231PowerOfTwo() {

        int num = -4;

        $_231_power_of_two.Solution solution = new $_231_power_of_two.Solution();
        System.out.println(solution.isPowerOfTwo(num));
    }

    @Test
    public void test342PowerOfFour() {

        int num = 32;
        $_342_power_of_four.Solution solution = new $_342_power_of_four.Solution();
        System.out.println(solution.isPowerOfFour(num));
    }



    @Test
    public void test461HammingDistance() {

        int num1 = 12;
        int num2 = 19;

        $_461_hamming_distance.Solution solution = new $_461_hamming_distance.Solution();
        System.out.println(solution.hammingDistance(num1, num2));


    }

    @Test
    public void test477HammingDistanceTotal() {

        int num1 = 14;
        int num2 = 4;
        int num3 = 4;
        int[] nums = {num1, num2, num3};

        $_477_hamming_distance_total.Solution solution = new $_477_hamming_distance_total.Solution();
        System.out.println(solution.totalHammingDistance(nums));


    }

}
