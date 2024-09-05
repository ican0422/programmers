class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int c = 0;
        // 1 2 3 4 5
        for (int i = 0; i < included.length; i++) {
            if (i == 0) {
                c += a;
            } else {
                c += d;
            }
            if (included[i]) {
                answer += c;
            }
        }
        // 3 7 11 15 19
        // 3 + 15 + 19
        return answer;
    }
}