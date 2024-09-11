class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char[] ch = control.toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'w') {
                n += 1;
            }
            if (ch[i] == 's') {
                n -= 1;
            }
            if (ch[i] == 'd') {
                n += 10;
            }
            if (ch[i] == 'a') {
                n -= 10;
            }
        }
        answer = n;
        
        return answer;
    }
}