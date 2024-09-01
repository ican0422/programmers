class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        char[] c = code.toCharArray();
        int mode = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '1') {
                mode = 1 - mode;
            } else {
                if ((mode == 0 && i % 2 == 0) || (mode == 1 && i % 2 == 1)) {
                    answer.append(c[i]);
                }
            }
        }
        
        if (answer.length() == 0) {
            answer.append("EMPTY");
        }
        
        return answer.toString();
    }
}