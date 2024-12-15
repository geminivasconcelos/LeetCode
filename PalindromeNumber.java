/*
Given an integer x, return true if x is a
palindrome
, and false otherwise.



Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


Constraints:

-231 <= x <= 231 - 1
 */

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        String numStr = Integer.toString(x);
        char numArr[] = numStr.toCharArray();
        char[] numArrCopy = numArr.clone();

        for (int i = 0; i < numArrCopy.length; i++) {
            for (int j = 0; j < numArrCopy.length - i - 1; j++) {
                if (numArrCopy[j] < numArrCopy[j + 1]) {
                    char temp = numArrCopy[j];
                    numArrCopy[j] = numArrCopy[j + 1];
                    numArrCopy[j + 1] = temp;
                }
            }
        }
        int cont = 0;
        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArrCopy.length; j++) {
                if(numArr[i] == numArrCopy[j]){
                    cont++;
                    break;
                }
            }
        }

        if(cont == numArr.length){
            return true;
        }else{
            return false;
        }
    }
}
