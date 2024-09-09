class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String num1 = "";
        String num2 = "";
        for (int n : num_list) {
            if (n % 2 == 0) {
                num1 += Integer.toString(n);
            }
            if (n % 2 == 1) {
                num2 += Integer.toString(n);
            }
        }
        answer = Integer.parseInt(num1) + Integer.parseInt(num2);
        return answer;
    }
}