class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder answer = new StringBuilder();
        int len = overwrite_string.length() + s;
        for (char c : my_string.toCharArray()) {
            answer.append(c);
        }
        // 1. 본 문자열 9자리, 바꿀 문자열 6자리 , 2부터 시작 8에서 멈춘다.
        // 2. 본 문자열 13자리, 바꿀 문자열 6자리, 7부터 시작 13에서 멈춘다.
        answer.replace(s, len, overwrite_string);
        return answer.toString();
    }
}