class Solution {
    public int solution(int hp) {
        // 장군 공격력 5
        int general = 5;
        // 병정 공격력 3
        int soldier = 3;
        // 일꾼 공격력 1
        int worker = 1;
        // 총 병력
        int troops = 0;
        
        // 적의 hp를 최소한의 병력으로 잡기
        // 장군을 최대한 사용
        troops += hp / general;
        // 나머지 체력
        hp %= general;
        
        // 병정을 최대한 사용
        troops += hp / soldier;
        hp %= soldier;
        
        // 일꾼 최대한 사용
        troops += hp / worker;
        
        int answer = troops;
        return answer;
    }
}