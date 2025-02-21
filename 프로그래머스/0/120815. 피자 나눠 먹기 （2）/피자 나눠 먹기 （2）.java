class Solution {
    public int solution(int n) {
        int a = n;
        int b = 6;
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        int answer = (n * 6) / a / 6;
        return answer;
    }
}