class Solution {
    public int solution(long num) {
        int answer = 0;
        
        while (num != 1){
            if(answer >= 500){
               return answer = -1;
            }
            if(num % 2 == 0){
                num /= 2;
            } else if(num == 1){
                answer = 0;
            } else {
                num = num * 3 + 1;
            }
            answer ++;
        }
        return answer;
    }
}