/**
 * 10. Regular Expression Matching
Hard
Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

'.' Matches any single character.​​​​
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).

 

Example 1:

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
Example 2:

Input: s = "aa", p = "a*"
Output: true
Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
Example 3:

Input: s = "ab", p = ".*"
Output: true
Explanation: ".*" means "zero or more (*) of any character (.)".
 */



public class patternmatching {
    public static boolean isMatch(String s, String p) {
        if(s[i]!=p[j]){
            return false;
        }
    }

    public static void main(String[] arg){
        System.out.println(isMatch("",".*c"));
    }
}
