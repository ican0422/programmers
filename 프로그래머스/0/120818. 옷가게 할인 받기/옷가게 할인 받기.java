class Solution {
    public int solution(int price) {
        double discount = 0;
        int answer = price;
        // 10만원 이상
        if (price >= 100000 && price < 300000 && price < 500000) {
            discount = 0.05;
            answer = (int) (price - (price * discount));
        }
        
        // 30만원 이상
        if (price >= 300000 && price < 500000) {
            discount = 0.10;
            answer = (int) (price - (price * discount));
        }
        
        // 50만원 이상
        if (price >= 500000) {
            discount = 0.20;
            answer = (int) (price - (price * discount));
        }
        return answer;
    }
}