class Solution {
    public int solution(int n) {
        int answer = 0;
        // n이 홀수면 홀수인 모든 양의 정수의 합을 return
        if (n % 2 == 1) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    answer += i;
                }
            }
        }
        // n이 짝수면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return
        // 제곱 n * n
        if (n % 2 == 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    answer += i * i;
                }
            }
        }
        return answer;
    }
}