package $_009_palindrome_number;

/**
 * @author KunPeng
 * @version V1.0
 * @Title: Solution.java
 * @Package $009_palindrome_number
 * @Description:  Determine whether an integer is a palindrome. Do this without extra space.
 * @date 2018-03-12 12:05
 */
public class Solution {
	public boolean isPalindrome(int x) {

		//  the number is zero, the result is true
		if (x == 0){
			return true;
		}

		/*
		 * transform the number to a character string, and then use a char array to deal with the original number
		 */
		String numStr = String.valueOf(x);
		char[] numChars = numStr.toCharArray();

		/*
		 * iterate the numChars by inverted order and combine the elements to a new character string
		 */
		StringBuilder invertedNumStr = new StringBuilder("");
		for (int i = numChars.length - 1; i >= 0; i--){
			invertedNumStr = invertedNumStr.append(numChars[i]);
		}

		/*
		 * judge
		 */
		if (numStr.equals(invertedNumStr.toString())){
			return true;
		}

		return false;
	}
}
