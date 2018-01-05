package $_007_reverse_integer;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *             Input: 123
 *             Output: 321
 * Example 2:
 *             Input: -123
 *             Output: -321
 * Example 3:
 *             Input: 120
 *             Output: 21
 *
 * Note:
 * Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range.
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 *
 * @author KunPeng
 *         2017/11/13.
 */
public class Solution {

    public int reverse(int x) {

        //  use long to hold the result for judging if the reversed integer overflows or not
        long result = 0;

        try{
            while(x != 0){

                //  get the last number of the input number
                int num = x % 10;

                //  accumulate the result number with the number above
                result = result * 10 + num;

                //  judge if the reversed integer overflows or not
                if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
                    throw new Exception();
                }

                //  reduce the digit number of the input number
                x = x / 10;

            }
        }catch (Exception e){
            result = 0;
        }

        return (int) result;

    }

}
