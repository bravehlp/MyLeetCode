package $_231_power;
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
 * -2^31 <= n <= 2^31 - 1
 * @date 2021-05-30 14:37
 */
public class Solution {

    public boolean isPowerOfTwo(int n) {

        // 因题目中限定2为正数，则n必定也是正数
        if (n <= 0) {
            return false;
        }

        // 此处限定n的最大值为 (2^31 - 1)，则任何n应该都是2^31的整除数
        double biggest = Math.pow(2, 31);

        if (biggest % n == 0.0) {
            return true;
        }
        return false;
    }

}
