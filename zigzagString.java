/**
 * 6. Zigzag Conversion
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"
 */



public class zigzagString {
    public static String convert(String s, int n){
        if(n==1){
            return s;
        }
        int j=0;
        Boolean down=false,up=true;
        String[] sr  = new String[n];
        for(int i=0;i<s.length();i++){
            if(sr[j]==null){
                sr[j]="";
            }
            // System.out.println("inserting "+s.charAt(i)+" at location "+j);
            // if(s.charAt(i)!=null){
            sr[j] = sr[j]+s.charAt(i);
            // }
            // System.out.println("resultant sr at "+j%n+" location : "+sr[j%n]);
            if(j==n-1||j==0){
                down=!down;
                up=!up;
            }
            if(down){
                j++;
            }else{
                j--;
            }
        }
        String result =sr[0];
            for(int i=1;i<n;i++){
                if(sr[i]!=null)
                    result = result+sr[i];
            }
            return result;
    }
    public static void main(String[] arg){
        System.out.println(convert("PAYPALISHIRING",3).equals("PAHNAPLSIIGYIR"));
        System.out.println(convert("PAYPALISHIRING",4).equals("PINALSIGYAHRPI"));
        System.out.println(convert("A",2));
    }
}
