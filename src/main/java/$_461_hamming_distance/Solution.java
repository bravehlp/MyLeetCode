package $_461_hamming_distance;
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
 * @Package $_461_hamming_distance
 * @Description: 计算两数间的汉明距离
 * @date 2021-05-28 16:29
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        /*
         * 两数字的汉明距离，即为两数字做异或后，结果的二进制形式中1的个数。
         * JDK中本身有统计某数字二进制形式1的个数方法：Integer.bitCount(x ^ y);
         */

        // 异或操作
        int xor = x ^ y;

        // 1的数量
        int oneCount = 0;

        while (xor > 0){
            /*
             * xor & 1，即为xor二进制下最后一位与1做‘位与’操作：
             *          若 最后一位是 1，则 xor & 1 = 1；
             *          若 最后一位是 0，则 xor & 1 = 0。
             * 任何数字与 1 做 '位与'运算，可检测此数字的二进制最后一位是否是1。
             */
            oneCount = oneCount + (xor & 1);

            // 右移一位，把刚统计完的最后一位舍掉
            xor = xor >> 1;
        }

        return oneCount;
    }
}
