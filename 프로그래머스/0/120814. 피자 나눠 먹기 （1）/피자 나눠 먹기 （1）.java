class Solution {
    public int solution(int n) {
        int piece = 7;
        int answer = n / piece;
        if (!(n % piece == 0)) {
            answer += 1;
        }
        return answer;
    }
}