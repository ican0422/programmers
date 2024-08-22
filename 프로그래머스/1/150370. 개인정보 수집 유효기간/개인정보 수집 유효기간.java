import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
         // 오늘 날짜를 날짜 형식으로 변환
        int todayDays = toDays(today);
        
        // 약관 종류와 유효기간을 맵에 저장
        Map<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] parts = term.split(" ");
            String type = parts[0];
            int duration = Integer.parseInt(parts[1]) * 28; // 유효기간을 일수로 변환
            termMap.put(type, duration);
        }
        
        List<Integer> expiredPrivacies = new ArrayList<>();
        
        // 각 개인정보를 확인
        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");
            String date = parts[0];
            String type = parts[1];
            
            int collectedDays = toDays(date);
            int expirationDays = collectedDays + termMap.get(type); // 만료일 계산
            
            // 만료일이 오늘 날짜보다 작거나 같으면 파기해야 함
            if (expirationDays <= todayDays) {
                expiredPrivacies.add(i + 1); // 번호는 1부터 시작하므로 +1
            }
        }
        
        // 결과를 배열로 변환
        return expiredPrivacies.stream().mapToInt(i -> i).toArray();
    }
    
    // 날짜 문자열을 일수로 변환하는 함수
    private int toDays(String date) {
        String[] parts = date.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        // 연도 기준으로 일수 계산
        return (year * 12 * 28) + ((month - 1) * 28) + day;
    }
}