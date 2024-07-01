class Solution {
    public int solution(int n) {
        int answer = 0;
        if(0 >= n || n > 1000){
            System.out.println("n 값이 0이하이거나 1000을 초과 하였습니다.");
        }
        for(int i = 2; i <= n; i += 2){
            answer += i;
        }
        return answer;
    }
}