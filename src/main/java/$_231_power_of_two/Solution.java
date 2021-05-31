package $_231_power_of_two;
/**
 * ━━━━━━神兽出没━━━━━━
 * 　　 ┏┓     ┏┓
 * 　　┏┛┻━━━━━┛┻┓
 * 　　┃　　　　　 ┃
 * 　　┃　　━　　　┃
 * 　　┃　┳┛　┗┳  ┃
 * 　　┃　　　　　 ┃
 * 　　┃　　┻　　　┃
 * 　　┃　　　　　 ┃
 * 　　┗━┓　　　┏━┛　Code is far away from bug with the animal protecting
 * 　　　 ┃　　　┃    神兽保佑,代码无bug
 * 　　　　┃　　　┃
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　┣┓
 * 　　　　┃　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　 ┃┫┫ ┃┫┫
 * 　　　　 ┗┻┛ ┗┻┛
 * <p>
 * ━━━━━━感觉萌萌哒━━━━━━
 */

/**
 * @version V1.0
 * @Title: Solution.java
 * @Package $_231_power
 * @Description: 给一个整数 n，判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
 *
 * 如果存在一个整数 x 使得 n == 2^x ，则认为 n 是 2 的幂次方。
 *
 * 提示：-2^31 <= n <= 2^31 - 1
 *
 * @date 2021-05-30 14:37
 */
public class Solution {


    /**
     * 方法一：
     * 从'位'运算的角度思考问题。
     *
     * n = 2^0 = (1)2
     * n = 2^1 = (10)2
     * n = 2^2 = (100)2
     * n = 2^3 = (1000)2
     * .
     * .
     * .
     * 观察发现，每个数都是只有一个1，且出现在高位，其余全部为0。若存在一个数，使得高位为0，其余位1，则两个数做'与'运算即为0。
     * 如：
     * (0)2
     * (01)2
     * (011)2
     * (0111)2
     * .
     * .
     * .
     * 这些数刚好为2的幂的前一个数，即为 n-1。
     *
     *
     *
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n) {

        // 因题目中限定2为正数，则n必定也是正数
        if (n <= 0) {
            return false;
        }

        boolean flag = (n & (n-1)) == 0 ? true:false;

        return flag;
    }

    /**
     * 方法二：
     * 此方法为取巧，此处限定n的最大值为 (2^31 - 1)，则任何n应该都是2^31的整除数。
     * 只要用 2^31 能否被n整除即可，若整除则必然是2的幂。
     *
     * @param n
     * @return
     */
    public boolean isPowerOfTwo1(int n) {

        // 因题目中限定2为正数，则n必定也是正数
        if (n <= 0) {
            return false;
        }

        // 此处限定n的最大值为 2^31
        double biggest = Math.pow(2, 31);

        if (biggest % n == 0.0) {
            return true;
        }
        return false;
    }

}
