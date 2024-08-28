class Solution {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        char[] a1 = str1.toCharArray();
        char[] b1 = str2.toCharArray();
        for (int i = 0; i < str1.length(); i++) {
            answer.append(a1[i]);
            for (int j = 0; j < 1; j++) {
                answer.append(b1[i]);
            }
        }
        return answer.toString();
    }
}