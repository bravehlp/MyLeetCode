package $_001_two_sum;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * @author KunPeng
 *         2018/1/5.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {

        //  the result to load the nums' index
        int[] result = null;

        //  create a empty List to load the Integer element from the Given array
        List<Integer> numList = new ArrayList<>();

        /*
         * Adds all of the specified elements from array to ArrayList.
         * We can use java.util.Collections.addAll(numSet, nums) to do this, but I find we can't use it on LeetCode，so I have to use a loop to do this.
         */
        for (int i = 0; i < nums.length; i++) {
            numList.add(i, Integer.valueOf(nums[i]));
        }

        for (int num1Index = 0; num1Index < numList.size(); num1Index++){

            int num1 = numList.get(num1Index);

            //  get another num
            int num2 = target - num1;

            /*
             * use the method 'contains()' in List to judge if the 'num2' exist in the List or not.
             */
            if(numList.contains(num2)){

                int num2Index = numList.indexOf(num2);

                if(num2 == num1 && num1Index == num2Index){  //  we can not use the same element twice
                    continue;
                }

                //  the little index should be on the first position
                if (num1Index < num2Index){
                    result = new int[]{num1Index, num2Index};
                }else {
                    result = new int[]{num2Index, num1Index};
                }

                break;
            }  //  end if

        }  //  end for
        return result;


    }
}
