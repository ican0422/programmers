class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        // a를 주면 b병을 받는다. 빈 병 n개를 가져다 주면 몇병을 받을 수 있는가
        // 보유 중인 빈 병이 a개 미만이면, 추가적으로 빈병을 받을 순 없다.
        // a = 마트에 받는 최소의 병
        // b = 빈 병 a개를 가져다 주면 마트가 주는 콜라 병 수
        // n = 가지고 있는 빈 병의 개수
        // c = 받은 콜라
        // r = 남은 병
        
        // 1번
        // 
        // answer += (n / a) * b
        // n = (n / a) + (n % a);
        
        // 2번
        // n - (n % a) = c
        // answer += n / a * b
        // n - c + (n % a) = n
        
        // 3번
        // n - (n % a) = c
        // answer += n / a * b
        // n - c + (n % a) = n
        
        // while 브레이크 조건 a > n 브레이크;
        while (n >= a){
            int newColras = (n / a) * b;
            int r = n % a;
            answer += newColras;
            n = newColras + r;
        }
        return answer;
    }
}