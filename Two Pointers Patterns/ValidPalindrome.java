/*

problem: https://leetcode.com/problems/valid-palindrome/

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
TC : O(n)
SP : O(1)
*/ 

class ValidPalindrome {
    public boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() -1;

        while (i < j) {

            char left = s.charAt(i);
            char right= s.charAt(j);

            if (!Character.isLetterOrDigit(left)) {
                i = i + 1;
                continue;
            }
            if (!Character.isLetterOrDigit(right)) {
                j = j - 1;
                continue;
            }

            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            }

            i = i + 1;
            j = j - 1;
        }
        return true;

          
    }
}