class Solution {
    public int solution(int n, int k) {
        // 양꼬치 1인분 12,000원
        // 음료수 2,000원
        // 양꼬치 10인분 당 음료 1개 서비스
        
        // 양꼬치
        int lamb = 12000;
        // 음료
        int beverage = 2000;
        
        // 음료 서비스
        int person = n / 10;
        if (person >= 1) {
            k = k - person;
        }
        
        // 계산
        int price = (n * lamb) + (k * beverage);        
        int answer = price;
        return answer;
    }
}