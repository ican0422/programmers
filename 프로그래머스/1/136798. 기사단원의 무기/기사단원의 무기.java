class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            int divisorCount = getDivisorCount(i);
            
            if (divisorCount > limit) {
                answer += power;
            } else {
                answer += divisorCount;
            }
        }
        return answer;
    }
    
    private static int getDivisorCount(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                count++;
                if (i != n / i) {
                    count++;
                }
            }
        }
        return count;
    }
}