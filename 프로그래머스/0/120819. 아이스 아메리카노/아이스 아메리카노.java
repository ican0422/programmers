class Solution {
    public int[] solution(int money) {
        // 아메리카노 한잔 5,500원
        // money에 따라서 몇 잔을 마실 수 있는지, 잔돈은 얼마 남는지 확인
        // 해당 값을 배열을 통한 리턴
        
        int iceCoffee = 5500;
        int buy = 0;
        while (money >= iceCoffee) {
            buy += 1;
            money = money - iceCoffee;
        }
        
        int[] answer = {buy, money};
        return answer;
    }
}