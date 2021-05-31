package $_342_power_of_four;
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
 * @Title: Solution.java
 * @Package $_342_power_of_four
 * @Description:
 * 给定一个整数，写一个函数来判断它是否是 4 的幂次方。如果是，返回 true ；否则，返回 false 。
 *
 * 整数 n 是 4 的幂次方需满足：存在整数 x 使得 n == 4^x
 * @version V1.0
 * @date 2021-05-31 15:33
 */
public class Solution {


    /**
     * 4的幂，肯定也是2的幂，只是比2的幂条件更多，因此可先判断是否是2的幂。
     *
     * n = 4^0 = (1)2
     * n = 4^1 = (100)2
     * n = 4^2 = (10000)2
     * n = 4^3 = (1000000)2
     * .
     * .
     * .
     * 观察发现4的幂中总会有偶数个0，且1只出现在偶数位置上（从右端数）；
     * 只要1不出现在偶数位置位置上，就不是4的幂。因此可以设置一个偶数位上都是1，奇数位都是0的二进制数。
     * standard = (01010101010101010101010101010101)2
     * 只要让n与此标准数做'与'运算，若结果为1，则为4的幂。
     *
     *
     *
     *
     *
     * @param n
     * @return
     */
    public boolean isPowerOfFour(int n) {

        // 判定正负
        if (n <= 0) {
            return false;
        }

        // 判断是否是2的幂
        boolean flagTwo = (n & (n-1)) == 0 ? true:false;
        if (!flagTwo){
            return false;
        }

        //
        int standard = 0b01010101010101010101010101010101;

        boolean result = (n & standard) == 1 ? true : false;


        return result;
    }

}
