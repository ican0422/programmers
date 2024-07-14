class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String s = "수박";
        
        for(int i = 0; i < n; i++) {
            sb.append(s.charAt(i % 2));
        }
        answer = sb.toString();
        
        return answer;
    }
}