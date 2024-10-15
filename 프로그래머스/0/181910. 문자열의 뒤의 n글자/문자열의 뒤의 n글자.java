class Solution {
    public String solution(String my_string, int n) {
        int s = my_string.length() - n; // 14 - 11 = 3
        
        String answer = my_string.substring(s, s+n);
        
        return answer;
    }
}