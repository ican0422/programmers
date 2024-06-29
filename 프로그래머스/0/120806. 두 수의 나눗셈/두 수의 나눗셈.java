class Solution {
    public int solution(int num1, int num2) {
        double answer = 0;
        if(num1 < 0 || num1 > 100 || num2 < 0 || num2 > 100){
            System.out.println("num1 혹은 num2 중에 0 미만이거나 100을 초과했습니다.");
        } else {
            answer =  (double)num1 / num2 * 1000;
        }
        return (int)answer;
    }
}