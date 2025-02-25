class Solution {
    public String solution(String my_string, int n) {
        char c;
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            c = my_string.charAt(i);
            for (int j = 1; j <= n; j++) {
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}