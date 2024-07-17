import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArr = s.toCharArray();
        
        Arrays.sort(charArr);
        
        StringBuilder sortString = new StringBuilder(new String(charArr));
        sortString.reverse();
        answer = sortString.toString();
        
        return answer;
    }
}