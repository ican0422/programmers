class Solution {
    public int solution(int num1, int num2) {
        int answer = num1 - num2;
        
        if (answer < -50000) {
            System.out.println("-50000 미만입니다.");
        } else if (answer > 50000){
            System.out.println("50000 이상입니다.");
        }
        return answer;
    }
}