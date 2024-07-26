class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(Character.isUpperCase(c)){
                char ch = (char) ((c - 'A' + n) % 26 + 'A');
                answer.append(ch);
            } else if(Character.isLowerCase(c)){
                char ch = (char) ((c - 'a' + n) % 26 + 'a');
                answer.append(ch);
            } else {
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}